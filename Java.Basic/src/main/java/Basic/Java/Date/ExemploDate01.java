package Basic.Java.Date;

import java.util.Date;

public class ExemploDate01 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);

        Date dataNoFuturo = new Date(1613124807691L);

        //Comparando se a dataNoPassdo é posterior a dataNoFuturo

        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);

        //Comparando se a dataNoPassado é anterior a dataNoFuturo

        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
    }
}
