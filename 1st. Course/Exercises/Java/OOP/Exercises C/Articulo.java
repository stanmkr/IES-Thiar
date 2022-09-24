package ejercicios.ejerciciosC;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 *
 * Crea un programa con una clase llamada Articulo con los siguientes atributos: nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan
 * (representa cuantos quedan en el almacén).
 *
 * En el main de la clase principal instancia un objeto de la clase artículo.
 * Asígnale valores a todos sus atributos (los que quieras) y muestra por pantalla un mensaje del estilo “Pijama - Precio:10€ -IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el precio con IVA).
 * Luego, cambia el precio y vuelve a imprimir el mensaje.
 *
 */
public class Articulo {
     private String nombre;
    private double precioSinIVA;
    private double iva = 21;
    private int stock;

    public Articulo(String nombre, double precioSinIVA, double iva, int stock) {
        this.nombre = nombre;
        this.precioSinIVA = precioSinIVA;
        this.iva = iva;
        this.stock = stock;
        if (iva < 0){
            System.err.println("No es posible IVA negativo");
        } else {
            this.iva = iva;
        }
        if (stock < 0){
            System.err.println("No es posible stock negativo");
        }
        if (precioSinIVA <0){
            System.err.println("No es posible stock negativo");
            this.precioSinIVA = 0;
        }
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
        }else {
            this.precioSinIVA = precioSinIVA;
        }
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        if (iva <0){
            System.err.println("ERROR, no es posible IVA negativo.");
        } else {
            this.iva = iva;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock <0){
            System.err.println("ERROR, no es posible stock negativo.");
        }else {
            this.stock = stock;
        }
    }
}
