package EjerciciosC;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosC
 * Date: NOVIEMBRE / 2021
 * <p>
 * Define una matriz de 10x10 de enteros, rellena todos sus elementos de forma aleatoria entre 0 y 1000.
 * Busca el elemento máximo y el mínimo y muéstralo junto con sus posiciones.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] miMatriz = new int[10][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int[] maximoYminimo = new int[2];
        String posicionMinimo = "";
        String posicionMaximo = "";
        // relleno la matriz con números aleatorios entre 0 y 1000
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                miMatriz[i][j] = (int) (Math.random() * 1001);
                if (miMatriz[i][j] < minimo) {
                    minimo = miMatriz[i][j];
                    maximoYminimo[0] = miMatriz[i][j];
                    posicionMinimo = i + "," + j;
                }
                if (miMatriz[i][j] > maximo) {
                    maximo = miMatriz[i][j];
                    maximoYminimo[1] = miMatriz[i][j];
                    posicionMaximo = i + "," + j;

                }
            }
        }
        System.out.printf("El máximo de la matriz es: %d|%d || Índice en el que se encuentra: %s", maximo, maximoYminimo[1], posicionMaximo);
        System.out.printf("%nEl mínimo de la matriz es: %d|%d || Índice en el que se encuentra: %s%n", minimo, maximoYminimo[0], posicionMinimo);
        System.out.println("==== LA MATRIZ ====");
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.printf("%3d ", miMatriz[i][j]);
            }
            System.out.println();
        }

    }
}
