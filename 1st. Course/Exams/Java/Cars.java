import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * EjercicioCoches - PACKAGE_NAME
 * Date:  / 2021
 */
public class prueba {
    public static void main(String[] args) {
        int dias;
        Scanner scanner = new Scanner(System.in);
        String categoria;
        do {
            System.out.println("Por favor, introduce la categoría: ");
            categoria = scanner.next();

        } while (!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C"));

        int precioDiario = 10;

        if (categoria.equals("B")) {
            precioDiario = 15;
        } else if (categoria.equals("C")) {
            precioDiario = 20;
        }

        System.out.println("Por favor, introduce los días que vas a alquilar");
        dias = scanner.nextInt();

        double descuento = 0;
        double precioTotal = dias * precioDiario;

        if (dias > 7) {
            if (categoria.equals("C") && dias > 10) {
                descuento = precioTotal * 0.1;
            } else {
                descuento = precioTotal * 0.05;
            }
        }

        double anyos;
        System.out.println("Por favor, introduce los años que tienes el carnet de conducir");
        anyos = scanner.nextDouble();
        double suplemento = 0;



        if (anyos < 2) {
            if (categoria.equals("C")){
                descuento = 0;
                suplemento = precioTotal * 0.15;
            } else {
                descuento = 0;
                suplemento = precioTotal * 0.07;
            }
        }
        if (anyos < 2){
            System.out.printf("El precio final es %.2f con un suplemento de %.2f",precioTotal + suplemento, suplemento);
        } else {
            System.out.printf("El precio del alquiler es %.2f con un descuento de %.2f",precioTotal - descuento, descuento);

        }


    }
}
