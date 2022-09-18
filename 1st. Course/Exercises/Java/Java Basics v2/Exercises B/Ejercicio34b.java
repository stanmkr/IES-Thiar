package EjerciciosB;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema5 - EjerciciosB
 * Date: Noviembre / 2021
 * Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos: APARTADO B
 */
public class Ejercicio34b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 9; i++) { // bucle for, exterior, para definir cuantas filas vamos a tener (9), i se inicializa en 1 para luego imprimir en la primera línea 1
            for (int j = 1; j <=i ; j++) { // bucle interior, j la inicio en 1 mientras 1 es <= i voy aumentando 1 unidad j,
                // j en la primera vuelta es 1 mientras... mientras 1 es menor o igual que 1 ... entonces j dará tan solo una vuelta, imprimire una vez i solamente,
                // segunda vuelta: j = 1... pero i es igual a 2 ... mientras j es menor que 2 aumento j.. j hará dos aumentos, por lo tanto 2 vueltas, imprimire 2 veces el valor de i ( el numero 2 )
                // asi sucesivamente hasta llegar a i = 9
                System.out.print(i); // imprimo i sin saltar línea
            }
            System.out.println();
        }

    }
}
