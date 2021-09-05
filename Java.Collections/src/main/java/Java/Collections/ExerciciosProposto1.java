package Java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
 */
public class ExerciciosProposto1 {
    public static void main(String[] args) {
        List<TemperaturaMensal> temperatura = new ArrayList<>(){{
            add(new TemperaturaMensal("1 - Janeiro ", 28.1));
            add(new TemperaturaMensal("2 - Fevereiro ", 26.6));
            add(new TemperaturaMensal("3 - Março ", 25.9));
            add(new TemperaturaMensal("4 - Abril ", 25d));
            add(new TemperaturaMensal("5 - Maio ", 24.6));
            add(new TemperaturaMensal("6 - Junho ", 24.5));
        }};

        Iterator<TemperaturaMensal> iterator = temperatura.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next().getTemperatura();
            soma += next;
        }
        Double media = soma/temperatura.size();
        System.out.println("Média Semestral: " + media);

        System.out.println("Temperaturas acima da média semestral: ");
        Iterator<TemperaturaMensal> iterator1 = temperatura.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next().getTemperatura();
            if (next < media) {
                iterator1.remove();
            }
        }
        System.out.println(temperatura);
    }
}

class TemperaturaMensal {
    private Double temperatura;
    private String mes;

    @Override
    public String toString() {
        return "TemperaturaMensal{" +
                "temperatura=" + temperatura +
                ", mes='" + mes + '\'' +
                '}';
    }

    TemperaturaMensal(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public String getMes() {
        return mes;
    }
}
/* GABARITO

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<Double>();

        double soma = 0.0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }

        double mediaTemperaturasSemenstral = soma/temperaturasSemestral.size();

        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "oC");
        System.out.println("----------");

        for (Double temp : temperaturasSemestral) {
            if(temp > mediaTemperaturasSemenstral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
 */
