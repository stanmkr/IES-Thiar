package EjerciciosA;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * noviembre - 2021
 * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 * utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
 * mostrará cuántos valores del array son igual o superiores a R.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] miArray = new double[100];
        double numeroUsuario;
        int contadorIgualesMayores = 0;
        do {
            System.out.print("Dame un valor entre 0.1 y 1: ");
            numeroUsuario = scanner.nextDouble();
        } while (numeroUsuario <= 0 || numeroUsuario > 1);

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = Math.random();
            if (miArray[i] == numeroUsuario || miArray[i] > numeroUsuario) {
                contadorIgualesMayores++;
                System.out.printf("El valor %.2f del array es igual o superior a %.2f%n", miArray[i], numeroUsuario);
            }
        }
        System.out.printf("Hay un total de %d valores iguales o superiores al número %.2f introducido", contadorIgualesMayores, numeroUsuario);

    }
}
