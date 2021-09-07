package Desafios.Basicos;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int soma = A+B;  //insira as variáveis corretamente

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
