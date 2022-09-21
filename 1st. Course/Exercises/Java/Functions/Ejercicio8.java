import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        System.out.print("Introduce un valor: ");
        valor = scanner.nextInt();
        System.out.println("------------------------------");
        System.out.printf("EL SUMATORIO DE 1 A %d es: %d", valor, suma1aN(valor));
        System.out.println("\n------------------------------");
        System.out.printf("EL PRODUCTORIO DE 1 A %d es: %d", valor, producto1aN(valor));
        System.out.println("\n------------------------------");
        System.out.printf("EL INTERMEDIO DE 1 A %d es: %.2f", valor, intermedio(valor));

    }

    /**
     * función que calcula el sumatorio de 1 hasta el parámetro introducido
     *
     * @param valorN es el parámetro introducido
     * @return devuelve el sumatorio de 1 hasta N
     */
    public static int suma1aN(int valorN) {
        int sumatorio = 0;
        for (int i = 1; i <= valorN; i++) {
            sumatorio += i;
        }
        return sumatorio;
    }

    /**
     * función que calcula el productorio de 1 hasta un parámetro N
     *
     * @param valorN el parámetro hasta el que se va a calcular el productorio
     * @return devuelve el productorio de 1 hasta N
     */
    public static int producto1aN(int valorN) {
        int producto = 1;
        for (int i = 1; i <= valorN; i++) {
            producto *= i;
        }
        return producto;
    }

    public static double intermedio(int valorN) {
        return (valorN-1) / 2.0;
    }

}
