package Agenda;

import java.util.Objects;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Agenda
 * Date: febrero / 2022
 */
public abstract class Contacto {
    // Clase abstracta, no es posible la instanciación de objetos de esta clase, solamente se puede heredar de esta clase
    //  Atributos de la clase
    private String nombre;
    private String tlf;


    // CONSTRUCTOR
    Contacto(String nombre, String tlf) {
        this.nombre = nombre;
        this.tlf = tlf;
    }


    // MÉTODOS
    //Sobreescribo el método equals de la clase Object de Java, diciendo que si el objeto no es una instancia de la clase Contacto return false
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equals(contacto.nombre);
    }
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTlf() {
        return tlf;
    }
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }


}
