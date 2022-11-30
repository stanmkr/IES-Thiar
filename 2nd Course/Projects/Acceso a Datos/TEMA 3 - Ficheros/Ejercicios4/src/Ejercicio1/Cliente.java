package Ejercicio1;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios4
 * FECHA: Noviembre / 2022
 */
public class Cliente {
    private String nombre, direccion;
    private int numCliente;
    private double saldo;
    private Cuenta estadoCuenta;

    //  CONSTRUCTOR

    public Cliente(String nombre, String direccion, int numCliente, double saldo, Cuenta estadoCuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numCliente = numCliente;
        this.saldo = saldo;
        this.estadoCuenta = estadoCuenta;

    }
}
