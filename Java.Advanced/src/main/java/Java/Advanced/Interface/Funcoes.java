package Java.Advanced.Interface;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converteStringParaInteiro = Integer::valueOf;
        System.out.println(retornarNomeAoContrario.apply("Marcus"));
        System.out.println(converteStringParaInteiro.apply("30"));
    }
}
