package Java.Collections.Map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = Gol - consumo = 14,4km/l
 modelo = Uno - consumo = 15,6 km/l
 modelo = Mobi - consumo = 16,1 km/l
 modelo = Hb20 - consumo = 14,5 km/l
 modelo = Kwid - consumo = 15,6 km/l
 */

        System.out.println("Crie um dicionário que relacione os modelos de seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mob", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do Gol por 15,2 km/l");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("Uno"));

        //System.out.println("Exiba o terceiro modelo adicionado");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEconimico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficinete = "";
        for (Map.Entry<String, Double> entrada: entries) {
            if (entrada.getValue().equals(consumoMaisEconimico)) {
                modeloMaisEficinete = entrada.getKey();
                System.out.println("Modelo(s) mais eficiente(s): " + modeloMaisEficinete + " - " + consumoMaisEconimico);
            }
        }

        System.out.println("Exiba seu modelo mais econômico e seu consumo: ");
        Double consumoMenosEconimico = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entrySet = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: entrySet) {
            if (entry.getValue().equals(consumoMenosEconimico)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo(s) menos eficiente(s): " + modeloMenosEficiente + " - " + consumoMenosEconimico);
            }
        }


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média de consumo deste dicionário de carros: " + soma/carrosPopulares.size());

        System.out.println("Remova os modelos com o consumo igual a 156 km/l");
        carrosPopulares.values().removeIf(aDouble -> aDouble.equals(15.6));
        System.out.println(carrosPopulares);

        System.out.println("Exiba os carros na ordem em que foram informados: ");
        Map<String, Double> ordemDeInsercao = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mob", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(ordemDeInsercao.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo");
        Map<String, Double> ordemDeModelo = new TreeMap<>(ordemDeInsercao);
        System.out.println(ordemDeModelo.toString());

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Configra se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}
