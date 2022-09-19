package EjerciciosA;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * PACKAGE_NAME
 * noviembre - 2021
 *
 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
 * a. Mostrar valores.
 * b. Introducir valor.
 * c. Salir.
 * La opción ‘a’ mostrará todos los valores por pantalla.
 * La opción ‘b’ pedirá un valor V y una posición P, luego escribirá V en la posición P del array.
 * El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa.
 *
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array10enteros = new int[10];
        String opcion;
        do {
            System.out.println("\n======= M E N U ======= \n");
            System.out.println("Mostrar valores -> A");
            System.out.println("Introducir valor -> B");
            System.out.println("SALIR -> C");
            System.out.print("\nPor favor, introduce una opción: ");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "A", "a" -> {
                    System.out.println("--- LOS VALORES DEL ARRAY ---");
                    for (int i = 0; i < array10enteros.length; i++) {
                        System.out.printf("%d ", array10enteros[i]);
                    }
                    System.out.println();
                }

                case "B", "b" -> {
                    System.out.print("Por favor, introduce un valor para almacenar: ");
                    int valorArray = scanner.nextInt();
                    int indiceValor;
                    do {
                        System.out.print("Por favor, introduce un índice para el array (rango 0-9): ");
                        indiceValor = scanner.nextInt();
                    } while (indiceValor > 9 || indiceValor < 0);
                    scanner.nextLine();
                    array10enteros[indiceValor] = valorArray;
                    System.out.printf("Posición: %d %nValor: %d", indiceValor, valorArray);
                }
                case "C", "c" -> System.out.println("HAS DECIDIDO SALIR DEL PROGRAMA.\n");
                default -> System.out.println("OPCIÓN NO VÁLIDA.\n");
            }

            //if (opcion.equalsIgnoreCase("b"))
            //  opcion = scanner.nextLine();
        } while (!opcion.equalsIgnoreCase("c"));

    }
}