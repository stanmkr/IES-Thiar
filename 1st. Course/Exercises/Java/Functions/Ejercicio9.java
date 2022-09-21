import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * diciembre - 2021
 * <p>
 * Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más elevado.
 * Impleméntalo creando únicamente una función a la que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3]; // array en la que almaceno los 3 valores que pediré al usuario
        int max1=0, max2;
        System.out.println("Introduce 3 valores y te diré cual es el más elevado.");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Introduce el valor %d: ", i + 1);
            array[i] = scanner.nextInt();
            max1 = array[0]; // en max1 almaceno el primer elemento de la array,
        }
        max2 = elMasElevado(array[1], array[2]); // en max 2 almaceno el máximo resultante entre los dos siguientes elementos del array
        System.out.printf("El mayor de los 3 números es: %d", elMasElevado(max1, max2)); // vuelvo a invocar la función, hago el máximo entre el primer elemento y el máximo resultante anterior.

    }

    /**
     * introduciendo dos parámetros nos dice cual es el mayor
     * @param valor1 el primer parametro entero
     * @param valor2 el segundo parámetro entero
     * @return devuelve el mayor de los dos
     */
    public static int elMasElevado(int valor1, int valor2) {
        return Math.max(valor1, valor2);
    }
}
