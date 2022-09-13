import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que lea dos números, calcule y muestre el valor de sus suma, resta, producto y división
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Vamos a calcular la suma de 2 números, la resta, la multiplicación y la división. ");
        System.out.print("Escribe el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Escribe el segundo número: ");
        num2 = scanner.nextDouble();
        double suma = num1 + num2;
        // CALCULAMOS LA SUMA ---------------------------------------------------
        System.out.printf("La suma de %.2f + %.2f es: %.2f\n", num1, num2, suma);
        // CALCULAMOS LA RESTA --------------------------------------------------
        double resta = num1 - num2;
        System.out.printf("La resta de %.2f - %.2f es: %.2f\n", num1, num2, resta);
        // CALCULAMOS LA PRODUCTO (MULTIPLICACIÓN) -------------------------------
        double multiplicacion = num1 * num2;
        System.out.printf("La multiplicación de %.2f * %.2f es: %.2f\n", num1, num2, multiplicacion);
        // CALCULAMOS LA DIVISION ------------------------------------------------
        double division = num1 / num2;
        System.out.printf("La división de %.2f / %.2f es: %.2f\n", num1, num2, division);

    }
}
