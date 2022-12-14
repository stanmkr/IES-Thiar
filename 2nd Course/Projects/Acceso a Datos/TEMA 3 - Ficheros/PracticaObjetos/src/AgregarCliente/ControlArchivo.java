package AgregarCliente;

import java.util.ArrayList;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: PracticaObjetos
 * FECHA: Diciembre / 2022
 */
public class ControlArchivo {

    public static ArrayList<Cliente> listaClientes = new ArrayList<>();

    //FacturaciónAddCliente f = new FacturaciónAddCliente();
    public static void anyadir(String DNI, String nombreCliente, String direccionCliente, double saldo) {
        if (saldo == 0) {
            ControlArchivo.listaClientes.add(new Cliente(DNI, nombreCliente, direccionCliente, saldo, "al dia"));
        } else if (saldo < 0) {
            ControlArchivo.listaClientes.add(new Cliente(DNI, nombreCliente, direccionCliente, saldo, "deudor"));
        } else {
            ControlArchivo.listaClientes.add(new Cliente(DNI, nombreCliente, direccionCliente, saldo, "positivo"));
        }

    }
}
