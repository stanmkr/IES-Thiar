package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6
 * Date: NOVIEMBRE / 2021
 *
 * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc.
 * hasta introducir 10 diez veces, y luego la muestre por pantalla
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length ; i++) {
            for (int j = -1; j < i ; j++) {
                array[i] = i+1;
                System.out.printf("%d ", array[i]);

            }
            System.out.println();

        }

    }
}
