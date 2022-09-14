package EjerciciosA;

import java.util.Scanner;

/**
 * @author stani
 * Tema5
 * @date octubre 2021
 * Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el número máximo: ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num ; i++) {
            System.out.println(i);
        }
    }
}
