package Ejercicio_2;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class PruebaPeriodico { // clase principal Main
    public static void main(String[] args) {
        // instanciación de objeto Periodico2 con el constructor por defecto
        Periodico2 p = new Periodico2();
        p.ponNombre("La voz de mi casa"); // dando valor al atributo "nombre" del objeto <p>
        p.ponPrecio(0.9f); // dando valor al atributo "precio" del objeto <p>
        p.ponNumeroDePaginas(65); // dando valor al atributo "paginas" del objeto <p>
        p.ponPrecio(0.9f); // dando valor al atributo "precio" del objeto <p>  ... sobreescribe el anterior valor (en este caso ambos son 0.9)


        // accediendo a los atributos con los getters y los setters de la clase
        System.out.println("Nombre: " + p.dimeNombre());
        System.out.println("Precio: " + p.dimePrecio());
        System.out.println("Número de páginas: " + p.dimeNumeroDePaginas());
        System.out.println("Precio: " + p.dimePrecio());

    }
}
