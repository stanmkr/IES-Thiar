package EjerciciosC;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosC
 * Date: NOVIEMBRE / 2021
 * <p>
 * Define una matriz de 10x10 de enteros, rellena todos sus elementos de forma aleatoria entre 1 y 1000 sin que se repitan.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] miMatriz = new int[10][10];
        int numeroAnterior = 0;
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                miMatriz[i][j] = (int) (Math.random() * 20+1);
                if (miMatriz[i][j] == numeroAnterior){
                    do {
                        miMatriz[i][j] = (int) (Math.random() * 20+1);
                    }while (miMatriz[i][j] != numeroAnterior);
                } else {
                    numeroAnterior = miMatriz[i][j];
                }
            }
        }
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.print(miMatriz[i][j] + " ");
            }
            System.out.println();
        }



    }
}
