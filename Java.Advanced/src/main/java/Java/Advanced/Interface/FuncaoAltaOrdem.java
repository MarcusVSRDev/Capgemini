package Java.Advanced.Interface;

public class FuncaoAltaOrdem //Por parametro recebe outra função ou Ela retorna uma função
{
    public static void main(String[] args) {
        Calculo SOMA = (a, b) -> a + b;
        Calculo SUBTRACAO = (a, b) -> a - b;
        Calculo DIVISAO = (a, b) -> a / b;
        Calculo MULTIPLICACAO = (a, b) -> a * b;

        System.out.println(executarOperacao(SOMA, 1, 3));// 4
        System.out.println(executarOperacao(SUBTRACAO, 4, 3)); // 1
        System.out.println(executarOperacao(DIVISAO, 6, 3));// 2
        System.out.println(executarOperacao(MULTIPLICACAO, 1, 3)); // 3
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo{
    int calcular(int a, int b);
}
