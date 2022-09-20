package EjerciciosB;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosB
 * Date: NOVIEMBRE / 2021
 * <p>
 * 6. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’, cuantas ‘e’, etc.)
 * en una frase introducida por teclado. No se debe diferenciar entre mayúsculas y minúsculas.
 * Por ejemplo dada la frase “Mi mamá me mima” dirá que hay:
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int almacenA = 0, almacenE = 0, almacenI = 0, almacenO = 0, almacenU = 0;
        char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
        String frase;
        System.out.print("Introduce una frase y te diré cuantas vocales de cada tipo hay: ");
        frase = scanner.nextLine();
        frase = frase.toLowerCase();
        for (int z = 0; z < frase.length(); z++) {
            if (frase.charAt(z) == a) {
                almacenA++;
            }
            if (frase.charAt(z) == e) {
                almacenE++;
            }
            if (frase.charAt(z) == i) {
                almacenI++;
            }
            if (frase.charAt(z) == o) {
                almacenO++;
            }
            if (frase.charAt(z) == u) {
                almacenU++;
            }
        }
        System.out.printf("Nº de A's: %d%n", almacenA);
        System.out.printf("Nº de E's: %d%n", almacenE);
        System.out.printf("Nº de I's: %d%n", almacenI);
        System.out.printf("Nº de O's: %d%n", almacenO);
        System.out.printf("Nº de U's: %d%n", almacenU);

    }
}
