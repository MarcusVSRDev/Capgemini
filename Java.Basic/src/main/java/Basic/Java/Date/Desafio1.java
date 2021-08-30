package Basic.Java.Date;

import java.util.Date;

public class Desafio1 {
    public static void main(String[] args) {

        var Data = System.currentTimeMillis();
        System.out.println(Data);
        //1273971435332 (15 de Maio de 2010)

        var timeInMills = System.currentTimeMillis();
        System.out.println(timeInMills);
        //1018572873180 (Data Nascimento)

        Date dataPassado = new Date(1273971435332L);
        System.out.println(dataPassado);
        //Data a ser comparada

        Date dataNascimento = new Date(1018572873180L);
        System.out.println(dataNascimento);
        //Transforma em um objeto Date

        boolean isAfter = dataPassado.after(dataNascimento);
        System.out.println(isAfter);//True

        boolean isBefore = dataPassado.before(dataNascimento);
        System.out.println(isBefore);//False
    }
}
