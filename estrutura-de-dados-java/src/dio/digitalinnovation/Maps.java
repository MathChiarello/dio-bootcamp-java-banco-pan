package dio.digitalinnovation;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        Map<String , Double> carros = new HashMap<>() {{
           put("gol" , 14.4);
           put("uno" , 15.6);
           put("mobi" , 16.1);
           put("hb20" , 14.5);
           put("kwid" , 15.6);
        }};

        System.out.println(carros);
        System.out.println("--------------------------------");


        System.out.println("Substitua o consumo do gol por 15,2");
        carros.put("gol" , 15.2);
        System.out.println(carros);
        System.out.println("--------------------------------");

        System.out.println("Confirma se o modelo Tucson esta no dicionario");
        System.out.println("Tucson: " + carros.containsKey("tucson"));
        System.out.println("Uno: " + carros.containsKey("uno"));
        System.out.println("--------------------------------");

        System.out.println("Exiba o consumo do Uno");
        System.out.println(carros.get("uno"));
        System.out.println("--------------------------------");

        System.out.println("Exiba os modelos");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);
        System.out.println("--------------------------------");

        System.out.println("Exiba os consumos");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);
        System.out.println("--------------------------------");




    }
}
