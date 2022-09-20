package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosB
 * noviembre - 2021
 * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
 * Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
 * las tres primeras letras de cada uno de ellos.
 * Por ejemplo si se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigoUsuario;

        System.out.print("Introduce NOMBRE: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Introduce APELLIDO 1: ");
        String cadena2 = scanner.nextLine();
        System.out.print("Introduce APELLIDOS 2: ");
        String cadena3 = scanner.nextLine();

        cadena1 = cadena1.substring(0,3);
        cadena2 = cadena2.substring(0,3);
        cadena3 = cadena3.substring(0,3);


        codigoUsuario = (cadena1+cadena2+cadena3).toUpperCase();
        System.out.println(codigoUsuario);


    }
}
