package EjerciciosA;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6
 * Date: NOVIEMBRE / 2021
 * <p>
 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios entre 0 y 99 (utiliza Math.random()*100).
 * Luego pedirá por teclado un valor N y se mostrará por pantalla si N existe en el array, además de cuantas veces.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print("Por favor introduce un valor y te diré si la array contiene dicho valor: ");
        int valor = Integer.parseInt(scanner.nextLine());
        Arrays.sort(array);
        if (Arrays.binarySearch(array,valor) == -1){
            System.out.printf("El valor %d no existe en la array %n", valor);
        } else {
            System.out.printf("El valor %d se encuentra en la array%n", valor);
            for (int j : array) {
                if (j == valor) {
                    contador++;
                }
            }
            System.out.printf("Número de veces que se ha encontrado: %d%n", contador);

        }



    }
}
