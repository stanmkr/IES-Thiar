package Ejercicio3;

import java.io.*;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios4
 * FECHA: Diciembre / 2022
 */
public class Programa {
    public static void main(String[] args) {
        String opcion, nombreArchivo = "src/Ejercicio3/datos.obj";
        Hashtable<String, Persona> listaPersonas = new Hashtable<>();
        Agenda agenda = new Agenda(listaPersonas);
        File fichero = new File(nombreArchivo);
        if (fichero.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(nombreArchivo);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                Persona persona= (Persona) objectInputStream.readObject();
                while (persona != null) {
                    try {
                        listaPersonas.put(persona.getDNI(), persona);
                        persona = (Persona) objectInputStream.readObject();
                    } catch (EOFException e) {
                        break;
                    }
                }
                objectInputStream.close();

            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


        Scanner scanner = new Scanner(System.in);

        do {
            imprimirMenu();
            System.out.print("Elige una opción del menú: ");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Has elegido agregar una persona.");
                    System.out.print("Escribe el DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Escribe el NOMBRE: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Escribe el TELÉFONO: ");
                    String telefono = scanner.nextLine();
                    if (agenda.agregar(dni, nombre, telefono)) {
                        System.out.println("\nPersona con DNI " + dni + " añadida correctamente.");
                    } else {
                        System.out.println("\nYa existe la persona con DNI " + dni + ". No puede ser añadida.");
                    }

                    break;
                case "2":
                    System.out.println("Has elegido localizar a una persona.");
                    System.out.print("Escribe el DNI: ");
                    dni = scanner.nextLine();
                    System.out.println(agenda.recuperar(dni));
                    break;
                case "3":
                    System.out.println("Has elegido eliminar a una persona.");
                    System.out.print("Escribe el DNI: ");
                    dni = scanner.nextLine();
                    if (agenda.eliminar(dni)) {
                        System.out.println("\nPersona con DNI " + dni + " eliminada correctamente.");
                    } else {
                        System.out.println("\nNo se encuentra la persona con DNI " + dni);
                    }
                    break;
                case "4":
                    agenda.ver();
                    break;
                case "5":
                    try {
                        if (!listaPersonas.isEmpty()){
                            FileOutputStream fileOutputStream = new FileOutputStream(nombreArchivo);
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                            for (Map.Entry<String, Persona> entry : agenda.listaContactos.entrySet()) {
                                objectOutputStream.writeObject(entry.getValue());
                            }
                            objectOutputStream.close();
                            System.out.println("La agenda ha sido guardada correctamente en " + nombreArchivo);
                        }else {
                            System.out.println("La agenda no contiene ningún contacto. No hay nada para guardar.");
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    System.out.println("La opción es incorrecta.");
                    break;
            }
        } while (!opcion.equals("5"));


    }

    public static void imprimirMenu() {
        System.out.println("""
                \n****** M E N U ******
                1.- Agregar persona.
                2.- Buscar persona.
                3.- Eliminar persona.
                4.- Mostrar todas las personas.
                5.- Salir
                """);
    }


}
