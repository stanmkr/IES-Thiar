package EjerciciosA;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6
 * Date: NOVIEMBRE / 2021
 * <p>
 * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc.
 * Hasta introducir 10 diez veces, y luego la muestre por pantalla.
 * En esta ocasión has de utilizar Arrays.fill().
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] miArray = new int[55];
        int indice = 0;
        for (int i = 1; i <= 10; i++) {
            Arrays.fill(miArray, indice, indice + i, i);
            indice += i;
        }
        for (int i:miArray){
            System.out.printf("%d ",i);
        }


    }

}


