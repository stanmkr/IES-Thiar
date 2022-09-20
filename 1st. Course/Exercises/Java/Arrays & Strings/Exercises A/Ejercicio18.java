package EjerciciosA;

import java.util.Arrays;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6
 * Date: NOVIEMBRE / 2021
 *
 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9
 * (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por pantalla.
 *
 */
public class Ejercicio18 {
    public static void main(String[] args) {

        int [] array = new int[30];

        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }


    }
}
