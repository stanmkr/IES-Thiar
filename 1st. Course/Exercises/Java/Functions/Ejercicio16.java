import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * Escribe un programa que cree un array del tamaño indicado por teclado y
 * luego lo rellene con valores aleatorios (utiliza Math.random()).
 * Implementa la función que rellena un array con valores aleatorios
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduce el tamaño que va a tener el array: ");
        int tamanyoArray = scanner.nextInt();
        int[] array = new int[tamanyoArray];
        valoresAleatoriosArray(array);
        for (int valores:array){
            System.out.print(valores + " ");
        }
    }

    /**
     * funcion que rellena con números aleatorios desde el 0 hasta 1 una array
     * @param cualquierArray el array que se pasa como parámetro
     */
    public static void valoresAleatoriosArray(int [] cualquierArray){
        for (int i = 0; i < cualquierArray.length ; i++) {
            cualquierArray[i] = (int)(Math.random()*101);
            //cualquierArray[i] = ThreadLocalRandom.current().nextInt(0,100);
        }
    }
}
