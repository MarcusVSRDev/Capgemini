package Java.Advanced.Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FuturoExemplo {
    private static  final ExecutorService threadPool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        casa.obterAfazeresDaCasa().forEach( atividade -> threadPool.execute(() -> atividade.realizar()));
        threadPool.shutdown();
    }
}

class Casa{
    private List<Comodo> comodos;

    Casa(Comodo... comodos){
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAfazeresDaCasa() {
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades)-> {
                    pivo.addAll(atividades);
                    return pivo;
                });
        }
    }

interface Atividade{
    void realizar();
}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo{
    @Override
    List<Atividade> obterAfazeresDoComodo(){
        return Arrays.asList(
                this::arrumarACasa,
                this::varrerOQuarto,
                this::arrumarGuardaRoupas
        );
    }

    private void arrumarGuardaRoupas() {
        System.out.println("Arrumar o guarda roupas");
    }
    private void varrerOQuarto(){
        System.out.println("Varrer o Quato");
    }
    private void arrumarACasa(){
        System.out.println("Arrumar a casa");
    }
}


