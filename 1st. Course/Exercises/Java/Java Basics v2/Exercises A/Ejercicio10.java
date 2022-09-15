package EjerciciosA;

import java.util.Scanner;

/**
 * @author stani
 * Tema5
 * @date octubre 2021
 * Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10)
 * que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        double nota;
        do {
            System.out.print("Escribe una nota del 1 al 10: ");
            nota = scanner.nextDouble();
            if (nota == 10) {
                flag = true;
            }
        } while (nota != -1);

        if (flag) {
            System.out.println("Hay al menos una nota de 10");
        } else {
            System.out.println("No hay notas de 10");
        }
    }
}
