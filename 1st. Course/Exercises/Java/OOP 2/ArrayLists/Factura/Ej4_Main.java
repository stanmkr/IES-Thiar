package Ejercicios_ArrayLists;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Ejercicios_ArrayLists
 * Date: febrero / 2022
 */
public class Ej4_Main {
    public static void main(String[] args) {

        Ej4_Factura miFactura = new Ej4_Factura("Id:5","5");
        miFactura.masLinea("hola",5,20);
        miFactura.masLinea("que tal",2,2);
        miFactura.mostrarFactura();

    }
}
