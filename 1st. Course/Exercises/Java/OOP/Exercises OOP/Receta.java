package ejercicios.ejerciciosTema8;

import java.util.Arrays;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosTema8
 * febrero - 2022
 */
public class Receta {
    private String nombre;
    private String elaboracion;
    private int duracion;
    private Ingrediente[] ingredientes;

    // CONSTRUCTOR
    public Receta(String nombre, String elaboracion, int duracion, Ingrediente[] ingredientes) {
        this.nombre = nombre;
        this.elaboracion = elaboracion;
        this.duracion = duracion;
        this.ingredientes = ingredientes;
    }

    // METODOS

    /**
     * metodo para saber la cantidad de ingredientes que lleva un objeto de la clase Receta, se calcula segun la longitud del array de ingredientes
     * @return la longitud del array (el número de ingredientes)
     */
     private int numeroIngredientes() {
        return ingredientes.length;
    }

    /**
     * Método que imprime por pantalla toda la información que contiene un objeto receta
     */
    public void mostrarReceta() {
        System.out.println("---------- RECETA ----------");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("ELABORACIÓN: " + elaboracion);
        System.out.println("DURACIÓN: " + duracion);
        System.out.println("NÚMERO DE INGREDIENTES: " + numeroIngredientes());
        System.out.print("INGREDIENTES: ");
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.print(ingredientes[i]);
            if (i < ingredientes.length - 1) {
                System.out.print(", ");
            }
        }
    }



}

