import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que lea tres números distintos y nos diga cuál es el mayor.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        num3 = scanner.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.printf("El mayor es: %d", num1);
            } else{
                System.out.printf("El mayor es %d", num3);
            }
        } else if (num2 > num3){
            System.out.printf("El mayor es %d", num2);
        } else {
            System.out.printf("El mayor es %d", num3);
        }

    }
}
