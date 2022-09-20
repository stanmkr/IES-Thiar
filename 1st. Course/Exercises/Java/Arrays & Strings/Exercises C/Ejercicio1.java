package EjerciciosC;
/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosC
 * Date: NOVIEMBRE / 2021
 * <p>
 * Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25 y luego muestre la matriz por pantalla.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] miArray = new int[5][5];
        int relleno = 1;
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray[i].length; j++) {
                miArray[i][j] = relleno;
                System.out.printf("%3d ", miArray[i][j]);
                relleno++;
            }
            System.out.println();
        }

/*        for (int []z:miArray) {
            System.out.println();
            for (int g:z) {
                System.out.print(g + " ");
            }
        }*/

    }
}
