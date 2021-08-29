package IDEs;

import IDEs.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato(null, null, null);
        Livro livro1 = new Livro("Harry Potter", 350);

        System.out.println(livro1);
        System.out.println(gato);   

        /*int a = 5;
        int b = 2;
        System.out.println("Hello World" + (a + b));*/
    }
}

class Livro{
    private String Nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        Nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
}

