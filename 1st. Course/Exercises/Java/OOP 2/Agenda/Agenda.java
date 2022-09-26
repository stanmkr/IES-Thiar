package Agenda;

import java.util.ArrayList;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Agenda
 * Date: febrero / 2022
 */
public class Agenda {
    // ArrayList que contendrá objetos de la clase Contacto
    ArrayList<Contacto> agenda;

    // CONSTRUCTOR
    public Agenda() {
        agenda = new ArrayList<Contacto>();
    }


    // MÉTODOS

    /**
     * añade un contacto al ArrayList de objetos, e indica si se ha añadido, no son posibles objetos con el mismo nombre
     *
     * @param obj Objeto de la lase Contacto (tiene 2 parámetros, nombre y teléfono)
     * @return devuelve false si esta duplicado (mismo) nombre / devuelve true si ha podido añadirse (no se encuentra un objeto igual)
     */
    public boolean anyadirContacto(Contacto obj) {
        if (agenda.contains(obj)) {
            return false;
        } else {
            agenda.add(obj);
            return true;
        }
    }

    /**
     * Eliminar un objeto contacto dentro del ArrayList agenda, pasado un String nombre como parámetro. Si el String pasado como parámetro coincide con el parámetro que contiene el objeto como nombre, se elimina ese mismo objeto, en caso de no encontrar un nombre igual al buscado no hace nada
     *
     * @param nombre el String nombre del objeto,
     * @return true y elimina el objeto con el que coincide el nombre / false no hace nada
     */
    public boolean eliminarContacto(String nombre) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNombre().equalsIgnoreCase(nombre)) {
                agenda.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Busca un String nombre en los parámetros de los objetos que contiene el ArrayList agenda
     *
     * @param nombre el parámetro Nombre que se va a buscar
     * @return si String pasado en el método coincide con el String nombre que contiene el objeto, devuelve true, si no lo encuentra devuelve false
     */
    public boolean existeContacto(String nombre) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Busca un contacto pasado su nombre, dentro del ArrayList agenda
     *
     * @param nombre el nombre del objeto contacto
     * @return devuelve la posición (índice+1) del objeto que contiene ese nombre que se ha pasado como parámetro, en caso de no encontrarse un objeto con ese nombre de parámetro, el método devuelve -1
     */
    public int buscaContacto(String nombre) {
        for (Contacto contacto : agenda) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return agenda.indexOf(contacto) + 1;
            }
        }
        return -1;
    }


    /**
     * lista los contactos del ArrayList agenda
     */
    public void listarContactos() {

        //System.out.println(agenda);
        System.out.println("\n-·-·-·-·-·- AGENDA DE CONTACTOS -·-·-·-·-·-");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }

    }


}
