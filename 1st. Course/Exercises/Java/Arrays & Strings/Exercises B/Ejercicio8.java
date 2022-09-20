package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosB
 * noviembre - 2021
 * <p>
 * Realiza un programa que lea un número entero entre 0 y 254
 * y lo muestre en su equivalente en binario.
 * Impide entrada de datos incorrectas.
 * La salida en binario siempre tiene que ser de 8bits, el 0 es 00000000
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntero;
        int[] residuo = new int[8];

        do {
            System.out.print("Introduce un número entero rango(0-254): ");
            numeroEntero = scanner.nextInt();
        } while (numeroEntero < 0 || numeroEntero > 254);

        // calculo y almacen del resiudo en una array
        for (int i = 0; i < residuo.length; i++) {
            residuo[i] = numeroEntero % 2;
            numeroEntero = numeroEntero / 2;
        }

        //muestreo del array de atras hacia delante
        for (int i = residuo.length - 1; i >= 0; i--) {
            System.out.printf("%d", residuo[i]);
        }

    }
}

