package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: 27/10/2021
 * Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números naturales
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int producto = 1;
        for (int i = 1; i <= 10; i++) {
            suma += i;
            producto *= i;
        }
        System.out.printf("La suma es: %d y el producto es: %d", suma, producto);
    }
}
