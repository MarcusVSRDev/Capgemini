package Java.Advanced.Paradigma;

import java.util.HashMap;
import java.util.Map;

class FatorialMemoization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();
    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        long F = System.nanoTime();
        System.out.println("Fatorial 1" + (F-I)); //Tempo demorado para fazer 11296200 (Nanotime)

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        F = System.nanoTime();
        System.out.println("Fatorial 2 " + (F-I));//Tempo demorado para fazer 81400 (Nanotime)

    }

    public static Integer fatorialComMemoization (Integer value){
        if (value == 1){
            return value;
        } else {
            if (MAPA_FATORIAL.containsKey(value)){
                return MAPA_FATORIAL.get(value);
            } else{
              Integer resultado = value * fatorialComMemoization(value - 1);
              MAPA_FATORIAL.put(value, resultado);
              return resultado;
            }
        }
    }
}
