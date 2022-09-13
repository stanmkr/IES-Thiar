import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que dado el precio de un artículo y
 * el precio de venta real nos muestre el porcentaje de descuento realizado.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el precio del artículo en €: ");
        double articulo = Double.parseDouble(scanner.nextLine());
        System.out.print("Introduce el precio de venta en €: ");
        double venta = Double.parseDouble(scanner.nextLine());
        double descuento = ((articulo - venta) * 100.0) / articulo;
        System.out.printf("El descuento es: %.2f", descuento);
    }
}
