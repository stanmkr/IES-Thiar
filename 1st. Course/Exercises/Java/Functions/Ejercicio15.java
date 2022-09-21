import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * diciembre - 2021
 * <p>
 * Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
 * Luego muestra la suma total y la media.
 * Implementa una función que calcule la suma de un array y otra que calcule la media de un array
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] miArray = new int[100];
        int relleno = 1;
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = relleno++;
        }
        for (int valor : miArray) {
            System.out.print(valor + " ");
        }
        System.out.printf("%nLa suma del array es: %d ", sumaArray(miArray));
        System.out.printf("%nLa media del array es: %.2f", mediaArray(miArray));

    }

    /**
     * funcion que almacena la suma de todos los elementos de una array
     * @param array el array
     * @return devuelve la suma de los elementos que contiene el array
     */
    public static int sumaArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    /**
     * función que hace la media de la suma de los elementos de una array
     * @param array parametro el array
     * @return devuelve la media de la suma de los elementos
     */
    public static double mediaArray(int[] array) {
        return sumaArray(array) * 1.0 / array.length;

    }
}
