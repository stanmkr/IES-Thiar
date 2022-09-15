package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 *  Realiza un programa que lea un número por teclado y nos diga si es primo o no.
 *  Un número es primo si sólo es divisible entre 1 y sí mismo
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un número entero: ");
        int num = Integer.parseInt(scanner.nextLine());
        int contadorDivisores = 0;
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0){
                contadorDivisores++;
            }
        }
        if (contadorDivisores == 2) {
            System.out.printf("El número %d ES un número primo.", num);
        }else {
            System.out.printf("El número %d NO es un número primo.", num);
        }

    }
}
