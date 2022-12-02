package Ejercicio3;

import java.util.Hashtable;
import java.util.Map;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios4
 * FECHA: Diciembre / 2022
 */
public class Agenda {
    Hashtable<String, Persona> listaContactos;


    // CONSTRUCTOR
    public Agenda(Hashtable<String, Persona> listaContactos) {
        this.listaContactos = listaContactos;
    }

    /**
     * se crea una persona con los datos introducidos
     *
     * @param dni      de la persona
     * @param nombre   de la persona
     * @param telefono de la persona
     * @return true si ha sido posible agregar la persona o false (en caso de DNI duplicado)
     */
    public boolean agregar(String dni, String nombre, String telefono) {
        if (!listaContactos.containsKey(dni)) {
            listaContactos.put(dni, new Persona(dni, nombre, telefono));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Dado un dni como parametro, busca a la persona con ese dni y la elimina si la encuentra
     *
     * @param dni de la persona
     * @return true o false si ha sido posible la eliminación
     */
    public boolean eliminar(String dni) {
        if (listaContactos.containsKey(dni)) {
            listaContactos.remove(dni);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devuelve la persona con el DNI especificado. Si no
     * existe, devolverá null
     *
     * @param dni de la persona
     * @return devuelve la persona o null si no existe
     */
    public Persona recuperar(String dni) {
        return listaContactos.getOrDefault(dni, null);
    }


    /**
     * recorre el hashtable y muestra info de las personas
     */
    public void ver() {
        if (!listaContactos.isEmpty()){
            for (Map.Entry<String, Persona> entry : listaContactos.entrySet()) {
                System.out.println(entry.getValue());

            }
        }else {
            System.out.println("No hay contactos que mostrar, la lista esta vacía.");
        }

    }


}
