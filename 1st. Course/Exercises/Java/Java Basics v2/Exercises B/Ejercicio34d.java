package EjerciciosB;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema5 - EjerciciosB
 * Date: Noviembre / 2021
 * Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos: APARTADO D
 */
public class Ejercicio34d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i >= 2 ; i--) { // bucle for, exterior, para definir cuantas filas vamos a tener (9), i se inicializa en 10 para luego imprimir en la primera línea el primer número - 1  (10-1 = 9)
            for (int j = 10; j >= i ; j--) { // bucle interior, j la inicio en 10 mientras j es >= i voy quitando una unidad a j
                // en la primera vuelta j no dará ninguna vuelta, porque la condición mientras j(10) sea mayor o igual a i (10) quitale una unidad a j ya se cumple, por lo tanto tan solo imprimirá una vez la línea de abajo j-1 = 9 (mostrará un 9 solamente)
                // en la segunda vuelta i ha cambiado a 9... j (10) es mayor que 9 ... entonces a j tendré que quitarle una unidad hasta que sea igual a i... se imprimira una vez el sout, y en la vuelta que haga se volverá a imprimir, pero con j = 9 entonces 9-1 = 8 imprimira 9 y 8,
                // en la tercera vuelta i ha cambiado a 8... j empieza en 10 es mayor que 8... entonces j tendré que quitarle dos unidades hasta que sea igual a i, 2 vueltas, se imprime una vez el sout (10-1=9), dará una veulta, se imprimira (9-1=8), daraá otra vuelta, en esta ultima j seria 8, entonces es la ultuma vuelta imprimirá (8-1=7)... reulstadio 987
                // y asi sucesivamente hasta llegar a i = 2
                System.out.printf("%d",j-1); // imprimo el valor de j menos 1 unidad
            }
            System.out.println();
        }

    }
}
