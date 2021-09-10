package Java.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Dadas as seguintes informações sobre meus cachorros, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor)

 Cachorro 1 = nome: Night, idade: 9, cor: preto
 Cachorro 2 = nome: Malvo, idade: 10, cor: branco
 Cachorro 3 = nome: Hulk, idade: 10, cor: preto
 */
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Cachorro> meusCachorros = new ArrayList<>(){{
          add(new Cachorro("Night", "Preto", 9));
          add(new Cachorro("Malvo", "Branco", 10));//Troque o nome para Hulk ou Night para comparar o mesmo nome
          add(new Cachorro("Hulk", "Preto", 10));
        }};
        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusCachorros);

        System.out.println("--\tOrdem Aleatoria\t--");
        Collections.shuffle(meusCachorros);
        System.out.println(meusCachorros);

        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(meusCachorros);
        System.out.println(meusCachorros);

        System.out.println("--\tOrdem Idade\t--");
        meusCachorros.sort(new ComparatorIdade());
        System.out.println(meusCachorros);

        System.out.println("--\tOrdem Cor\t--");
        meusCachorros.sort(new ComparatorCor());
        System.out.println(meusCachorros);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        meusCachorros.sort(new ComparatorNomeCorIdade());
        System.out.println(meusCachorros);
    }
}

class Cachorro implements Comparable<Cachorro> {
    private String nome;
    private String cor;
    private Integer idade;

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public Cachorro(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    @Override
    public int compareTo(Cachorro cachorro) {
        return this.getNome().compareToIgnoreCase(cachorro.getNome());
    }
}

class ComparatorIdade implements Comparator<Cachorro>{

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}

class ComparatorCor implements Comparator<Cachorro>{

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Cachorro>{

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        int nome = c1.getNome().compareToIgnoreCase(c2.getNome());
        if (nome !=  0) return nome;

        int cor = c1.getCor().compareToIgnoreCase(c2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}