package IDEs.Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int Soma = soma(a,b);
		int Subtracao = subtracao(a, b);
		double Divisao = divisao(a, b);
		int Multiplicacao = multiplicacao(a, b);
		
		System.out.println("A Soma �: " + Soma);
		System.out.println("A Subtra��o �: " + Subtracao);
		System.out.println("A Divis�o �: " + Divisao);
		System.out.println("A Multiplica��o �: " + Multiplicacao);
	}

	public static int soma(int a, int b) {
		int Soma = a + b;
		return Soma;
	}

	public static int subtracao(int a, int b) {
		int Subtracao = a - b;
		return Subtracao;
	}

	public static double divisao(double a, double b) {
		double Divisao = a / b;
		return Divisao;
	}

	public static int multiplicacao(int a, int b) {
		int Multiplicacao = a * b;
		return Multiplicacao;
	}
}
