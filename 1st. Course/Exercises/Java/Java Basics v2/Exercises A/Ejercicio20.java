package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 * Realiza un programa que muestre la serie de Fibonacci.
 * El primer término es 0, el segundo término es 1, el resto se calcula a partir de la suma de los dos anteriores,
 * así la serie sería: 0, 1, 1, 2, 3, 5, 8, ….
 *
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el número: ");
        int num = Integer.parseInt(scanner.nextLine());

        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= num ; i++) {
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }

    }
}
