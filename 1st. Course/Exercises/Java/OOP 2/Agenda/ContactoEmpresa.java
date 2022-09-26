package Agenda;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Agenda
 * Date: febrero / 2022
 */

// ContactoEmpresa hereda de la clase Contacto

public class ContactoEmpresa extends Contacto {
    // atributo propio de la clase
    private String web;

    // CONSTRUCTOR
    // Heredo los atributos, nombre y teléfono de la clase padre. Al instanciar un objeto ContactoPersona ese objeto hereda del constructor padre y tendrá 3 parámetros (nombre, teléfono y web (este es el propio suyo) )
    public ContactoEmpresa(String nombre, String tlf, String web) {
        super(nombre, tlf);
        this.web = web;
    }

    // GETTERS & SETTERS
    public String getWeb() {
        return web;
    }
    public void setWeb(String web) {
        this.web = web;
    }

    // Sobreescribo el método toString para mostrar el objeto y su contenido, y no obtener la posición de memoria por defecto
    @Override
    public String toString() {
        return "Empresa: " + getNombre() + " | " + "Teléfono: " + getTlf() + " | " + "Web: " + getWeb();
    }
}
