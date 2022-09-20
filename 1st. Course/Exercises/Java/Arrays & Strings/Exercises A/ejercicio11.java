package EjerciciosA;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - PACKAGE_NAME
 * Date: NOVIEMBRE / 2021
 */
public class ejercicio11 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] arrayInverso = new int[100];


        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        // copiado inverso
        for (int i = 0; i < array1.length; i++) {
            arrayInverso[i] = array1[array1.length-1-i];

        }


        System.out.println("PRIMER ARRAY");
        for (int j : array1) {
            System.out.printf("%d ", j);
        }
        System.out.println();
        System.out.println("\nSEGUNDO ARRAY");
        for (int j : arrayInverso) {
            System.out.printf("%d ", j);
        }


    }
}
