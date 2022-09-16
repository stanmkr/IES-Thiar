package EjerciciosB;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev 1º DAM
 * PAQUETE - EjerciciosB
 * Date: noviembre / 2021
 * <p>
 * El dado. Realiza un programa que simule la tirada de un dado, aleatoriamente sacará un número entre el 1 y el 6.
 * Estamos jugando al parchís, ¿Cuántas veces hemos tenido que tirar el dado hasta sacar un 5?
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        int contadorTiradas = 0;
        int dado;

        System.out.println("Vamos a tirar el dado, y vamos a contar cuantas tiradas ha hecho hasta sacar un 5");
        do {
            //dado = (int) (Math.random() * 6) +1;
            //dado = (int) (Math.random() * (6+1)) -1;
           dado = ThreadLocalRandom.current().nextInt(-2,7);
            contadorTiradas++;
            System.out.printf("Tirada Nº%d ha salido el %d %n", contadorTiradas, dado);
        } while (dado != 5);
        System.out.printf("%nSe han hecho %d tirada/s hasta salir el número 5 en el dado.", contadorTiradas);
    }
}
