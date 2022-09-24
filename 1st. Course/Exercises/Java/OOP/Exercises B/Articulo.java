package ejercicios.ejerciciosB;

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
    String nombre;
    double precioSinIVA;
    double iva = 21;
    int stock;

    public Articulo(String nombre, double precioSinIVA, double iva, int stock) {
        this.nombre = nombre;
        this.precioSinIVA = precioSinIVA;

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
}
