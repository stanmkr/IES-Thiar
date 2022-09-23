import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * Escribe un programa que imprima las tablas de multiplicar del 1 al 10.
 * Implementa una función que reciba un número entero como parámetro e imprima su tabla de multiplicar.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%n---- TABLA DE MULTIPLICAR DE %d ----%n", i);
            tablasMultiplicacion(i);
        }
        System.out.println();
    }

    public static void tablasMultiplicacion(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", numero, i, numero * i);
        }
    }
}
