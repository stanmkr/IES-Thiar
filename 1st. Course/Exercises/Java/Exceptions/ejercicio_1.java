import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un valor entero: ");
        int valor=0;
        try {
            valor = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();
        }
       System.out.println("El valor introducido: " + valor);
        scanner.nextLine();
        System.out.println("El programa sigue");
        System.out.print("Introduce un segundo valor entero: ");
        int valor2 = scanner.nextInt();
    }
}
