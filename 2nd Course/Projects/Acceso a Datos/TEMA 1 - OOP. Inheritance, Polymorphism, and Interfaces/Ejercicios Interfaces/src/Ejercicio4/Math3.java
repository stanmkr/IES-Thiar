package Ejercicio4;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio4
 * Date: Octubre / 2022
 */
public final class Math3 implements Extremos {

    /**
     * @param a vector
     * @return Devuelve el valor mínimo del vector a[] de tipo int.
     */
    @Override
    public int min(int[] a) {
        int minimo = a[0];
        for (int valorDelArray : a) {
            if (valorDelArray < minimo) {
                minimo = valorDelArray;
            }
        }
        return minimo;
    }


    /**
     * @param a vector
     * @return Devuelve el valor máximo del vector a[]de tipo int.
     */
    @Override
    public int max(int[] a) {
        int maximo = a[0];
        for (int valorDelArray : a) {
            if (valorDelArray > maximo) {
                maximo = valorDelArray;
            }
        }
        return maximo;
    }

    /**
     * @param a vector
     * @return Devuelve el valor mínimo del vector a[] de tipo double.
     */

    @Override
    public double min(double[] a) {
        double minimo = a[0];
        for (double valorDelArray : a) {
            if (valorDelArray < minimo) {
                minimo = valorDelArray;
            }
        }
        return minimo;
    }

    /**
     * @param a vector
     * @return Devuelve el valor máximo del vector a[]de tipo double
     */
    @Override
    public double max(double[] a) {
        double maximo = a[0];
        for (double valorDelArray : a) {
            if (valorDelArray > maximo) {
                maximo = valorDelArray;
            }
        }
        return maximo;
    }
}
