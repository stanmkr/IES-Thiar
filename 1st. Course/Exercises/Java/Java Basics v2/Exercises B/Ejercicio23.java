package EjerciciosB;

import java.util.Scanner;

/**
 * @author stani
 * Tema5
 * @date Noviembre 2021
 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0.
 * Al final se mostrará: El total de números introducidos, excluido el 0. El total de números fallados.
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declaración e inicialización de variables
        int numAnterior = 0;
        int num;
        int numInicial;
        int contadorFallidos = 0;
        int contadorTotales = 0;
        System.out.println("Vas a introducir números, siempre el número siguiente debe de ser mayor al anterior, si introduces un 0 el programa finalizará.");
        System.out.print("Dime un número inicial: ");
        numInicial = scanner.nextInt(); // pido un número inicial

        // bucle DoWhile, se repite lo mismo mientras el número introducido por teclado es distinto a 0, si se introduce 0 se sale del bucle
        do {
            contadorTotales ++; // sumo 1 a la variable almacen
            numAnterior = numAnterior + numInicial; // asigno valor al número anterior, este número sería el inicial en este caso
            System.out.print("Dime un número: ");
            num = scanner.nextInt(); // pido un número pot teclado
            if (num == 0){ // comprueba si el número introducido por el usuario es igual a 0, si se cumple hay una orden Continue que hace que empieze el bucle desde el principio, al empezar desde el principio se comprueba While (num != 0), da falso, por lo tanto se sale del bucle y se sigue con el código que hay fuera del bucle
                continue;
            }
            if (num <= numAnterior){ // condicional si el numero es menor al número que hay almacenado en anterior ejecuto las líneas de abajo
                System.out.println("Fallo es menor o igual.");
                contadorFallidos ++;
                numAnterior = num;
                numInicial = 0;
            } else { // en caso de que sea mayor, se ejecutaran éstas líneas de Else
                numAnterior = num;
                numInicial = 0;
            }
        } while (num != 0);

        System.out.printf("Total de números introducidos: %d %n", contadorTotales); // imprimo la variable contadora de los números totales introducidos
        System.out.printf("Números fallados: %d", contadorFallidos); // imprimo la variable contadora de los números fallidos introducidos

    }
}
