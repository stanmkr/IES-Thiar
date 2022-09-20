package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * EjerciciosB
 * noviembre - 2021
 * <p>
 * Crea un programa que pida una cadena de texto por teclado y
 * luego muestre cada palabra de la cadena en una línea distinta.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadenaUsuario = scanner.nextLine();
        char espacio = ' ';
        char almacenCaracteres;

        // recorrer desde índice 0 hasta longitud, imprimo carácter de posición 0,1,2,3,etc.
        for (int i = 0; i < cadenaUsuario.length(); i++) {
            almacenCaracteres = cadenaUsuario.charAt(i);
            System.out.print(cadenaUsuario.charAt(i));
            if (espacio == almacenCaracteres ){
                System.out.println();
            }

        }


    }
}
