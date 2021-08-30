package Basic.Java.Date;

import java.util.Calendar;

public class ExemploDate06 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("A data corrente é: " + agora.getTime());
        //A data corrente é: Sun Aug 29 22:05:57 BRT 2021

        agora.add(Calendar.DATE, 15);
        System.out.println("15 dias depois: " + agora.getTime());
        //15 dias depois: Mon Sep 13 22:05:57 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses e 15 dias depois: " + agora.getTime());
        //4 meses  e 15 dias depois: Thu Jan 13 22:05:57 BRT 2022

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos, 4 meses e 15 dias depois: " +agora.getTime());
        //2 anos, 4 meses e 15 dias depois: Sat Jan 13 22:05:57 BRT 2024
    }
}
