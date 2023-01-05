package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Created by Stanislav Krastev
 * Practica - org.example
 * Date:  / 2023
 */
class AppPresionArterialTest {
    AppPresionArterial app = new AppPresionArterial();

    /**
     * Método para las pulsaciones en caso de que la casilla de Atleta SI esté seleccionada, del cual se van a extraer datos para hacer el test parametrizado de multiples valores
     * @return Matriz de números, en la primera posicion devolverá el valor introducido junto a su valor esperado {introducido 39 .. esperado 3} y asi sucesivamente
     */
    private static Integer[][] valoresPulsoAtletaTrue() {
        return new Integer[][]{
                {39, 3}, {61, 4}, {50, 5}
        };
    }

    /**
     * Método para las pulsaciones en caso de que la casilla de Atleta NO esté seleccionada, del cual se van a extraer datos para hacer el test parametrizado de multiples valores
     *
     * @return Matriz de números, en la primera posicion devolverá el valor introducido junto a su valor esperado {introducido 58 .. esperado 0} y asi sucesivamente
     */
    private static Integer[][] valoresPulsoAtletaFalse() {
        return new Integer[][]{
                {59, 0}, {101, 1}, {70, 2}
        };
    }


    /**
     * El test del método de medir el pulso, en caso de que la casilla Atleta esté seleccionada
     * @param entrada del método <valoresPulsoAtletaTrue> el primer valor de la matriz
     * @param esperado del método <valoresPulsoAtletaTrue> el segundo valor de la matriz
     */
    @ParameterizedTest
    @MethodSource("valoresPulsoAtletaTrue")
    void diagnosticoPulsoAtletaTrue(int entrada, int esperado) {
        Assertions.assertEquals(esperado, app.diagnosticoPulso(entrada, true));

    }

    /**
     * El test del método de medir el pulso, en caso de que la casilla Atleta NO esté seleccionada
     * @param entrada del método <valoresPulsoAtletaTrue> el primer valor de la matriz
     * @param esperado del método <valoresPulsoAtletaTrue> el segundo valor de la matriz
     */
    @ParameterizedTest
    @MethodSource("valoresPulsoAtletaFalse")
    void diagnosticoPulsoAtletaFalse(int entrada, int esperado) {
        Assertions.assertEquals(esperado, app.diagnosticoPulso(entrada, false));

    }



    /**
     * Método para la temperatura del cual se van a extraer datos para hacer el test parametrizado de multiples valores
     * @return Matriz de números, en la primera posicion devolverá el valor introducido junto a su valor esperado {introducido 39 .. esperado 3} y asi sucesivamente
     */
    private static Double[][] valoresTemperatura() {
        return new Double[][]{
                {30.0, 0.0}, {36.0, 1.0}, {37.8, 2.0}, {39.0,3.0}
        };
    }


    /**
     * l test del método de medir la temperatura
     * @param entrada del método <valoresTemperatura> el primer valor de la matriz
     * @param esperado del método <valoresTemperatura> el segundo valor de la matriz
     */
    @ParameterizedTest
    @MethodSource("valoresTemperatura")
    void diagnosticoTemperatura(double entrada, double esperado) {
        Assertions.assertEquals(esperado,app.diagnosticoTemperatura(entrada));
    }




}