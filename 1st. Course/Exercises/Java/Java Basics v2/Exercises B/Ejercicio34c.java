package EjerciciosB;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema5 - EjerciciosB
 * Date: Noviembre / 2021
 *  * Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos: APARTADO C
 */
public class Ejercicio34c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 9 ; i++) { // bucle for, exterior, para definir cuantas filas vamos a tener (9), i se inicializa en 0 para luego imprimir en la primera línea 1
            for (int j = 10; j >= i ; j--) { // bucle interior, j la inicio en 10 mientras 10 es mayor o igual a i ( 1 ) voy aumentando quitando 1 a j,
                // en la primera vuelta j hará 10 vueltas porque i es 1
                // en la segunda vuelta j dará 9 vueltas por la condición sería j = 10 mientras es menor o igual a i = 2
                // asi sucesivamente hasta llegar igualarse, donde j dará solo dos vueltas
                System.out.print(i); // imprimo i sin saltar de línea
            }
            System.out.println();
        }


    }
}
