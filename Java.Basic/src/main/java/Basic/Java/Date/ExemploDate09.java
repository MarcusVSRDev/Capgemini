package Basic.Java.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate09 {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat formatterHora = new SimpleDateFormat("HH:mm:ss:mmm");

        //Desafio: Converta a Data atual no formato "dd/MM/yyyy" e "HH:mm:ss:mmm"

        String horaFormatada = formatterHora.format(agora);

        System.out.println(horaFormatada);
        //23:04:05:004

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        //29/08/2021
    }
}
