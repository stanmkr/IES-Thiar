package EjerciciosA;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6
 * Date: NOVIEMBRE / 2021
 *
 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8 jugadores.
 * Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, de tipo entero)
 * y luego muestre las puntuaciones en orden descendente (de la más alta a la más baja).
 *
 */


public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroJugadores = 5, puntuacion;
        int [] array = new int[numeroJugadores];

        for (int i = 0; i < array.length ; i++) {
            do {
                System.out.print("Por favor introduce una puntuación entre 1000-2800: ");
                puntuacion = scanner.nextInt();
                if (puntuacion < 1000 || puntuacion > 2800){
                    System.out.println("RANGO NO VÁLIDO");
                }
            } while (puntuacion < 1000 || puntuacion > 2800);
            array [i] = puntuacion;
        }
        Arrays.sort(array);
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }

    }
}
