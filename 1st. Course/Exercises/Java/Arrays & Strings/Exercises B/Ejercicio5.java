package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosB
 * noviembre - 2021
 * <p>
 * El punto es la clave. Leer por teclado un número real y guárdalo en una variable de tipo double,
 * comprueba que sea realmente un número real. Muestra por separado su parte entera y su parte real.
 * Utiliza para su solución al menos las funciones indexOf y substring.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConvertido;
        char punto = '.';
        double numeroUsuario;
        char almacen;
        boolean esReal = false;

        System.out.print("Introduce un número real: ");
        numeroUsuario = scanner.nextDouble();
//        do {
//            System.out.print("Introduce un número real: ");
//
//        } while (!scanner.hasNextDouble());
        numeroConvertido = String.valueOf(numeroUsuario);
        for (int i = 0; i < numeroConvertido.length(); i++) {
            almacen = numeroConvertido.charAt(i);
            if (almacen == punto) {
                esReal = true;
                break;
            }
        }
        if (esReal) {
            System.out.println("El número ES real");
        }

        System.out.print("La parte ENTERA del número introducido: ");
        System.out.print(numeroConvertido.substring(0, numeroConvertido.indexOf('.')));
        System.out.print("\nLa parte REAL del número introducido es: ");
        System.out.print(numeroConvertido.substring(numeroConvertido.indexOf('.') + 1));

    }
}
