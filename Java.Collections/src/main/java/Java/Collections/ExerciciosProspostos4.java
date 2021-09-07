package Java.Collections;
/*Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:

Ordem de Inserção

Ordem Natural (nome)

IDE

Ano de criação e nome

Nome, ano de criacao e IDE

Ao final, exiba as linguagens no console, um abaixo da outra.

 */

import java.util.*;

public class ExerciciosProspostos4 {
    public static void main(String[] args) {
        System.out.println("Ordem de Inserção");
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java ", 1991, " Intellij"));
            add(new LinguagemFavorita("Python ", 1990, " Visual Studio Code"));
            add(new LinguagemFavorita("Javascript ", 1995, " Visual Studio Code"));
        }};
        for (LinguagemFavorita linguagem: linguagens) System.out.println("Nome: " + linguagem.getNome() + "\nAno de criação: "+
                linguagem.getAnoDeCriacao() + "\nIDE: " + linguagem.getIDE() + "\n");

        System.out.println("Ordem Natural (nome)");
        Set<LinguagemFavorita> linguagens1 = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagem: linguagens1) System.out.println("Nome: " + linguagem.getNome() + "\nAno de criação: "+
                linguagem.getAnoDeCriacao() + "\nIDE: " + linguagem.getIDE() + "\n");

        System.out.println("IDE");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new ComparatorIDE());
        linguagens2.addAll(linguagens);
        for (LinguagemFavorita linguagem: linguagens2) System.out.println("Nome: " + linguagem.getNome() + "\nAno de criação: "+
                linguagem.getAnoDeCriacao() + "\nIDE: " + linguagem.getIDE() + "\n");

        System.out.println("Ano de criação e nome");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorCriacaoNome());
        linguagens3.addAll(linguagens);
        for (LinguagemFavorita linguagem: linguagens3) System.out.println("Nome: " + linguagem.getNome() + "\nAno de criação: "+
                linguagem.getAnoDeCriacao() + "\nIDE: " + linguagem.getIDE() + "\n");

        System.out.println("Nome, ano de criacao e IDE");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorIDECriacaoNome());
        linguagens4.addAll(linguagens);
        for (LinguagemFavorita linguagem: linguagens4) System.out.println("Nome: " + linguagem.getNome() + "\nAno de criação: "+
                linguagem.getAnoDeCriacao() + "\nIDE: " + linguagem.getIDE() + "\n");
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    final private String nome;
    final private Integer anoDeCriacao;
    final private String IDE;

    LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        IDE = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita linguagem = (LinguagemFavorita) o;
        return Objects.equals(nome, linguagem.nome) && Objects.equals(anoDeCriacao, linguagem.anoDeCriacao) && Objects.equals(IDE, linguagem.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, IDE);
    }

    @Override
    public int compareTo(LinguagemFavorita l) {
        return this.getNome().compareTo(l.getNome());
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int IDE = l1.getIDE().compareTo(l2.getIDE());
        if (IDE != 0) return IDE;
        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int AnoDeCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (AnoDeCriacao != 0) return AnoDeCriacao;
        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorIDECriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if(nome != 0) return nome;

        int criacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (criacao != 0) return criacao;

        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}

/*GABARITO


Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));

        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Python", 1991, "Pycharm"),
                        new LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
                        new LinguagemFavorita("Java", 1991, "Visual Studio Code")
                )
        );
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);

        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);

        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem);

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }*/
