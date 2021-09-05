package Java.Collections;
/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".
 */

import java.util.*;

public class ExercicioProposto2 {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima? (Sim/Não)");
        String resposta = texto.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Esteve no local do crime? (Sim/Não)");
        resposta = texto.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Mora perto da vítima? (Sim/Não)");
        resposta = texto.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Devia para a vítima? (Sim/Não)");
        resposta = texto.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Já trabalhou com a vítima? (Sim/Não)" );
        resposta = texto.next();
        respostas.add(resposta.toLowerCase());

        String sentenca = null;
        int i = 0;
        Iterator<String> iterator = respostas.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if (Objects.equals(next, "sim")){
                i += 1;
            }
            if (i == 2){
                sentenca = "Suspeito";
            }
            else if(i >= 3 && i < 5){
                sentenca = "Cúmplice";
            }
            else if(i == 5){
                sentenca = "Culpado";
            }
            else{
                sentenca = "Inocente";
            }

        }
        System.out.println("Você é: " + sentenca);
    }
}
/* GABARITO
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ExercicioProposto02 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}
 */