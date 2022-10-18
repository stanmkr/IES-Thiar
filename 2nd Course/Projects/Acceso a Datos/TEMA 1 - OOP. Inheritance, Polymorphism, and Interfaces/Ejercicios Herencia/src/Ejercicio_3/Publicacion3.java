package Ejercicio_3;

import Ejercicio_2.Publicacion2;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class Publicacion3 extends Publicacion2 {

    public int numeroDePaginas;
    public float precio;


    // CONSTRUCTOR SIN PARÁMETROS
    public Publicacion3() {
        numeroDePaginas = 0;
        precio = 0f;
    }

    // CONSTRUCTOR CON 1 PARÁMETRO
    public Publicacion3(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;

    }

    // CONSTRUCTOR CON 2 PARÁMETROS
    public Publicacion3 (int numeroDePaginas, float precio){
        this.numeroDePaginas=numeroDePaginas;
        this.precio=precio;
    }

    // M É T O D O S getters y setters
    public int dimeNumeroDePaginas() {
        return this.numeroDePaginas;
    }

    public void ponNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public float dimePrecio() {
        return this.precio;
    }

    public void ponPrecio(float precio) {
        this.precio = precio;
    }
}
