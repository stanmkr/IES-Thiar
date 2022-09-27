package Ejercicio8_Banco;

import java.util.ArrayList;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio8_Banco
 * Date: Febrero / 2022
 */
public class main {
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        CuentaCorriente miCc = new CuentaCorriente("ES 1921 3123 3123 5555",600);
        CuentaAhorro miCa = new CuentaAhorro("ES 2222 4565 7687 9865", 200);
        CuentaAhorro miCa2 = new CuentaAhorro("ES 2222 4565 7687 9865", 900);

        cuentas.add(miCc);
        cuentas.add(miCa);
        cuentas.add(miCa2);

        for (CuentaBancaria c:cuentas) {
            c.mostrar();
        }

        miCc.ingresar(300);
        miCa.retirar(50);
        for (CuentaBancaria c:cuentas) {
            c.mostrar();
        }
        miCc.traspasar(100,miCa);
        miCa.mostrar();

        System.out.println();
        for (CuentaBancaria c:cuentas) {
            c.calcularIntereses();
            c.mostrar();
        }
    }
}
