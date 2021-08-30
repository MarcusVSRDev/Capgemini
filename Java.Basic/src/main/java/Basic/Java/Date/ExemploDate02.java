package Basic.Java.Date;

import java.util.Date;

public class ExemploDate02 {
    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L);
        Date dataNoFuturo = new Date(1613124807691L);
        Date mesmaDataNoFuturo = new Date(1613124807691L);

        //Comparando se as datas são iguais

        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); //True

        //Comparando uma data com a outra

        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //Passado -> Futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //Futuro -> Passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //Datas equivalentes

        System.out.println(compareCase1); //-1
        System.out.println(compareCase2); // 1
        System.out.println(compareCase3); // 0
    }
}
