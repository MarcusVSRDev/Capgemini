package Java.Advanced.Paradigma;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        //Funcional
        BiPredicate<Integer, Integer> verificarSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;
        System.out.println(verificarSeEMaior.test(11,14));
        System.out.println(verificarSeEMaior.test(11, 14));
    }
}
