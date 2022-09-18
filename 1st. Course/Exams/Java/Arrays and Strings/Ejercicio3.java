import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * EXAMEN_ARRAY_STRING - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanyo;
        System.out.print("Introduce el tamaño del array: ");
        tamanyo = scanner.nextInt();
        int[] miarray = new int[tamanyo];
        for (int i = 0; i < miarray.length; i++) {
            miarray[i] = (int) (Math.random() * 999+1); // asigno aleatorio a cada elemento de la array
        }
        int columna = 0; // variable contador
        for (int i = 0; i < miarray.length ; i++) {
            columna++;
            System.out.printf("%3d ",miarray[i]);
            if (columna% 5 == 0){ // si al dividir de 5 tengo resto 0 salto de linea
                System.out.println();
            }
        }


    }
}
