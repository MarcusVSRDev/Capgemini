package Basic.Java.Date;

import java.util.Calendar;

public class Desafio02 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        agora.add(Calendar.DATE, 0);
        System.out.printf("%tc\n", agora);
        //Agora: dom ago 29 22:53:26 BRT 2021

        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 10);
        System.out.printf("%tc\n", vencimento);
        //Vencimento: qua set 08 22:53:26 BRT 2021

        boolean isAfter = agora.after(vencimento);//false
        boolean isWeekEnd = true;

        var dias = 10;

        if(isAfter){
            switch(agora.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.MONDAY:
                    isWeekEnd = false;
                case Calendar.SATURDAY:
                    isWeekEnd = false;
            }

            if (isWeekEnd){
                System.out.println("Você pode pagar Segunda-feira");
            }
            else{
                System.out.println("A conta expirou!");
            }

        }
        else{
            System.out.println("Faltam " + dias + " dias para a fatura expirar");
            --dias;
        }
    }
}
