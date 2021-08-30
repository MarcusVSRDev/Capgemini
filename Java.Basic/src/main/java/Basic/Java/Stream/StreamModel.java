package Basic.Java.Stream;

import java.util.stream.IntStream;

public class StreamModel {
    public static void main(String[] args) {
            IntStream.of(1,2,3,4,5).forEach(n ->{
                System.out.println(n);
            });
            IntStream.range(0,3).forEach(n ->{
                System.out.println("Numero = " + n);
            });
        }

}

