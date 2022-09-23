import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * Crea una clase de nombre funcionesArrays, en ella vamos a implementar varios métodos de ayuda.
 * Puedes utilizar el método main para probar el uso de las funciones, y recuerda definirlas como static.
 * <p>
 * · crearArrayEnt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * Parámetros de entrada, el tamaño del array, el límite mínimo y el límite máximo.
 * Parámetro de salida, un array de enteros.
 * · minimoArrayEnt: Devuelve el mínimo del array que se pasa como parámetro.
 * · maximoArrayEnt Devuelve el máximo del array que se pasa como parámetro.
 * · mediaArrayEnt: Devuelve la media del array que se pasa como parámetro.
 * · estaEnArrayEnt: Dice si un número está o no dentro de un array, ambos se pasan como parámetros
 * · posicionEnArrayEnt: Busca un número en un array, ambos se pasan como parámetros,
 * y devuelve la posición (el índice) en la que se encuentra. Devuelve -1 si no se encuentra.
 * · volteaArrayEnt: Le da la vuelta a un array que se le pasa como parámetro. Devuelve un nuevo array.
 * · copiarArrayEnt. Devuelve una copia del array que se pasa como parámetro.
 * · unirArrayEnt. A esta función se le pasan dos arrays de enteros y
 * nos devuelve un array de enteros igual a la unión del primer array y del segundo (en ese orden)
 * · rotaDerechaArrayEnt: Rota n posiciones a la derecha los números de un array.
 * No devuelve nada, se modifica el array que se pasa como parámetro.
 * · rotaIzquierdaArrayEnt: Rota n posiciones a la izquierda los números de un array.
 * No devuelve nada, se modifica el array que se pasa como parámetro.
 * · subArrayEnt: Devuelve un array subconjunto de otro array que se le pasa como parámetro, desde el índice n y conteniendo m elementos.
 * El array original, la posición inicial y el número de elementos se le pasa como parámetros
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        int[] miArray = crearArrayEnt(10, 3, 30);
        mostrarArray("Creado: ", miArray);
        System.out.println("\nMínimo: " + minimoArrayEnt(miArray));
        System.out.println("Máximo: " + maximoArrayEnt(miArray));
        System.out.println("Media: " + mediaArrayEnt(miArray));
        if (estaEnArrayEnt(miArray, 4))
            System.out.println("ESTA EL 5");
        else
            System.out.println("NO ESTA EL 5");

        System.out.println("La posición del mínimo es: " + posicionEnArrayEnt(miArray, minimoArrayEnt(miArray)));
        mostrarArray("Volteado: ", volteaArrayEnt(miArray));
        mostrarArray("\nLa copia del array que paso como parámetro: ", copiarArrayEnt(miArray));
        mostrarArray("\nLa union del array original + el array volteado es: ", unirArrayEnt(miArray, volteaArrayEnt(miArray)));
        rotaDerechaArrayEnt(miArray, 3);
        mostrarArray("\nrotoDerecha: ", miArray);
        rotaIzquierdaArrayEnt(miArray, 4);
        mostrarArray("\nrotoIzquierda: ", miArray);
        int[] subarray = subArrayEnt(miArray, 3, 4);
        mostrarArray("\nsubArray1: ", subarray);
        //subarray = subArrayEnt(miArray,5,5);
        mostrarArray("\nsubArray2: ", subArrayEnt(subarray, 2, 8));
    }

    /**
     * crea un array de un tamaño especifico introducido como parámetro, rellena los valores del array con números aleatorios, el rango de los números se introduce como parámetro
     *
     * @param length el tamaño del array
     * @param min    el mínimo
     * @param max    el número máximo
     * @return devuelve el array
     */
    public static int[] crearArrayEnt(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        return array;
    }

    /**
     * imprime por pantalla un array
     *
     * @param texto  texto a mostrar
     * @param vector el array
     */
    public static void mostrarArray(String texto, int[] vector) {
        System.out.print(texto);
        for (int valor : vector) {
            System.out.print(valor + " ");
        }
    }

    /**
     * comprueba si un número se encuentra dentro de una array que tambien se pasa como parámetro
     *
     * @param array  el array que se pasa como parametro
     * @param numero el número a comprobar
     * @return devuelve true/false
     */
    public static boolean estaEnArrayEnt(int[] array, int numero) {
        boolean esta = false;
        for (int valor : array) {
            if (numero == valor) {
                esta = true;
                break;
            }
        }
        return esta;
    }

    /**
     * busca el valor mínimo de una array que se pasa como parámetro
     *
     * @param array el array que se pasa como parámetro
     * @return devuelve el valor mínimo del array
     */
    public static int minimoArrayEnt(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int valor : array) {
            if (valor < min) {
                min = valor;
            }
        }
        return min;
    }

    /**
     * busca el valor máximo de una array que se pasa como parámetro
     *
     * @param array el array que se pasa como parámetro
     * @return devuelve el valor máximo del array
     */
    public static int maximoArrayEnt(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int valor : array) {
            if (valor > max) {
                max = valor;
            }
        }
        return max;
    }

    /**
     * calcula la media de los valores de un array que se pasa como parámetro
     *
     * @param array el array que se introduce como parámetro
     * @return devuelve la media de la suma
     */
    public static double mediaArrayEnt(int[] array) {
        double sumaValores = 0;
        for (int valor : array) {
            sumaValores += valor;
        }
        return sumaValores / array.length;
    }

    /**
     * busca un número introducido como parámetro en un array introducido como parámetro y devuelve su índice
     *
     * @param vector el array a introducir
     * @param num    el número
     * @return devuelve el índice del número o en su defecto -1
     */
    public static int posicionEnArrayEnt(int[] vector, int num) {
        int posicion = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                posicion = i + 1;
            }
        }
        return posicion;
    }

    /**
     * invierte un array que se pasa como parámetro y devuelve otro array distinto
     *
     * @param array el array normal
     * @return el array invertido
     */
    public static int[] volteaArrayEnt(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }

    /**
     * copia un array que se pasa como parámetro
     *
     * @param array el array original
     * @return la copia en otro array distinto
     */
    public static int[] copiarArrayEnt(int[] array) {
        int[] arrayCopia = new int[array.length];
        System.arraycopy(array, 0, arrayCopia, 0, array.length);
        return arrayCopia;

    }

    /**
     * une los valores de dos arrays que se pasan como parámetros
     *
     * @param array1 primer array
     * @param array2 segundo array
     * @return un nuevo array que es la suma de valor1 del array1 + el valor1 del array2 y asi sucesivamente
     */
    public static int[] unirArrayEnt(int[] array1, int[] array2) {
        int[] arrayUnion = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            arrayUnion[i] = array1[i] + array2[i];
        }
        return arrayUnion;
    }

    /**
     * Rota n posiciones a la derecha los números de un array. No devuelve nada, se modifica el array que se pasa como parámetro.
     *
     * @param array      el array que se recibe
     * @param posiciones las posiciones a rotar
     */
//    public static void rotaDerechaArrayEnt(int[] array, int posiciones) {
//        int[] arrayParaGuardar = new int[array.length];
//        System.arraycopy(array, 0, arrayParaGuardar, 0, array.length);
//        for (int i = 0; i < array.length; i++) {
//            if (i + posiciones >= array.length) {
//                posiciones = -i;
//            }
//            array[i + posiciones] = arrayParaGuardar[i];
//        }
//
    public static void rotaDerechaArrayEnt(int[] array, int posiciones) {
        int[] array1 = new int[posiciones];
        int[] array2 = new int[array.length - posiciones];
        for (int i = array.length-posiciones, j =0;i < array.length; i++, j++) {
            array1[j] = array[i];
        }
        for (int i = 0; i <array.length-posiciones ; i++) {
            array2[i] =array[i];
        }
        int[] array3 = unirArrayEnt(array1, array2);
        for (int i = 0; i < array3.length; i++) {
            array[i] = array3[i];
        }
    }

    /**
     * Rota n posiciones a la izquierda los números de un array. No devuelve nada, se modifica el array que se pasa como parámetro.
     *
     * @param array      el array que se recibe
     * @param posiciones las posiciones a rotar
     */
    public static void rotaIzquierdaArrayEnt(int[] array, int posiciones) {
        int[] arrayParaGuardar = new int[array.length];
        System.arraycopy(array, 0, arrayParaGuardar, 0, array.length);
        int z = 1;
        for (int i = array.length; i > 0; i--) {
            if (i - posiciones - 1 < 0) {
                posiciones = -i - 2;
            }

            array[i - posiciones - 1] = arrayParaGuardar[arrayParaGuardar.length - z];
            z += 1;
        }
    }

    /**
     * se crea y devuelve un array que es subconjunto de otro array que es pasado como parámetro
     *
     * @param array     el array del que se va a devolver el subconjunto
     * @param inicial   el valor inicial desde el que se va a empezar a devolver
     * @param elementos el número de elementos que contendrá el nuevo array
     * @return el array subconjunto
     */
    public static int[] subArrayEnt(int[] array, int inicial, int elementos) {
        int[] arraySub = new int[elementos];
        for (int i = 0; i < elementos; i++) {
            if (inicial > array.length) {
                arraySub[i] = 0;
                continue;
            }
            arraySub[i] = array[inicial - 1];
            inicial++;
        }
        return arraySub;
    }

}
