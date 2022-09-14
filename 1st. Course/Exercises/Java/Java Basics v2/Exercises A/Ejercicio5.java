package EjerciciosA;

import java.util.Scanner;

/**
 * @author stani
 * Tema5
 * @date octubre 2021
 * 5. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Por favor, introduce un número y te mostraré el factorial de éste: ");
            num = scanner.nextInt();
            if (num < 0){
                System.out.println("No se admiten números negativos.");
            }
        } while (num < 0);

        int fact = 1;
        while (num > 1) {
            fact *= num;
            num--;
        }
        System.out.printf("El factorial es: %d", fact);
    }
}
