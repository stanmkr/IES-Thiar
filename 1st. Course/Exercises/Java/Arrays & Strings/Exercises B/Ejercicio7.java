package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosB
 * noviembre - 2021
 * <p>
 * Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o no
 * (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
 * Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.).
 * Un palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        char espacio = ' '; // variable para hacer la comprobación
        String fraseInversa = "", fraseSinEspacio = "";
        System.out.print("Introduce una frase y te diré si es un palíndromo: ");
        frase = scanner.nextLine();

        // bucle para recorrer la frase e almacenarla en variable omitiendo los espacios
        for (int z = 0; z < frase.length(); z++) {
            if (espacio != frase.charAt(z)) {
                fraseSinEspacio += frase.charAt(z);
            }
        }
        // bucle para recorrer la frase en orden inverso y se almacena sin espacios en una variable
        for (int i = frase.length() - 1; i >= 0; i--) {
            if (espacio != frase.charAt(i)) {
                fraseInversa += frase.charAt(i);
            }
        }

        System.out.printf("La frase que pusiste: %s%n", fraseSinEspacio);
        System.out.printf("La frase inversa: %s%n", fraseInversa);
        // condicional para comprobar ambas frases si son iguales ignorando mayúsculas y minúsculas
        if (fraseSinEspacio.equalsIgnoreCase(fraseInversa)) {
            System.out.println("LA FRASE ES PALÍNDROMA");
        } else {
            System.out.println("NO ES PALÍNDROMA");
        }
    }
}
