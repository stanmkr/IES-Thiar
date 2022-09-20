package EjerciciosA;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * PACKAGE_NAME
 * noviembre - 2021
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10
 * (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] miArray = new int[100];
        int numUsuario;
        do {
            System.out.print("Introduce un valor entre 1 y 10, a continuación diré en qué índice del array aparece: ");
            numUsuario = scanner.nextInt();
        } while (numUsuario < 1 || numUsuario > 10);

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = ThreadLocalRandom.current().nextInt(1, 10 + 1); // random entre 1 y 10
            if (miArray[i] == numUsuario){
                System.out.printf("El número %d aparece en el índice %d del array%n",numUsuario,i);
            }
        }

    }
}
