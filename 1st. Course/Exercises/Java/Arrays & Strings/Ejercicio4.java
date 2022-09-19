package EjerciciosA;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * noviembre - 2021
 * Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPositivos = 0, sumaNegativos = 0, numeroUsuario;
        int[] miArray = new int[20];
        for (int i = 0; i < miArray.length; i++) {
            System.out.print("Por favor, introduce número para almacenarlo en la array: ");
            numeroUsuario = scanner.nextInt();
            miArray[i] = numeroUsuario;
            if (numeroUsuario >= 0) {
                sumaPositivos += numeroUsuario;
            } else {
                sumaNegativos += numeroUsuario;
            }
        }
        System.out.printf("%nLa suma de todos los valores positivos de la array es: %d%n", sumaPositivos);
        System.out.printf("La suma de todos los valores negativos de la array es: %d%n", sumaNegativos);


    }
}
