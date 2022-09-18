package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema5 - EjerciciosB
 * noviembre - 2021
 * Realiza un programa que permita introducir números y nos muestre el resultado de sumarlos,
 * hasta que introduzca un número mayor que 1000.
 * Si no se introduce un número mayor que 1000 el programa finalizará después de introducidos 15 números.
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declaro e inicializo variables para utilizarlas posteriormente
        int num;
        int sumatorioNumeros = 0;
        int contadorVueltas = 0;
        System.out.println("Introduce números, voy a ir sumando los números que vas introduciendo, si introduces el número 1000 el programa terminará y mostrará la suma de todos los números introducidos");

        // bucle DoWhile, se ejecuta mientras el numero introducido es menor o igual a 1000 o el contador es distinto a 15
        do {
            contadorVueltas++; // primera vuelta al entrar en dowhile sumo 1
            System.out.print("Introduce número: ");
            num = scanner.nextInt(); // leo numero
            if (num > 1000){ // si el numero introducido es mayor que 1000 corto el programa
                break;
            }
            sumatorioNumeros += num;
        } while (num <= 1000 && contadorVueltas != 15);

        System.out.printf("EL sumatorio de todos los números introducidos es: %d", sumatorioNumeros); // muestro
    }
}
