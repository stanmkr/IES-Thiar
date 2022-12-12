package AgregarCliente;

import java.io.Serializable;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: PracticaObjetos
 * FECHA: Diciembre / 2022
 * **************************************
 * Creación de una aplicación para un sistema de facturación de clientes con la siguiente
 * información por cliente:
 * • Nombre.
 * • Dirección.
 * • número de cliente.
 * • Saldo.
 * • Cuenta (al día, atrasada, deudor).
 * El programa debe realizar:
 * • Crear el archivo pidiendo los datos por consola.
 * • Obtener un listado de todos los clientes.
 * • Obtener un listado de aquellos clientes que tienen Cuenta=deudor
 */
public class Cliente implements Serializable {
    private final String DNI;
    private final String nombre;
    private final String direccion;
    private final double saldo;
    private final String estado_cuenta;

    public Cliente(String DNI, String nombre, String direccion, double saldo, String estado_cuenta) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = saldo;
        this.estado_cuenta = estado_cuenta;
    }
}
