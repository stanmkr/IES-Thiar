package EjerciciosB;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema5 - EjerciciosB
 * Date: Noviembre / 2021
 * Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos: APARTADO A
 */
public class Ejercicio34a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 8; i++) {  // bucle for, exterior, para definir cuantas filas vamos a tener (9), i se inicializa en 0 para luego imprimir en la primera línea 0
            for (int j = 1; j <= 10; j++) { // bucle interior, j la inicio en 1 mientras 1 es <= 10 voy aumentando 1 unidad j,

                // j dará 10 vueltas, hasta salirse de su bucle, en esas 10 vueltas, imprimire el valor de i (0) que no cambiará, imprimire 10 veces 0, cuando j alcance el 10 se saldrá, entonces i
                // aumentara un valor, estaria en 1, se volverá a entrar en el bucle interior j =1, hasta que sea 10 (10 vueltas) imprimire el valor de i que es 1, y asi sucesivamente.
                System.out.print(i); // imprimo el valor de i sin hacer salto de línea
            }
            System.out.println();
        }

    }
}
