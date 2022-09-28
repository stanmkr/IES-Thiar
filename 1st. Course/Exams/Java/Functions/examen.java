import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Developed by Stanislav Krastev 1º DAM
 * stanislav_examenFuncioones - PACKAGE_NAME
 * enero - 2022
 */
public class examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LA NOTA DE LA 2ª EVALUACIÓN ES: " + calculoNota2Eva(9, 8, 2, 100));
        System.out.println("LA LETRA DEL DNI ES: " + calculaLetraNIF(8296289));
        System.out.println("EL ARRAY SIN NÚMEROS ALEATORIOS: " + Arrays.toString(creaVector(10, false, 2, 10)));
        System.out.println("EL ARRAY CON NÚMEROS ALEATORIOS: " + Arrays.toString(creaVector(10, true, 2, 10)));
        int[] unVector = creaVector(10, false, 2, 20);
        System.out.println("¿EL VECTOR TIENE LOS DATOS IGUALES?: " + vectorDatosIgualesA(unVector,0));
        System.out.println("TU IDENTIFICADOR ES: " + identificadorUsuario("Stanislav", "miroslavov", "krastev"));
        int[][] matrizPruebas = {{1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 0, 0, 2}};
        mostrarVector(obtenerColumna(matrizPruebas, 3));

    }

    /**
     * calcula la nota de una 2ª evaluación dada la nota de la 1ª y las notas de 2 examenes y el porcentaje de ejercicios echos, el cálculo se realiza mediante una fórmula concreta
     *
     * @param notaEvaluacion1      la nota de la primera evaluación
     * @param examen1              la nota del primer examen
     * @param examen2              la nota del segundo examen
     * @param porcentajeEjercicios el porcentaje de ejercicios hechos
     * @return devuelve la nota de la segunda evaluación, el número a devolver será de tipo entero (int)
     */
    public static int calculoNota2Eva(double notaEvaluacion1, double examen1, double examen2, double porcentajeEjercicios) {
        double nota = (examen1 + examen2) / 2 * 0.5 + notaEvaluacion1 * 0.2 + porcentajeEjercicios * 0.03;
        return (int) nota;
    }

    /**
     * dado un número de DNI (sin la letra) devuelve la letra que le corresponde a dicho DNI
     *
     * @param dni el dni para al que vamos a calcular su letra
     * @return la letra que le corresponde al parámetro dni
     */
    public static char calculaLetraNIF(int dni) {
        String ASOC_NIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        int calculo = dni % 23;
        return ASOC_NIF.charAt(calculo);
    }

    /**
     * crea un vector de un tamaño determinado, con condición booleana para rellenar unos valores u otros, con un rango máximo y un rango mínimo
     *
     * @param tamanyo     el tamaño que tendrá el vector
     * @param aleatorios  el booleano, en caso de False rellena el vector con 0's, en caso de True rellena el vector con números aleatorios
     * @param rangoMinimo el rango mínimo que tendrá el número aleatorio
     * @param rangoMaximo el rango máximo que tendrá el número aleatorio
     * @return devuelve el vector relleno
     */
    public static int[] creaVector(int tamanyo, boolean aleatorios, int rangoMinimo, int rangoMaximo) {
        int[] vector = new int[tamanyo];
        int numAleatorio;
        if (aleatorios) {
            for (int i = 0; i < vector.length; i++) {
                numAleatorio = ThreadLocalRandom.current().nextInt(rangoMinimo, rangoMaximo + 1);
                vector[i] = numAleatorio;
            }
        } else {
            for (int i = 0; i < vector.length; i++) {
                vector[i] = 0;
            }
        }
        return vector;
    }

    /**
     * devuelve True/False en función de si el valor pasado es igual al valor de cada uno de los elementos de un array pasado como parámetro
     *
     * @param vector el vector que se pasa
     * @param valor  el valor que comprobamos
     * @return devuelve True si todos los elementos del vector sin iguales al valor, False en caso contrario
     */
    public static boolean vectorDatosIgualesA(int[] vector, int valor) {

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != valor) {
                return false;
            }
        }
        return true;
    }

    /**
     * crea un identificador cogiendo las 3 primeras letras del nombre, las 3 primeras del apellido1 y las 3 primeras del apellido2 y el número de vocales del nombre
     *
     * @param nombre    el nombre
     * @param apellido1 el apellido1
     * @param apellido2 el apellido2
     * @return devuelve un identificador compuesto por las 3 primeras letras del nombre, las 3 primeras del apellido1 y las 3 primeras del apellido2 y el número de vocales del nombre
     */
    public static String identificadorUsuario(String nombre, String apellido1, String apellido2) {
        String identificador = nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3);
            String voc = "aeiou";
        int vocales = 0;
        for (int i = 0; i < nombre.toLowerCase().length(); i++) {
            for (int k = 0; k <= voc.length()-1; k++) {
                if (voc.charAt(k) == nombre.toLowerCase().charAt(i)) {
                    vocales++;
                }
            }
        }

        identificador += vocales;
        return identificador.toLowerCase();

    }

    /**
     * se obtiene un vector que el valor de sus elementos es igual al valor de los elementos de la columna a una matriz que se le pasa como parámetro
     *
     * @param matriz la matriz que se le pasa
     * @param numero el número de la fila de la matriz
     * @return devuelve un vector con esos valores que tiene la columna de la matriz
     */
    public static int[] obtenerColumna(int[][] matriz, int numero) {
        int z = 0;
        int tamanyo = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == z) {
                    z++;
                    tamanyo++;
                    break;
                }
            }
        }
        int[] miVector = new int[tamanyo];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                miVector[i] = matriz[i][numero];

            }
        }

        return miVector;
    }

    /**
     * para hacer puebas
     *
     * @param vector
     */
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
