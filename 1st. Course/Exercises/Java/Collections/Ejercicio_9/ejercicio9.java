package Ejercicio_9;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev 1º DAM
 * TEMA11_Colecciones - Ejercicio_8
 * Date: Marzo / 2022
 */
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un año: ");
        int anyo = scanner.nextInt();
        int[] temperaturasMedias = new int[50];

        for (int i = 0; i < temperaturasMedias.length; i++) {
            temperaturasMedias[i] = ThreadLocalRandom.current().nextInt(10, 30 + 1);
        }


        System.out.println();
        System.out.println();

        TreeMap<Integer, Integer> temperaturas = new TreeMap<>();
        for (Integer e : temperaturasMedias) {
            if (temperaturas.get(e) != null) {
                temperaturas.put(e, temperaturas.get(e) + 1);
            }else {
                temperaturas.put(e,1);
            }

        }
        for (Integer t : temperaturas.keySet()) {
            System.out.printf("Temperatura %dºC | Días: %d%n", t, temperaturas.get(t));
        }

        System.out.println("Temperatura mínima: " + temperaturas.firstKey() + "ºC  | " + temperaturas.firstEntry().getValue()+ " veces");
        System.out.println("Temperatura máxima: " + temperaturas.lastEntry().getKey() + "ºC  | " + temperaturas.lastEntry().getValue()+ " veces");


    }


}
