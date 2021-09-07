package Desafios.Basicos;

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int PROD = A * B;

        System.out.println("Prod = " + PROD);

        sc.close();
    }
}
