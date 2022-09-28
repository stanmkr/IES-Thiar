import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2, resultado;
        try {
            System.out.print("Introduce el 1er valor: ");
            valor1 = scanner.nextInt();
            System.out.print("Introduce el 2º valor: ");
            valor2 = scanner.nextInt();
            resultado = valor1 / valor2;
            System.out.println("El resultado de la division de los números es: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("No es posible división de 0");
            e.printStackTrace();
        }
        System.out.println("El programa finaliza");
    }
}
