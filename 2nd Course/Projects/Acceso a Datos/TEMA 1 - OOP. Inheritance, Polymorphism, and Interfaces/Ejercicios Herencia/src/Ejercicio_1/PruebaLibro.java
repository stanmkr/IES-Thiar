package Ejercicio_1;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class PruebaLibro {
    // clase principal con método main
    public static void main(String[] args) {
        // instanciación de un objeto Libro con el constructor por defecto vacío (sin argumentos)
        Libro MiLibro = new Libro();
        // modificación de los valores de los atributos SIN la utilización de Setters, accediendo directamente a los atributos de la clase
        // (es posible acceder, ya que tienen la visibilidad <public>, son accesibles fuera de la clase)
        MiLibro.nombreAutor = "Frederick Forsyth";
        MiLibro.titulo = "El manifiesto negro";
        MiLibro.editorial = "Circulo de lectores";
        MiLibro.tipoPortada = "Dura";
        MiLibro.numeroDePaginas = 575;
        // mostrando los valores de los atributos públicos sin la utilización de Getters
        System.out.println("Nombre: " + MiLibro.nombreAutor);
        System.out.println("Título: " + MiLibro.titulo);
        System.out.println("Editorial: " + MiLibro.editorial);
        System.out.println("Portada: " + MiLibro.tipoPortada);
        System.out.println("Páginas " + MiLibro.numeroDePaginas);
    }
}
