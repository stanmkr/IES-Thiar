import javax.swing.*;

/**
 * Developed by Stanislav Krastev 1º DAM
 * EXAMEN_ARRAY_STRING - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        // RELLENAR CON NUMERO ALEATORIO ENTRE 0 y 1
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
        // MOSTRAR MATRIZ
        for (int[] fila : array) {
            for (int elemento : fila) {
                System.out.printf("%2d", elemento);
            }
            System.out.println();
        }

        // VER QUIEN HA GANADO
        // contar las filas con todos a 0
        int contadorAciertos0 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == 0 && array[i][1] == 0 && array[i][2] == 0) {
                contadorAciertos0++;
            }
        }

        // contar las columnas con todos a 0
        for (int i = 0; i < array.length; i++) {
            if (array[0][i] == 0 && array[1][i] == 0 && array[2][i] == 0) {
                contadorAciertos0++;
            }
        }

        // Ver si diagonal principal tiene tod0 a 0, contarla
        for (int i = 0; i < array.length; i++) {
            if (array[0][0] == 0 && array[1][1] == 0 && array[2][2] == 0) {
                contadorAciertos0++;
            }
        }

        // Ver si diagonal secundaria tiene tod0 a 0, contarla
        for (int i = 0; i < array.length; i++) {
            if (array[2][0] == 0 && array[1][1] == 0 && array[0][2] == 0) {
                contadorAciertos0++;
            }
        }

        // REPETIR CON EL 1

        // contar las filas con todos a 1
        int contadorAciertos1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == 1 && array[i][1] == 1 && array[i][2] == 1) {
                contadorAciertos1++;
            }
        }

        // contar las columnas con todos a 1
        for (int i = 0; i < array.length; i++) {
            if (array[0][i] == 1 && array[1][i] == 1 && array[2][i] == 1) {
                contadorAciertos1++;
            }
        }

        // Ver si diagonal principal tiene tod0 a 1, contarla
        for (int i = 0; i < array.length; i++) {
            if (array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1) {
                contadorAciertos1++;
            }
        }

        // Ver si diagonal secundaria tiene tod0 a 1, contarla
        for (int i = 0; i < array.length; i++) {
            if (array[2][0] == 1 && array[1][1] == 1 && array[0][2] == 1) {
                contadorAciertos1++;
            }
        }

        System.out.printf("El número de aciertos de 0 es: %d%n", contadorAciertos0);
        System.out.printf("El número de aciertos de 1 es: %d%n", contadorAciertos1);

        if (contadorAciertos0 > contadorAciertos1) {
            System.out.println("Ha ganado el 0");
        } else if (contadorAciertos1 > contadorAciertos0){
            System.out.println("Ha ganado el 1");
        }else {
            System.out.println("Ha empatado");

        }


    }
}
