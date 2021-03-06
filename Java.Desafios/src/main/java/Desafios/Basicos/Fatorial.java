package Desafios.Basicos;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Fatorial {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fatorialComMemoization(n));
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
