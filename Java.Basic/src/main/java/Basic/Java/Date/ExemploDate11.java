package Basic.Java.Date;

import java.time.LocalDate;

public class ExemploDate11 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        //2021-08-29
        System.out.println(ontem);
        //2021-08-28
    }
}
