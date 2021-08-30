package Basic.Java.Date;

import java.time.LocalTime;

public class ExemploDate012 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        //23:13:57.829619700

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        //00:13:57.829619700
    }
}
