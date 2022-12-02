package Ejercicio3;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios4
 * FECHA: Diciembre / 2022
 */
public class Persona {
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

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
