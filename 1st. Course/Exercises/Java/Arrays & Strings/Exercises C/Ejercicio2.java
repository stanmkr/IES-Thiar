package EjerciciosC;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosC
 * Date: NOVIEMBRE / 2021
 * <p>
 * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10
 * (cada tabla en una fila).
 * Luego mostrará la matriz por pantalla.
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        int[][] tablaMultiplicar = new int[10][10];

        for (int i = 0; i < tablaMultiplicar.length; i++) {
            System.out.printf("TABLA DE MULTIPLICAR DE %d%n ", i + 1);
            for (int j = 0; j < tablaMultiplicar[i].length; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
                System.out.printf("%d ", tablaMultiplicar[i][j]);
            }
            System.out.printf("%n%n");
        }
    }
}
