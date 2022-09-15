package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 *
 *Realiza un programa que muestre un menú en pantalla:
 *
 * 1. Sumar
 *
 * 2. Restar
 *
 * 3. Multiplicar
 *
 * 4. Dividir
 *
 * 0. Salir
 *
 * Introduce la opción deseada:
 *
 * El programa leerá la opción del menú, mostrará un mensaje con la opción que ha pulsado y volverá a
 * mostrar el menú hasta que se elija la opción de Salir.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;
        do {
            System.out.println(" ");
            System.out.println("ESTE ES EL MENU");
            System.out.println("....................");
            System.out.println(" ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println(" ");
            System.out.println("....................");
            System.out.println("INTRODUCE LA OPCIÓN DESEADA INGRESANDO EL NÚMERO");
            opc = scanner.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Estas en el menú de SUMAR <----");
                    break;
                case 2:
                    System.out.println("Estas en el menú de RESTAR <----");
                    break;
                case 3:
                    System.out.println("Estas en el menú de MULTIPLICAR <----");
                    break;
                case 4:
                    System.out.println("Estas en el menú de DIVIDIR <----");
                    break;
                case 0:
                    System.out.println("Has decidido SALIR. ¡HASTA LA PRÓXIMA! <----");
                    break;
                default:
                    System.out.println("Has introducido un valor NO válido, por favor introduce un número del menú <----");
            }
        }while (opc != 0);

    }
}
