package Java.Advanced.Paradigma;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSr = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSr.gerar("Marcus"));
    }
}
@FunctionalInterface
interface Funcao{
    String gerar(String valor);
}
