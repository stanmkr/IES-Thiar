package Ejercicios_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Ejercicios_ArrayLists
 * Date: febrero / 2022
 */
public class Ej5_Distribucion {
    public static void main(String[] args) {
        ArrayList<Integer> listaAleatorios = new ArrayList<>();
        ArrayList<Integer> listaCoincidencias = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaAleatorios.add(i, ThreadLocalRandom.current().nextInt(1, 6 + 1));
        }

        Collections.sort(listaAleatorios);
        for (int i = 1; i <= 6; i++) {
            listaCoincidencias.add(Collections.frequency(listaAleatorios, i));
        }

        System.out.println("Lista: " +listaAleatorios);


        for (int i = 0; i < 6; i++) {
            System.out.printf("Nº de veces que ha salido %d--> %d veces%n", i + 1, listaCoincidencias.get(i));
        }

        int diferencia =  Math.abs(Collections.max(listaCoincidencias) - Collections.min(listaCoincidencias));
        System.out.println("Diferencia de veces entre el número que más ha salido y el que menos ha salido: "+diferencia);

        //cantidad de veces que ha salido el número que m


    }
}
