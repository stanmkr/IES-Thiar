package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema5 - EjerciciosB
 * noviembre - 2021
 * Dígitos de un número. Realiza un programa que nos diga los dígitos de un número introducido por teclado. No trabajes con cadenas de caracteres,
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el número y te dire cúantos digitos contiene: ");
        int num = Integer.parseInt(scanner.nextLine());
        int numParaMostrar = num;

        int contadorDigitos = 0;
        do {
            num = num / 10;
            contadorDigitos++;
        } while (num!=0);

        System.out.printf("El número %d tiene %d dígitos",numParaMostrar,contadorDigitos);
    }
}
