import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
 * Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado.
 * Se debe crear una función a la que le pasemos ambos valores y nos devuelva el descuento.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cantidadSinDescuento, cantidadConDescuento;
        System.out.print("Introduce la cantidad SIN descuento: ");
        cantidadSinDescuento = scanner.nextDouble();
        do {
            System.out.print("Introduce la cantidad CON descuento aplicado: ");
            cantidadConDescuento = scanner.nextDouble();
            if (cantidadConDescuento > cantidadSinDescuento)
                System.out.println("El precio con descuento debe ser menor que el precio sin descuento.");
        } while (cantidadConDescuento > cantidadSinDescuento);
        System.out.printf("EL DESCUENTO ES: %.2f%%", descuento(cantidadSinDescuento, cantidadConDescuento));

    }

    /**
     * función que calcula el descuento realizado de un producto
     * @param conDescuento parametro del articulo con el precio original
     * @param sinDescuento parametro del articulo con el precio rebajado
     * @return devuelve el descuento que se ha realizado en porcentaje %
     */
    public static double descuento(double conDescuento, double sinDescuento) {
        return Math.abs((sinDescuento - conDescuento) * 100) / conDescuento;

    }
}
