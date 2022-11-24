package Ejercicio3;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio2
 * Date: Octubre / 2022
 */
public class ArrayReales implements Estadisticas{
    double[] valor;


    /**
     * Inicializa el atributo con números aleatorios.
     */
    public void asignar() {
        for (int i = 0; i <valor.length ; i++) {
            valor[i] = ThreadLocalRandom.current().nextDouble(1,101);
        }
    }

    /**
     * Devuelve el valor mínimo del vector.
     * @return el minimo del valor
     */
    public double minimo() {
        double minimo = this.valor[0];
        for (double valorDelArray : this.valor) {
            if (valorDelArray < minimo) {
                minimo = valorDelArray;
            }
        }
        return minimo;
    }

    /**
     * Devuelve el valor máximo del vector.
     * @return el maximo del valor
     */
    public double maximo() {
        double maximo = this.valor[0];
        for (double valorDelArray : this.valor) {
            if (valorDelArray > maximo) {
                maximo = valorDelArray;
            }
        }
        return maximo;
    }

    /**
     * Devuelve la suma de todos los valores del vector.
     * @return la suma de los numeros del valor
     */
    public double sumatorio() {
        double suma = 0;
        for (double valorDelArray : this.valor) {
            suma += valorDelArray;
        }
        return suma;
    }

    /**
     * Imprime todos los valores del valor
     */
    public void imprimir() {
        for (double valorDelArray : this.valor) {
            System.out.println(valorDelArray);
        }
    }

}
