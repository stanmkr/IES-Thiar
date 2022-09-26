package Agenda;


/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Agenda
 * Date: febrero / 2022
 */
public class ProgramaAgenda {
    public static void main(String[] args) {
        //  creo un objeto agenda que es un arraylist
        Agenda miAgenda = new Agenda();

        //  creación de objetos
        ContactoEmpresa empresa1 = new ContactoEmpresa("Juan", "666 787 898", "www.abv.com");
        ContactoEmpresa empresa2 = new ContactoEmpresa("Antonio", "666 222 333", "www.marca.com");
        ContactoPersona persona1 = new ContactoPersona("Juan", "333 000 000", "1994-07-15");
        ContactoPersona persona2 = new ContactoPersona("Pepe", "111 222 333", "1970-12-15");
        ContactoPersona persona3 = new ContactoPersona("Sanchez", "111 222 333", "1970-12-15");


        //añadiendo objetos a la agenda con el respectivo método
        miAgenda.anyadirContacto(empresa1);
        miAgenda.anyadirContacto(empresa2);
        miAgenda.anyadirContacto(persona1);
        miAgenda.anyadirContacto(persona2);
        miAgenda.anyadirContacto(persona3);


        //  listando la agenda para ver todos los contactos
        miAgenda.listarContactos();
        System.out.println();

        //  añadiendo contacto duplicado (mismo nombre)
        System.out.println("Intentando añadir otra vez Pepe");
        System.out.println(miAgenda.anyadirContacto(persona2) ? "Contacto añadido con éxito" : "No ha sido posible añadir el contacto");
        System.out.println();

        //  eliminando contacto pasado su nombre como parámetro
        System.out.println("Eliminando Pepe de la agenda");
        System.out.println(miAgenda.eliminarContacto("Pepe") ? "Contacto eliminado con éxito" : "No es posible eliminar el contacto");
        System.out.println();

        miAgenda.listarContactos();

        // buscando un contacto pasado su nombre, si no encuenta el nombre devuelve -1, en caso de encontrarlo devuelve su posición (índice+1)
        System.out.println();
        System.out.println("Mostrando la posición de Juan");
        System.out.println(miAgenda.buscaContacto("Juan") == -1 ? "El contacto no se encuentra en tu agenda" : "El contacto se encuentra en la posición " + miAgenda.buscaContacto("Juan")  + " de tu agenda");
        System.out.println();

        // comprueba si un contacto existe pasado su nombre como parámetro
        System.out.println("Comprobando si el contacto Juan existe en la agenda" );
        System.out.println(miAgenda.existeContacto("juAn") ? "El contacto existe" : "El contacto no existe en tu agenda.");

        miAgenda.listarContactos();
    }
}
