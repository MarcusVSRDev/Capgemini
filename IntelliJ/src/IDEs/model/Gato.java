package IDEs.model;

import java.util.Objects;

public class Gato {
    private String Nome;
    private String Cor;
    private Integer Idade;

    public Gato(String Nome, String Cor, Integer Idade) {
        this.Nome = Nome;
        this.Cor = Cor;
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public String getCor() {
        return Cor;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Nome.equals(gato.Nome) && Cor.equals(gato.Cor) && Idade.equals(gato.Idade);
    }


    public int hashCode() {
        return Objects.hash(Nome, Cor, Idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "Nome='" + Nome + '\'' +
                ", Cor='" + Cor + '\'' +
                ", Idade=" + Idade +
                '}';
    }
}