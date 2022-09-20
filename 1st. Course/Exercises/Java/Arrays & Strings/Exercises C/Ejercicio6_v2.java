package EjerciciosC;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosC
 * Date:  / 2021
 */
public class Ejercicio6_v2 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][3];
        // Rellenamos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        // Matriz auxiliar para sumar las columnas
        int[] sumaColumnas = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            int sumafila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
                sumafila += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
            System.out.printf("%4d%n", sumafila);
        }
        // Mostramos la suma de las columnas
        for (int c : sumaColumnas)
            System.out.printf("%4d", c);
    }
}
