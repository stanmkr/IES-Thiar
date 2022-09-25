package ejercicios.ejerciciosE;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 * <p>
 * Crea un programa con una clase llamada Articulo con los siguientes atributos: nombre, precio (sin IVA), IVAgeneral (siempre será 21) y cuantosQuedan
 * (representa cuantos quedan en el almacén).
 * <p>
 * En el main de la clase principal instancia un objeto de la clase artículo.
 * Asígnale valores a todos sus atributos (los que quieras) y muestra por pantalla un mensaje del estilo “Pijama - Precio:10€ -IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el precio con IVA).
 * Luego, cambia el precio y vuelve a imprimir el mensaje.
 */
public class Articulo {
    Scanner scanner = new Scanner(System.in);
    private String nombre;
    private double precioSinIVA;
    public final double IVAgeneral = 21;
    public final double IVAreducido = 10;
    public final double IVAsuperReducido = 4;
    public String tipoProducto;
    private int stock;

    public Articulo(String nombre, String tipo, double precioSinIVA, int stock) {
        this.nombre = nombre;
        this.precioSinIVA = precioSinIVA;
        this.stock = stock;
        tipoProducto = tipo;
        if (stock < 0) {
            System.err.println("No es posible stock negativo");
        }
        if (precioSinIVA < 0) {
            System.err.println("No es posible precio negativo");
            this.precioSinIVA = 0;
        }
        //  this.IVAgeneral = IVAgeneral;
//        if (IVAgeneral < 0) {
//            System.err.println("No es posible IVA negativo");
//        } else {
//            this.IVAgeneral = IVAgeneral;
//        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(double precioSinIVA) {
        if (precioSinIVA < 0) {
            System.err.println("ERROR, no es posible precio negativo.");
        } else {
            this.precioSinIVA = precioSinIVA;
        }
    }

    public double getIva() {
        if (tipoProducto.equalsIgnoreCase("general")) {
            return IVAgeneral;
        } else if (tipoProducto.equalsIgnoreCase("reducido")) {
            return IVAreducido;
        } else if (tipoProducto.equalsIgnoreCase("super reducido")) {
            return IVAsuperReducido;
        }
        return IVAgeneral;
    }

//    public void setIva(double IVAgeneral) {
//        if (IVAgeneral < 0) {
//            System.err.println("ERROR, no es posible IVA negativo.");
//        } else {
//            this.IVAgeneral = IVAgeneral;
//        }
//    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.err.println("ERROR, no es posible stock negativo.");
        } else {
            this.stock = stock;
        }
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }


    // MÉTODOS
    // Método para imprimir la información del artículo por pantalla.
    public void imprimir() {
        System.out.printf("%s (tipo: %s) | stock:%d | --> Precio: %.2f€ - IVA: %.2f%% - PVP: %.2f%n", nombre, tipoProducto, stock, precioSinIVA, getIva(), getPVP());
    }

    //Método getPVP que devuelva el precio de venta al público (PVP) con IVAgeneral incluido.
    public double getPVP() {
        return ((precioSinIVA * getIva()) / 100) + precioSinIVA;
    }

    // Método getPVPDescuento que devuelva el PVP con un descuento (en porcentaje) pasado como argumento.
    public double getPVPDescuento(double descuento) {
        return getPVP() - (getPVP() * (descuento / 100));
    }

    //Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’ (si es posible). Devolverá true si ha sido posible (false en caso contrario).
    public boolean vender(int cantidad) {
        if (stock - cantidad < 0) {
            return false;
        } else {
            setStock(this.stock - cantidad);
            return true;
        }
    }

    // Método almacenar que actualiza los atributos del objeto tras almacenar una cantidad ‘x’ (si es posible). Devolverá true si ha sido posible (false en caso contrario).
    public boolean almacenar(int cantidad) {
        if (cantidad < 0) {
            return false;
        } else {
            setStock(this.stock + cantidad);
            return true;
        }
    }
}
