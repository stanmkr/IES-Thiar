package Ejercicios_ArrayLists;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicios_ArrayLists
 * Date: Febrero / 2022
 */
public class Ej3_Producto {
    private String nombre;
    private int cantidad;


    //constructor
    public Ej3_Producto (String nombre, int cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
    }



    // getter & setters
    public String getNombre() {
        return nombre;
    }

    public Ej3_Producto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Ej3_Producto setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }
}
