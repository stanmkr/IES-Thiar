import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones
 * diciembre - 2021
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        System.out.print("Introduce el primer número: ");
        numero1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        numero2 = scanner.nextDouble();
        System.out.println("El resultado de la multiplicación de los dos números es: " + multiplica(numero1, numero2));
    }

    /**
     *
     * @param valor1 primero parametro
     * @param valor2 segundo parametro para multiplicar por el primero
     * @return devuelve la multiplicacion
     */
    public static double multiplica(double valor1, double valor2) {
        double resultadoMultiplicacion = valor1 * valor2;
        return resultadoMultiplicacion;
    }

}
