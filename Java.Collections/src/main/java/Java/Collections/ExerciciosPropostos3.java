package Java.Collections;

/*Crie um conjunto contendo as cores do arco-íris e:

        Exiba todas as cores uma abaixo da outra

        A quantidade de cores que o arco-íris tem

        Exiba as cores em ordem alfabética

        Exiba as cores na ordem inversa da que foi informada

        Exiba todas as cores que começam com a letra v

        Remova todas as cores que não começam com a letra v

        Limpe o conjunto

        Confira se o conjunto está vazio*/

import java.util.*;

public class ExerciciosPropostos3 {
    public static void main(String[] args) {
        Set<Cores> arcoIris = new HashSet<>(){{
            add(new Cores("Vermelho"));
            add(new Cores("Azul"));
            add(new Cores("Verde"));
            add(new Cores("Violeta"));
            add(new Cores("Amarelo"));
            add(new Cores("Laranja"));
            add(new Cores("Anil"));
        }};
        System.out.println("Exiba todas as cores uma abaixo da outra ");
        for (Cores cor: arcoIris) System.out.println(cor.getCor());

        System.out.println("A quantidade de cores que o arco-íris tem: " + arcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética");
        Set<Cores> arcoIris1 = new TreeSet<>(arcoIris);
        for (Cores cor: arcoIris1) System.out.println(cor.getCor());

        System.out.println("Exiba as cores na ordem inversa da que foi informada");
        Set<Cores> arcoIris2 = new LinkedHashSet<>(){{
            add(new Cores("Vermelho"));
            add(new Cores("Azul"));
            add(new Cores("Verde"));
            add(new Cores("Violeta"));
            add(new Cores("Amarelo"));
            add(new Cores("Laranja"));
            add(new Cores("Anil"));
        }};
        for (Cores cor: arcoIris2) System.out.println(cor.getCor());

        //System.out.println("Exiba todas as cores que começam com a letra v");
        //Não respondido

        //System.out.println("Remova todas as cores que não começam com a letra v");
        //Não respondido

        System.out.println("Limpe o conjunto");
        arcoIris.clear();
        System.out.println(arcoIris);

        System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());
    }
}

class Cores implements Comparable<Cores>{
    final private String cor;

    Cores(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cores cores = (Cores) o;
        return Objects.equals(cor, cores.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    @Override
    public String toString() {
        return "cores{" +
                "cor='" + cor + '\'' +
                '}';
    }

    public String getCor() {
        return cor;
    }

    @Override
    public int compareTo(Cores c) {
        return this.getCor().compareTo(c.getCor());
    }
}

/*GABARITO


Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}*/
