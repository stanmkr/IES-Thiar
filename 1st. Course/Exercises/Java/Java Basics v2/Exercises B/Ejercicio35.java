package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema5 - EjerciciosB
 * noviembre - 2021
 * <p>
 * Hacer un programa para llevar el control de venta de entradas. Lo primero que ha de hacer es pedir la cantidad de entradas que se pondrán a la venta,
 * después irá solicitando la cantidad de entradas que quiere comprar, estando limitado a un máximo de 10 por cliente.
 * El programa finalizará cuando se agoten las entradas mostrando la cantidad de entradas que se ha llevado el que más ha comprado.
 * Si un cliente introduce un número negativo o mayor que 10 le informe de su error y le obligue a meter correctamente las entradas que desea,
 * las veces que sea necesario hasta que lo haga bien.
 */
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // inicialización de variables
        int totalEntradas = 0;
        int entradaUsuario = 0;
        int maximo = 0;
        System.out.print("Introduce el Nº total de entradas: ");
        totalEntradas = scanner.nextInt(); // pido al usuario introducir un nº total de entradas

        do { // bucle do while, hasta que se agoten las entradas
            System.out.print("¿Cuantas entradas quiere comprar señor/a?: ");
            entradaUsuario = scanner.nextInt(); // pido al usuario introducir cuantas entradas quiere comprar
            if (entradaUsuario > totalEntradas) { // si lo que introduce es mayor a las que hay en stock se ejecuta las líneas de abajo y hay un Continue que hace que omita todas las líneas de abajo y vaya directamente a la comprobación del bucle while, por lo tanto volverá a empezar el programa desde el bucle while
                System.out.println("La cantidad que quieres compra es superior al stock de entradas.");
            } else if (entradaUsuario <= 0 || entradaUsuario > 10) { // condicional si las entradas introducidas por el usuario estan en este rango se ejecuta la línea de abajo
                System.out.println("Número de entradas no válido, introduce un valor del 1 al 10.");
            } else { // en caso de que no se ejecute el if de arriba, se ejecutará este else
                totalEntradas -= entradaUsuario; // al total le resto las entradas compradas
                System.out.printf("Entradas disponibles: %d %n", totalEntradas); // muestro las disponibles, las que quedan.
                if (entradaUsuario > maximo) { //compruebo, dentro del else, de esta manera me aseguro que se ha introducido un valor válido, si las entradas solícitadas son mayores que el máximo inicial (0), si es verdadero, guardo estas entradas como el máximo actual hasta la siguiente vuelta.
                    maximo = entradaUsuario;
                }
            }
        } while (totalEntradas > 0);

        System.out.printf("Se han agotado las entradas. %n");
        System.out.printf("El número máximo de entradas que se han comprado ha sido: %d", maximo); // imprimo el máximo del bucle while
    }
}
