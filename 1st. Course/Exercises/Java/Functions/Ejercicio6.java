import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precios = new double[5];
        for (int i = 0; i < precios.length; i++) {
            System.out.printf("Introduce el precio para el producto %d: ", i + 1);
            precios[i] = scanner.nextDouble();
            System.out.printf("El PVP del producto %d es: %.2f%n", i+1, precioConIVA(precios[i]));
        }
        System.out.println("GRACIAS HASTA LUEGO");

    }

    /**
     * recibe un valor de tipo double y le suma un 21% (IVA)
     * @param valor se recibe un parametro de tipo double
     * @return devuelve el valor con un 21% aplicado
     */
    public static double precioConIVA(double valor) {
        double productoConIVA;
        productoConIVA = (valor * 0.21) + valor;
        return productoConIVA;
    }

}
