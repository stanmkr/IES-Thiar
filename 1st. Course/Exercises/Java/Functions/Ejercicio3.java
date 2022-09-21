import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Por favor introduce el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Por favor introduce el segundo número: ");
        numero2 = scanner.nextInt();
        System.out.println("El menor de los dos números es " + minimo(numero1, numero2));

    }

    /**
     * comprueba cual de los dos números es menor
     *
     * @param valor1 primero numero a comprobar
     * @param valor2 segundo numero a comprobar
     * @return devuelve el menor
     */
    public static int minimo(int valor1, int valor2) {
        return Math.min(valor1, valor2);
        // return (valor1<valor2)?valor1:valor2;
     /*
        if (valor1 < valor2) {
            return valor1;
        } else {
            return valor2;
        }
      */
    }
}
