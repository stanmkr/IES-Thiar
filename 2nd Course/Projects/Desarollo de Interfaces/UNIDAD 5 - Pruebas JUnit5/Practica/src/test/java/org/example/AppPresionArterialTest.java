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

    private static Integer[][] valoresPulsoAtletaTrue() {
        return new Integer[][]{
                {39, 3}, {61, 4}, {50, 5}
        };
    }

    private static Integer[][] valoresPulsoAtletaFalse() {
        return new Integer[][]{
                {59, 0}, {101, 1}, {70, 2}
        };
    }

    @ParameterizedTest
    @MethodSource("valoresPulsoAtletaTrue")
    void diagnosticoPulsoAtletaTrue(int entrada, int esperado) {
        Assertions.assertEquals(esperado, app.diagnosticoPulso(entrada, true));

    }

    @ParameterizedTest
    @MethodSource("valoresPulsoAtletaFalse")
    void diagnosticoPulsoAtletaFalse(int entrada, int esperado) {
        Assertions.assertEquals(esperado, app.diagnosticoPulso(entrada, false));

    }

    @Test
    void diagnosticoTemperatura() {

    }
}