package EjerciciosA;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * PACKAGE_NAME
 * noviembre - 2021
 * Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores desde P hasta Q,
 * y lo muestre por pantalla
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2,distancia, indice = 0;
        do {
            System.out.println("CONDICIÓN: El 2º número tiene que ser mayor que el 1º");
            System.out.print("Dame un número: ");
            numero1 = scanner.nextInt();
            System.out.print("Dame otro número: ");
            numero2 = scanner.nextInt();
        } while (numero2 < numero1);
        System.out.println("Voy a recorrer todos los valores desde el 1er número hasta el 2º número, a continuación los almacenaré en la array. ");

        distancia = Math.abs(numero1 - numero2);
        int [] miArray = new int [distancia+1];

        for (int i = numero1; i <= numero2 ; i++) {
            miArray[indice] = i;
            System.out.printf("en el índice %d esta el número %d%n", indice, i);
            indice++;
        }
    }
}
