package EjerciciosB;

import java.util.Scanner;

/**
 * @author stani
 * Tema5
 * @date noviembre 2021
 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFinal, totalMultiplos3 = 0; // declaro e inicializo dos variables, en una almacenaré la cantidad de múltiplos que he encontrado

        System.out.println("Vamos a contar los múltiplos de 3, desde el número 1 hasta el número que tu me digas.");
        System.out.print("Por favor, escribe el número en el cual quieres finalizar la cuenta: ");
        numFinal = scanner.nextInt(); // pido al usuario el número hasta el que voy a contar

        for (int i = 1; i <= numFinal; i++) { //hago un bucle For para recorrer los números desde el 1 hasta que i sea igual al número introducido por el usuario
            if (i % 3 == 0) { //hago un condicional para comprobar si al dividir el número actual de la vuelta, 1,2,3,4,.. entre el número 3 hay algun resto, si no hay ningun resto significa que el número es múltiplo de 3
                totalMultiplos3++; // si es verdadero, sumo a la variable almacen +1 por cada número que encuentre
            }
        }
        if (totalMultiplos3 > 0) { // hago una comprobación si el total de números es mayor a 0 significa que se ha encontrado algún múltiplo
            System.out.println(numFinal + " tiene " + totalMultiplos3 + " múltiplo" + ((totalMultiplos3 > 1) ? "s" : "") + " de 3.");
        }
        //System.out.printf("Cantidad de múltiplos de 3: %d",totalMultiplos3);

    }
}
