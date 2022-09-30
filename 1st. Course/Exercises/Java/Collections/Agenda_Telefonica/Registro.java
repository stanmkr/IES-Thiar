package Agenda_Telefonica;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Agenda_Telefonica
 * Date: marzo / 2022
 */
public class Registro {
    private String nombre, telefono;

    //  CONSTRUCTOR
    public Registro(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
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


    @Override
    public String toString() {
        return "Nombre: Nombre: " + this.nombre + " | Teléfono: " + this.telefono;
    }
}
