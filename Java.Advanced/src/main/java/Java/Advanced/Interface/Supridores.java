package Java.Advanced.Interface;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> instancia = Pessoa::new;
        System.out.println(instancia.get());
    }
}
class Pessoa{
    final private String nome;
    final private String idade;

    public Pessoa(){
        nome = "Marcus";
        idade = "19";
    }

    @Override
    public String toString(){
        return String.format("Nome: " + nome + "\n" + "Idade: " + idade);
    }
}
