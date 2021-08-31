package Java.Advanced.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Marcus", "Vinicius", "Programador", "Java"};
        Integer[] numeros = {1, 2, 3, 4 ,5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosOsNomes(nomes);
        imprimirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Gerente do projeto");
        profissoes.add("Gerente de qualidade");
        profissoes.add("Testador");
        profissoes.add("Auxiliar");

            profissoes.stream()
                    .filter(profissao -> profissao.startsWith("Gerente"))
                    .forEach(System.out::println);
    }
    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimirFor = "";
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Marcus")){
                nomesParaImprimirFor+= "" + nomes[i];
            }
        }

        System.out.println(nomesParaImprimirFor);

        String nomesParaImprimirStream = Stream.of(nomes)
                .filter(Nomes -> Nomes.equals("Marcus"))
                .collect(Collectors.joining()); // String

        System.out.println(nomesParaImprimirStream);
    }

    public static void imprimirTodosOsNomes(String... nomes){
        for (String nome : nomes){
            System.out.println("Imprimido pelo for: " + nome);
        }
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach: " + nome));

        System.out.println();;
    }
    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros){
            System.out.println("Imprimido pelo for: " +numero * 2);
        }
        Stream.of(numeros).map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
