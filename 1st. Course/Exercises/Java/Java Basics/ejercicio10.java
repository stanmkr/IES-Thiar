import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que lee dos números, calcula y muestra el
 * valor de su suma, resta, producto y división. (Ten en cuenta la división por cero)
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Introduce el segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        // LA SUMA ---------------------
        double suma = num1 + num2;
        // LA RESTA --------------------
        double resta = num1 - num2;
        // LA DIVISIÓN -----------------
        double division = num1 / num2;
        // PRODUCTO -------------------
        double multiplicacion = num1 * num2;

        System.out.printf("SUMA --> %.2f + %.2f = %.2f %n", num1, num2, suma);
        System.out.printf("RESTA --> %.2f - %.2f = %.2f %n", num1, num2, resta);
        System.out.printf("MULTIPLICACIÓN --> %.2f * %.2f = %.2f %n", num1, num2, multiplicacion);

        if (num2 == 0) {
            System.out.println("No puedes dividir a 0");
        } else {
            System.out.printf("DIVISION --> %.2f / %.2f = %.2f ", num1, num2, division);
        }

    }
}