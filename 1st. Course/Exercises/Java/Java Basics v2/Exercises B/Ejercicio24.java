package EjerciciosB;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 * Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números naturales
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.print("Introduce hasta qué número quieres ver la suma de los cuadrados: ");
        int userNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= userNumber; i++) {
            suma += Math.pow(i, 2);
        }
        System.out.printf("La suma de los cuadrados de los %d primeros números es: %d", userNumber, suma);

    }
}
