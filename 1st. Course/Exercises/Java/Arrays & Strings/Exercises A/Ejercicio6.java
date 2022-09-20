package EjerciciosA;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * noviembre - 2021
 * Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
 * escriba M en todas sus posiciones y lo muestre por pantalla.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame un número, será el tamaño de la array: ");
        int tamanyoArray = Integer.parseInt(scanner.nextLine());
        System.out.print("Dame un número, con ese rellenaré todas las posiciones del array: ");
        int numeroUsuario = Integer.parseInt(scanner.nextLine());

        int[] miArray = new int[tamanyoArray];
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = numeroUsuario;
            System.out.printf("La el índice %d de la array contiene %d%n", i, miArray[i]);
        }

    }
}
