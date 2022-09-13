import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que toma como dato de entrada un número que corresponde a la longitud de un radio
 * y nos escribe la longitud de la circunferencia, el área del círculo y
 * el volumen de la esfera que corresponden con dicho radio
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio;
        System.out.print("Escribe el radio en cm: ");
        radio = scanner.nextDouble();
        double lado = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio,radio);
        double volumen = 4/3.0 * Math.PI * Math.pow(radio,3);
        System.out.printf("La longitud de la circunferencia es %f cm\n", lado);
        System.out.printf("El área de la circunferencia es %f cm\n", area);
        System.out.printf("El volumen de la circunferencia es %f cm\n", volumen);

    }
}
