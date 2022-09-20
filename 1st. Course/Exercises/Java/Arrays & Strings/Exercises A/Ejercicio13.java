package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6
 * Date: NOVIEMBRE / 2021
 * <p>
 * Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla.
 * Una secuencia aritmética es una serie de números que comienza por un valor inicial V, y continúa con incrementos de I.
 * Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37…
 * El programa solicitará al usuario V, I además de N (nº de valores a crear).
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalValores, valorInicial, incremento;
        
        System.out.print("Introduce cuantos valores quieres almacenar en el array: ");
        totalValores = scanner.nextInt();
        int[] array = new int[totalValores];

        System.out.print("Introduce el valor por el que quieres comenzar: ");
        valorInicial = scanner.nextInt();
        System.out.print("Introduce el incremento que quieres dar a ese valor por cada índice: ");
        incremento = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = valorInicial;
            valorInicial = valorInicial + incremento;
            System.out.printf("%d ", array[i]);

        }

    }

}

