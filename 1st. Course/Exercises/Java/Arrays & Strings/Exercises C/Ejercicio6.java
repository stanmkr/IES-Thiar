package EjerciciosC;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosC
 * Date: NOVIEMBRE / 2021
 * <p>
 * Define una matriz de 5x3 de enteros, rellena todos sus elementos de forma aleatoria entre 0 y 99.
 * Muestra la matriz en forma de tabla, mostrando al final de cada fila el sumatorio
 * (la suma de todos los elementos) de esa fila, y al final de cada columna, el sumatorio de la columna.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][3];
        int sumaFilas = 0, sumaColumnas = 0;

        // rellenar con numeros aleatorios la matriz y mostar la matriz, y hacer la suma de las filas.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.printf("%4d ", matriz[i][j]);
                sumaFilas += matriz[i][j];
            }
            System.out.printf("|| El sumatorio de la fila %d es: %d", i + 1, sumaFilas);
            sumaFilas = 0;
            System.out.println();
        }

        // bucle para recorrer la matriz y sumar las columnas de la matriz
        for (int i = 0; i < matriz[i].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaColumnas += matriz[j][i];
            }
            System.out.printf("El sumatorio de la columna %d es: %d%n", i + 1, sumaColumnas);
            sumaColumnas =0;
        }

    }
}
