package Agenda_Telefonica;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Agenda_Telefonica
 * Date: marzo / 2022
 */
public class Agenda {
    private LinkedList<Registro> registros;

    public Agenda() {
        registros = new LinkedList<>();
    }

    public void mostrarRegistros() {
        if (registros.isEmpty()) {
            System.out.println("\nLa agenda está vacía.");
        } else {
            System.out.println();
            for (Registro e : registros) {
                System.out.println("Nombre: " + e.getNombre() + " | Teléfono: " + e.getTelefono());
            }
        }
    }


    public void añadirEntrada(String nombre, String telefono) {
        registros.add(new Registro(nombre, telefono));
    }

    public void buscarNombre(String nombre) {
        for (Registro r : registros) {
            if (r.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(r);
            }
            else {
                System.out.println("No se encuentra el nombre");
            }
        }
    }

    public void buscarNumero(String numero) {
        for (Registro r : registros) {
            if (r.getTelefono().equals(numero)) {
                System.out.println(r);
            }
        }
    }

    public void borrarPorNombre(String nombre) {

        Iterator<Registro> it = registros.iterator();
        while (it.hasNext()) {
            Registro r = it.next();
            if (r.getNombre().equals(nombre)) {
                it.remove();
                System.out.println(r.getNombre() + " borrado correctamente");
            }

        }

    }

    public void borrarPorNumero(String numero) {
        Iterator<Registro> it = registros.iterator();
        while (it.hasNext()) {
            Registro r = it.next();
            if (r.getTelefono().equals(numero)) {
                it.remove();
                System.out.println(r.getTelefono() + " borrado correctamente");
            }
        }
    }


    public void mostrarAgendaOrdenada() {
        LinkedList<Registro> registrosTemporales = new LinkedList<>(registros);
        registrosTemporales.sort(new Comparator<Registro>() {
            @Override
            public int compare(Registro o1, Registro o2) {
                int resultado = o1.getNombre().compareTo(o2.getNombre());
                if (resultado == 0) {
                    resultado = o1.getTelefono().compareTo(o2.getTelefono());
                }
                return resultado;
            }


        });
        for (Registro r : registrosTemporales) {
            System.out.println(r);
        }
    }


}
