package Ejercicios_ArrayLists;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Ejercicios_ArrayLists
 * Date: febrero / 2022
 */
public class Ej4_Factura {
    private String identificador;
    private LocalDate fechaAlta;
    private String numeroCliente;
    private static final int IVA = 21;
    private ArrayList<Ej4_LineaFactura> lineas;
    private double importeTotal;

    // constructor
    public Ej4_Factura(String identificador, String numeroCliente) {
        this.identificador = identificador;
        this.numeroCliente = numeroCliente;
        this.fechaAlta = LocalDate.now();
        this.lineas = new ArrayList<>();
        this.importeTotal = 0;
    }

    public void masLinea(String descripcion, double precioUnitario, int cantidadUnidades) {
        Ej4_LineaFactura linea = new Ej4_LineaFactura(descripcion, precioUnitario, cantidadUnidades);
        lineas.add(linea);
        this.importeTotal += linea.getImporteLinea();
    }

    public void menosLinea(int indice) {
        Ej4_LineaFactura linea = lineas.remove(indice);
        this.importeTotal -= linea.getImporteLinea();
    }


    public void mostrarFactura() {
        System.out.println("------------ FACTURA ------------");
        System.out.println("Factura ID: " + identificador);
        System.out.println("Fecha alta: " + fechaAlta);
        System.out.println("Nº de cliente: " + numeroCliente+"\n");

        for (Ej4_LineaFactura linea : lineas) {
            System.out.println(linea);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Importe total de la factura sin IVA: " + importeTotal);
        System.out.println("Importe total de la factura IVA incl. 21%: " + importeTotal * (100 + IVA) / 100);
    }
}


