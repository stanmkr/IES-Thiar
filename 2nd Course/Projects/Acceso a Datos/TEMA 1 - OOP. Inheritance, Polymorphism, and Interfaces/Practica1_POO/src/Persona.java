/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class Persona {
    private final String nombre, dni;
    private final int telefono, edad;


    // CONSTRUCTOR
    public Persona(String nombre, String dni, int telefono, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " con DNI " + dni + " y con teléfono " + telefono + " tiene " + edad + " años";
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }


    public String getDni() {
        return dni;
    }


    public int getTelefono() {
        return telefono;
    }


    public int getEdad() {
        return edad;
    }


}
