package Java.Advanced.Paradigma;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        var valor = 20;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        System.out.println(retornarDobro.apply(valor)); //Retorna o dobro (40)
        System.out.println(valor);//Não altera o valor
    }
}
