package Ejercicio8_Banco;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio8_Banco
 * Date: Febrero / 2022
 */
public class CuentaAhorro extends CuentaBancaria {
    final double saldoMinimo = 500;

    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        double interes;
        if (this.getSaldo() < saldoMinimo) {
            interes = getSaldo() * (interesAnualBasico / 2) / 100;
        } else {
            interes = getSaldo() * (interesAnualBasico * 2) / 100;
        }
        this.ingresar(interes);
    }

    @Override
    public void mostrar() {
        System.out.println("Cuenta Ahorro... IBAN: " + this.getIban() + " SALDO: " + this.getSaldo());
    }


}
