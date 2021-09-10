package Java.Collections.Map;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livros> livrosFavoritos = new HashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livros> livro: livrosFavoritos.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem inserção\t--");
        Map<String, Livros> ordemDeInsercao = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livros> ordem: ordemDeInsercao.entrySet()) {
            System.out.println(ordem.getKey() + " - " + ordem.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética (autores)\t--");
        Map<String, Livros> ordemAutores = new TreeMap<>(livrosFavoritos);
        for (Map.Entry<String, Livros> autores: ordemAutores.entrySet()) {
            System.out.println(autores.getKey() + " - " + autores.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética (nomes dos livros)\t--");
        Set<Map.Entry<String, Livros>> ordemNomeLivro = new TreeSet<>(new comparatorNome());
        ordemNomeLivro.addAll(livrosFavoritos.entrySet());
        for (Map.Entry<String, Livros> nomeLivro : ordemNomeLivro) {
            System.out.println(nomeLivro.getKey() + " - " + nomeLivro.getValue().getNome());
        }

        System.out.println("--\tOrdem número de páginas\t--");
        Set<Map.Entry<String, Livros>> ordemNumPaginas = new TreeSet<>(new comparatorNumPaginas());
        ordemNumPaginas.addAll(livrosFavoritos.entrySet());
        for (Map.Entry<String, Livros> numPaginas : ordemNumPaginas) {
            System.out.println(numPaginas.getKey() + numPaginas.getValue().getNome() + " - " + numPaginas.getValue().getNumPaginas());
        }

    }
}

class Livros{
    final private String nome;
    final private Integer numPaginas;

    Livros(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return Objects.equals(nome, livros.nome) && Objects.equals(numPaginas, livros.numPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPaginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

class comparatorNome implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class comparatorNumPaginas implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        int pag = l1.getValue().getNumPaginas().compareTo(l2.getValue().getNumPaginas());
        if (pag != 0) return pag;

        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}