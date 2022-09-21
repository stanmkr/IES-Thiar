import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Por favor introduce un número: ");
        numero = scanner.nextInt();
        System.out.println("NEGATIVO = -1 || POSITIVO = 1 || CERO = 0");
        System.out.println("El número es "+ dimeSingo(numero));
    }

    /**
     * comprueba un valor entero si es positivo, negativo o 0
     * @param valor valor entero
     * @return muestra -1 para negativo, 1 para positivo, 0 para 0
     */
    public static int dimeSingo(int valor) {
        int resultado;
        if (valor > 0) {
            resultado = 1;
        } else if (valor < 0) {
            resultado = -1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

}
