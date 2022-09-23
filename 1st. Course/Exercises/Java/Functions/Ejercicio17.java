import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos, para cada número introducido si es primo o no.
 * Hay que recordar que un número es primo si es divisible por si mismo y por 1.
 * El 1 no es primo por convenio. Se debe crear una función que pasándole un número entero devuelva si es primo o n
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUser;
        System.out.println("Introduce número y te diré si es primo o no. Si introduces un 0 el programa terminará.");
        do {
            System.out.print("Introduce número: ");
            numUser = scanner.nextInt();
            if (numUser==0){
                System.out.println("HAS DECIDIDO SALIR DEL PROGRAMA.");
                break;
            }
            System.out.printf("EL número %s%n", primoNoPrimo(numUser));
        } while (numUser != 0);

    }

    /**
     * función que calcula dado un número, cuantos divisores tiene, si tiene 2 el número es primo, si tiene menos o mas de 2, no es primo
     * @param numero el número que se le pasará a la función
     * @return devuelve un resultado en formato String
     */
    public static String primoNoPrimo(int numero) {
        String resultado;
        int divisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            resultado = "ES PRIMO";
        } else {
            resultado = "NO ES PRIMO";
        }
        return resultado;
    }
}
