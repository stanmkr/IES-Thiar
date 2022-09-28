package Ejercicios_ArrayLists;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Ejercicios_ArrayLists
 * Date: febrero / 2022
 */
public class Ej4_LineaFactura {
    private String descripcion;
    private double precioUnitario;
    private int cantidadUnidades;
    private static final int DESCUENTO = 5;


    //private static final int DESCUENTO=5;
    private double importeLinea;


    public Ej4_LineaFactura(String descripcion, double precioUnitario, int cantidadUnidades) {
        this.descripcion = descripcion;
        this.precioUnitario=precioUnitario;
        this.cantidadUnidades = cantidadUnidades;
        this.importeLinea = precioUnitario * cantidadUnidades;
        if (cantidadUnidades > 10) {
            importeLinea *= (100 - DESCUENTO) / 100.0;
        }

    }

    @Override
    public String toString() {
        return "---------- Línea de factura ----------" +
                "\nDESCRIPCIÓN: '" + descripcion + '\'' +
                "\nPRECIO UNITARIO: " + precioUnitario +
                "\nCANTIDAD DE UDS: " + cantidadUnidades +
                "\nIMPORTE TOTAL: " + importeLinea;
    }


    // GETTERS & SETTERS
    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
        this.importeLinea = precioUnitario * cantidadUnidades;
        if (cantidadUnidades > 10) {
            importeLinea *= (100 - DESCUENTO) / 100.0;
        }

    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    public double getImporteLinea() {
        return importeLinea;
    }
}
