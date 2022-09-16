package EjerciciosB;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema5
 * Date: Noviembre
 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N,
 * uno en cada línea, repitiendo cada número tantas veces como su valor. Ejemplo:
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUser;
        do {
            System.out.print("Por favor introduce un número en el rango 0-20: ");
            numUser = scanner.nextInt();

        } while (numUser < 0 || numUser > 20);

        for (int i = 1; i <= numUser; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
