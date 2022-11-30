package Ejercicio1;

import java.io.Serializable;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios4
 * FECHA: Noviembre / 2022
 */
public class Cliente implements Serializable {
    private String nombre, direccion;
    private   int numCliente = 1;
    private static int identificador;
    private double saldo;
    private Cuenta estadoCuenta;

    //  CONSTRUCTOR

    public Cliente(String nombre, String direccion, double saldo, Cuenta estadoCuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        numCliente = numCliente + identificador++;
        this.saldo = saldo;
        this.estadoCuenta = estadoCuenta;

    }

    public Cuenta getEstadoCuenta() {
        return estadoCuenta;
    }

    @Override
    public String toString() {
        return "CLIENTE: " + nombre + " .... ID: " + numCliente + "  .... DIRECCIÓN: " + direccion + " .... SALDO: " + saldo + " .... ESTADO DE LA CUENTA BANCARIA: " + estadoCuenta;
    }
}
