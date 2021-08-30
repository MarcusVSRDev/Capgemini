package Basic.Java.Date;

import java.util.Calendar;

public class ExemploDate07 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //dom ago 29 22:14:21 BRT 2021

        System.out.printf("%tF\n", agora);
        //2021-08-29

        System.out.printf("%tD\n", agora);
        //08/29/21

        System.out.printf("%tr\n", agora);
        //10:14:21 PM

        System.out.printf("%tT\n", agora);
        //22:14:21
    }
}
