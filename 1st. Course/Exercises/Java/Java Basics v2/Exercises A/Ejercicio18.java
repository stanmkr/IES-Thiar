package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 * Realiza un programa que pregunte cuántos números se van a introducir, pida esos números, y escriba el mayor, el menor y la media aritmética.
 * Se recuerda que la media aritmética de un conjunto de valores es la suma de esos valores dividida por la cantidad de valor
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUsuario;
        do {
            System.out.print("Escribe cuantos números quieres introducir: ");
            numUsuario = scanner.nextInt();
        } while (numUsuario <= 0);
        int contador = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        int input;
        do {
            contador++;
            System.out.print("Escribe el número: ");
            input = scanner.nextInt();
            sum += input;
            if (input > max) {
                max = input;
            }
            if  (input < min) {
                min = input;
            }
        } while (numUsuario != contador);
        System.out.printf("El mayor es: %d %n", max);
        System.out.printf("El menor es: %d %n", min);
        System.out.printf("La media aritmética es: %.2f %n", (double) sum/numUsuario);
    }
}
