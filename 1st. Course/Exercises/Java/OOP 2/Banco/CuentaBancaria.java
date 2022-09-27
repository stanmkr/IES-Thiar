package Ejercicio8_Banco;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio8_Banco
 * Date: Febrero / 2022
 */
public abstract class CuentaBancaria {
    private String Iban;
    private double saldo;
    public static final double interesAnualBasico = 2.5;

    //  CONSTRUCTOR
    public CuentaBancaria(String iban, double saldo) {
        Iban = iban;
        this.saldo = saldo;
    }

    //  MÉTODOS
    public void anyadir(double cantidad){
        this.saldo += cantidad;
    }

    public void ingresar(double ingreso){
        anyadir(ingreso);
    }

    public void retirar(double cantidad){
        anyadir(-cantidad);
    }

    public void traspasar(double cantidad, CuentaBancaria cuenta){
        cuenta.ingresar(cantidad);
        this.retirar(cantidad);
    }



    //  MÉTODOS ABSTRACTOS
    public abstract void calcularIntereses();
    public abstract void mostrar();

    //  GETTERS Y SETTERS
    public String getIban() {
        return Iban;
    }

    public void setIban(String iban) {
        Iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
