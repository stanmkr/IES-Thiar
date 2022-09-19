package EjerciciosA;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6 - PACKAGE_NAME
 * noviembre - 2021
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroUser;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double[] miArray = new double[10];

        for (int i = 0; i < miArray.length; i++) {
            System.out.print("Introduce números para almacenarlos en la array: ");
            numeroUser = scanner.nextDouble();
            miArray[i] = numeroUser;
        }

        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] < min) {
                min = miArray[i];
            }
            if (miArray[i] > max) {
                max = miArray[i];
            }
        }

        System.out.printf("El máximo valor de la array es: %.0f%n", max);
        System.out.printf("El mínimo valor de la array es: %.0f%n", min);

        // OTRA MANERA DE VER EL MÁXIMO Y EL MÍNIMO, ORDENANDO EL ARRAY DE MENOR A MAYOr
        Arrays.sort(miArray);
        System.out.printf("El máximo es %.0f%n", (double) miArray[miArray.length - 1]);
        System.out.printf("El mínimo es %.0f%n", miArray[0]);


    }
}
