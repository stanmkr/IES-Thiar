package EjerciciosA;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6
 * Date: NOVIEMBRE / 2021
 * <p>
 * Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N
 * que contenga M en todas sus posiciones. Luego muestra el array por pantalla
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanyoArray, valorArray;
        System.out.print("Por favor, introduce el tamaño de la array: ");
        tamanyoArray = scanner.nextInt();
        System.out.print("Por favor, introduce el valor de la array: ");
        valorArray = scanner.nextInt();
        int[] array = new int[tamanyoArray];

        Arrays.fill(array, valorArray);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }


    }
}
