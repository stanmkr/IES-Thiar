package Ejercicio_2;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octbre / 2022
 */
public class Periodico2 extends Publicacion2 {
    // atributos privados de la clase que extiende de Publicacion2
    private String nombre;
    private String fecha;

    // métodos para acceder a los valores de los atributos FUERA de esta clase. (Métodos Getters y Setters)
    public String dimeNombre() {
        return this.nombre;
    } // getter

    public void ponNombre(String nombre) {
        this.nombre = nombre;
    } // setter


    public String dimeFecha() {
        return this.fecha;
    } // getter


    public void ponFecha(String fecha) {
        this.fecha = fecha;
    } // setter

}
