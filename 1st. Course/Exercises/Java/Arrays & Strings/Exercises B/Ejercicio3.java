package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosB
 * noviembre - 2021
 * <p>
 * Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la 1ª cadena de texto: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Introduce la 2ª cadena de texto: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas de texto NO son iguales");
        }

    }
}
