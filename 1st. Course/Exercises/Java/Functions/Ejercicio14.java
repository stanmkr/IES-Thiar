import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * enero - 2022
 *
 * Escribe una función que muestre por pantalla un triángulo como el del ejemplo.
 * Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
 *    a
 *   aaa
 *  aaaaa
 * aaaaaaa
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce el caracter que se imprime: ");
        char caracter = scanner.next().charAt(0);
        System.out.print("introduce el numero de lineas a imprimir: ");
        int lineas = scanner.nextInt();
        piramide(caracter,lineas);
    }
    public static void piramide (char caracter, int lineas){
        // altura piramide
        for (int i = 1; i <= lineas ; i++) {
            // espacio blanco
            for (int espacios = 1; espacios <= lineas-i ; espacios++) {
                System.out.println(" ");
            }
            // caracter a imprimir
            for (int cantidad = 1; cantidad <= (i*2)-1 ; cantidad++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
