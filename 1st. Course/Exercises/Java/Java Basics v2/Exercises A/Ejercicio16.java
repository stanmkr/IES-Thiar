package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 * Realiza un programa que muestren los números del 860 al 460 contando de 10 en 10 hacia atrás. Muéstralo 3 veces,
 * con el bucle while, con el bucle do-while y con el bucle for.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // BUCLE FOR
        // NÚMEROS DE 860 HASTA 460 con paso -10
        System.out.println("------------------ ESTO ES BUCLE FOR ------------------");
        for (int i = 860; i >= 460; i-=10) {
            System.out.println(i);
        }

        // BUCLE WHILE
        // NÚMEROS DE 860 HASTA 460 con paso -10
        System.out.println("------------------ ESTO ES BUCLE WHILE ------------------");
        int min = 460;
        int max = 860;
        while (max != min) {
            System.out.println(max);
            max -= 10;
        }
        System.out.println(max);

        // BUCLE DO WHILE
        // NÚMEROS DE 860 HASTA 460 con paso -10
        System.out.println("------------------ ESTO ES BUCLE DO WHILE ------------------");
        int min2 = 460;
        int max2 = 860;
        do {
            System.out.println(max2);
            max2 -= 10;
        } while (max2 != min2);
        System.out.println(max2);

    }
}
