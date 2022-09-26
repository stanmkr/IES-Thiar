package Agenda;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Agenda
 * Date: febrero / 2022
 */

// ContactoPersona hereda de la clase Contacto
public class ContactoPersona extends Contacto {
    // atributo propio de la clase
    private String cumple;


    // CONSTRUCTOR
    // Heredo los atributos, nombre y teléfono de la clase padre. Al instanciar un objeto ContactoPersona ese objeto hereda del constructor padre y tendrá 3 parámetros (nombre, teléfono y cumpleaños (este es el propio suyo))
    public ContactoPersona(String nombre, String tlf, String cumple) {
        super(nombre, tlf);
        this.cumple = cumple;
    }

    // GETTERS & SETTERS
    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }


    // Sobreescribo el método toString para mostrar el objeto y su contenido, y no obtener la posición de memoria por defecto
    @Override
    public String toString() {
        return "Persona: " + getNombre() +" | "+ "Teléfono: " +getTlf()+" | " +"Cumpleaños: "+ getCumple()+"";
    }


}
