package Ejercicio_2;

import java.util.LinkedList;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Ejercicios
 * Date: marzo / 2022
 */
public class Parking_v2 extends Coche_v2 {
    LinkedList<String> coches = new LinkedList<>();

    public Parking_v2() {
        super();
    }


    // muestra la lista de coches
    public void mostrarCoches() {
        System.out.println("\n--- PARKING (capacidad 10 coches)--- ");
        for (String e : coches) {
            System.out.println("Matrícula: " + e);
        }
        System.out.println();
    }


    public void aparcar(String matricula) {
        if (coches.size() < 10) {
            coches.push(matricula);
        } else {
            System.out.println("El parking esta lleno, vuelve más tarde.\n");
        }
    }

    public void desaparcar() {
        if (coches.isEmpty()) {
            System.out.println("El parking esta vacío, no hay ningún vehículo.");
        } else {
            System.out.println(coches.pollFirst());
        }


    }
}
