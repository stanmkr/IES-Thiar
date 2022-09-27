package Ejercicio8_Banco;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio8_Banco
 * Date: Febrero / 2022
 */
public class CuentaCorriente extends CuentaBancaria {

    //  CONSTRUCTOR
    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }


    //  MÉTODOS
    @Override
    public void calcularIntereses() {
        double interes = (getSaldo() * interesAnualBasico) / 100;
        this.ingresar(interes);
    }

    @Override
    public void mostrar() {
        System.out.println("Cuenta corriente... IBAN: " + this.getIban() + " SALDO: " + this.getSaldo());
    }


}
