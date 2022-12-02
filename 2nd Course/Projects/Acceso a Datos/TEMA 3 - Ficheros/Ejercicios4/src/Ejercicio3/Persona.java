package Ejercicio3;

import java.io.Serializable;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios4
 * FECHA: Diciembre / 2022
 */
public class Persona implements Serializable {
    private String DNI, nombre, telefono;

    // CONSTRUCTOR
    public Persona(String DNI, String nombre, String telefono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // GETTERS Y SETTERS
    public String getDNI() {
        return DNI;
    }



    public String getNombre() {
        return nombre;
    }


    public String getTelefono() {
        return telefono;
    }



    @Override
    public String toString() {
        return " DNI: " + this.getDNI() + " | NOMBRE: " + this.getNombre() + " | TELÉFONO: " + this.getTelefono();
    }
}
