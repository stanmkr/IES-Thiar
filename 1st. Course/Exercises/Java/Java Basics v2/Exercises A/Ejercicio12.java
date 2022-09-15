package EjerciciosA;

import java.util.Scanner;

/**
 * @author stani
 * Tema5
 * @date octubre 2021
 * Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de potencia (^),
 * siendo A y B valores introducidos por teclado, y luego muestre el resultado por pantalla
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base;
        double potencia;
        double resultado = 1;


        System.out.print("Introduce la base: ");
        base = scanner.nextInt();
        System.out.print("Introduce la potencia: ");
        potencia = scanner.nextInt();

        for (int i = 1; i <= potencia; i++) {
            resultado = resultado * base;
        }
        if (potencia < 0) {
            resultado = 1 / potencia;
            System.out.printf("%.2f elevado a %.2f = %.2f",base,potencia,resultado); // NO FUNCIONA LA FORMULA
        } else {
            System.out.printf("%.2f elevado a %.2f = %.2f", base, potencia, resultado);
        }
    }
}
