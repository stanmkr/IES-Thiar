import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
 * Para ello implementa una función que reciba como parámetro un número entero y muestre por pantalla la tabla de multiplicar de dicho número.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        tablaMultiplicacion(numero);
    }
    /**
     * función que muestra la tabla de multiplicación de un valor que se le pasa como parámetro
     *
     * @param num el número del cual se mostrará la tabla de multiplicar
     */
    public static void tablaMultiplicacion(int num) {

        System.out.println("TABLA DE MULTIPLICAR DE " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", num, i, num * i);
        }
    }
}
