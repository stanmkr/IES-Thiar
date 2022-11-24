import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios Acepta El Reto - PACKAGE_NAME
 * Date: Octubre / 2022
 */
public class Kaprekar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce número y te diré si es Kaprekar (mayor a 3 por favor): ");
        int input = scanner.nextInt();

        while (input != 0) {
            boolean kaprekar = false;
            if (!esValido(input)) {
                System.out.println("Tu número no esta entre 1 y 65536.");
            } else {
                int alCuadrado = input * input;
                String numero = Integer.toString(alCuadrado);
                int longitud = numero.length();
                int mitad = longitud / 2;
                int parte1, parte2;
                parte1 = Integer.parseInt(numero.substring(0, mitad));
                parte2 = Integer.parseInt(numero.substring(mitad));
                if (parte1 + parte2 == input) {
                    kaprekar = true;
                }
                if (kaprekar) {
                    System.out.printf("SI %d es Kaprekar\n", input);
                } else {
                    System.out.printf("NO %d no es Kaprekar\n", input);
                }
            }
            System.out.print("\nIntroduce número: ");
            input = scanner.nextInt();
        }
    }


    private static boolean esValido(int numero) {
        return numero >= 1 && numero < 65536;
    }
}
