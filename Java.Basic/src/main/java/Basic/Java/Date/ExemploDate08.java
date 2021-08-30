package Basic.Java.Date;

import java.text.DateFormat;
import java.util.Date;

public class ExemploDate08 {
    public static void main(String[] args) {
        Date agora = new Date();

        String dateToSr = DateFormat.getInstance().format(agora);

        System.out.println(dateToSr);
        //29/08/2021 22:57

        dateToSr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);

        System.out.println(dateToSr);
        //29 de agosto de 2021 22:57

        dateToSr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);

        System.out.println(dateToSr);
        //29 de agosto de 2021 22:58:57 BRT
    }
}
