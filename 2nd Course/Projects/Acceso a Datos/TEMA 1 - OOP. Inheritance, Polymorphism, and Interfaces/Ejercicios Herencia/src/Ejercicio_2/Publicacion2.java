package Ejercicio_2;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class Publicacion2 {
    // atributos de encapsulación public de la clase
    public int numeroDePaginas;
    public float precio;


    // métodos para acceder fuera de la clase a los 2 atributos (getters y setters)
    // realmente no es necesario, ya que tiene el modificador <public>, se podría acceder a los métodos sin necesidad de getters y setters
    public int dimeNumeroDePaginas() { // getter
        return this.numeroDePaginas;
    }

    public void ponNumeroDePaginas(int numeroDePaginas) { // setter
        this.numeroDePaginas = numeroDePaginas;
    }

    public float dimePrecio() { // getter
        return this.precio;
    }

    public void ponPrecio(float precio) { // setter
        this.precio = precio;
    }

}
