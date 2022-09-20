package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * EjerciciosB
 * noviembre - 2021
 *
 * Recorrido de la cadena. Lee una cadena de texto por teclado y muestra
 * cada uno de sus caracteres separados entre sí por un punto.
 * Usa un bucle para realizar el ejercicio. Ejemplo de salidas
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadenaUsuario = scanner.nextLine();
        for (int i = 0; i <cadenaUsuario.length() ; i++) {
            System.out.printf("%s.",cadenaUsuario.charAt(i));
        }


    }
}
