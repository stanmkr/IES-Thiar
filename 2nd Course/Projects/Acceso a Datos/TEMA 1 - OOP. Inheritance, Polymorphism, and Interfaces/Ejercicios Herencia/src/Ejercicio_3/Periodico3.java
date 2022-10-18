package Ejercicio_3;

import Ejercicio_2.Periodico2;
import Ejercicio_2.Publicacion2;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class Periodico3 extends Publicacion3 { // hereda de Publicacion3
    private String nombre;
    private String fecha;

    // CONSTRUCTOR POR DEFECTO (VACÍO)
    public Periodico3() {
        super();
        nombre = null;
        fecha = null;
    }

    // CONSTRUCTOR que nos permita inicializar explícitamente todas las propiedades
    //de la subclase y la superclase
    public Periodico3(String nombre, String fecha, int numeroDePaginas, float precio) {
        super();
        this.numeroDePaginas = numeroDePaginas;
        this.precio = precio;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    // CONSTRUCTOR solo inicializa las propiedades de la subclase
    public Periodico3(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    // CONSTRUCTOR solo inicializa las propiedades de la superclase
    public Periodico3(int numeroDePaginas, float precio) {
        super();
        this.numeroDePaginas = numeroDePaginas;
        this.precio = precio;
    }


    // M É T O D O S GETTERS Y SETTERS
    public String dimeNombre() {
        return this.nombre;
    }

    public void ponNombre(String nombre) {
        this.nombre = nombre;
    }

    public String dimeFecha() {
        return this.fecha;
    }

    public void ponFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Método que imprime información del objeto
     */
    public void imprimir() {
        System.out.println(dimeNombre() + ", " + dimeFecha() + ", " + dimeNumeroDePaginas() + ", " + dimePrecio());
    }
}
