import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * enero - 2022
 */
public class Buscaminas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int columnas, filas, minas;
        System.out.println("Vamos a generar una matriz que simulará el juego del buscaminas. Tienes que introducir el tamaño de la matriz. ¡Vamos a ello!");
        System.out.print("Introduce la cantidad de filas quieres que tenga la matriz: ");
        columnas = scanner.nextInt();
        System.out.print("Introduce la cantidad de columnas que quieres que tenga la matriz: ");
        filas = scanner.nextInt();
        System.out.print("Bien, ahora introduce la dificultad, es decir, la cantidad de minas que quieres tener: ");
        minas = scanner.nextInt();

        int[][] buscaminas = crearTablero(columnas, filas, minas);
        int indice,indice2;

        System.out.println("Esta es la matriz: ");
        mostrarMatriz(buscaminas,true);
//        System.out.println();
//        for (int i = 0; i <buscaminas.length ; i++) {
//            for (int j = 0; j <buscaminas[0].length ; j++) {
//                System.out.print("_ ");
//            }
//            System.out.println();
//        }
        boolean GameOver = false;
        do {

            System.out.print("\nIntroduce un indice: ");
            indice = scanner.nextInt();
            System.out.print("Introduce un indice2: ");
            indice2 = scanner.nextInt();
            if (tirada(buscaminas, indice, indice2)) {
                System.out.println("Hay una mina");
                mostrarMatriz(buscaminas, false);
                System.out.println("HAS PISADO UNA MINA, GAME OVER");
                GameOver = true;
            } else {
                System.out.println("NO hay una mina");
                mostrarMatriz(buscaminas, false);
            }
        }while (!GameOver);


    }

    /**
     * crea un array bidimensional n x m que se pasan como parámetros + un tercer parametro que serían la cantidad de 1 con los que se va a rellenar el array en posiciones aleatorias, las demas posiciones tendran un valor 0
     * @param columnas el número de columnas que tendrá
     * @param filas el numero de filas que tendra
     * @param minas el número de 1's que tendrá
     * @return devuelve un array
     */
    public static int[][] crearTablero(int columnas, int filas, int minas) {
        int[][] buscaminas = new int[columnas][filas];
        for (int i = 0; i < buscaminas.length; i++) {
            for (int j = 0; j < buscaminas[i].length; j++) {
                buscaminas[i][j] = 0;
            }
        }
        for (int k = 0; k < minas; k++) {
            int aleatorio = ThreadLocalRandom.current().nextInt(0, buscaminas.length);
            int aleatorio2 = ThreadLocalRandom.current().nextInt(0, buscaminas.length);
            if (buscaminas[aleatorio][aleatorio2] == 1) {
                k--;
                continue;
            }
            buscaminas[aleatorio][aleatorio2] = 1;
        }
        return buscaminas;


    }

    public static boolean tirada(int [][] matriz, int indice, int indice2){
        boolean hay1 = true;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length ; j++) {
                if (matriz[indice][indice2] == 0) {
                    matriz[indice][indice2] = -1;
                    hay1 = false;
                    break;
                }
            }
        }
        return hay1;

    }

    public static void mostrarMatriz (int [][]matriz, boolean valor){
        if (valor){
            for (int i = 0; i <matriz.length ; i++) {
                for (int j = 0; j <matriz[0].length ; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < matriz.length ; i++) {
                for (int j = 0; j <matriz[0].length ; j++) {
                    if (matriz[i][j] == 0 || matriz[i][j] == 1){
                        System.out.print("_ ");
                    } else if (matriz[i][j] == -1){
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
        }
    }
}
