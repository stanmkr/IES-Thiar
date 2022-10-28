import java.util.ArrayList;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class Profesor extends Persona {
    Scanner scanner = new Scanner(System.in);
    private String curso;
    private ArrayList<String> listaAsignaturas;
    private final boolean tutor;


    // CONSTRUCTOR
    public Profesor(String nombre, String dni, int telefono, int edad, String curso, boolean tutor) {
        super(nombre, dni, telefono, edad);
        this.curso = curso;
        this.tutor = tutor;
        this.listaAsignaturas = new ArrayList<>();
        this.listaAsignaturas.add(curso);
    }


    // MÉTODOS

    /**
     * añade una asignatura a la lista de asignaturas
     */
    public void anyadirAsignatura() {
        System.out.print("Introduce la asignatura que quieres añadir a la lista de asignaturas: ");
        String asignatura = scanner.nextLine();
        this.listaAsignaturas.add(asignatura);

    }

    /**
     * elimina todas las asignaturas de Profesor
     */
    public void eliminarAsignaturas() {
        listaAsignaturas.clear();
    }

    @Override
    public String toString() {
        return "El profesor " + getNombre() + " con DNI " + getDni() + " teléfono " + getTelefono() + " edad " + getEdad() + " cursos que imparte " + listaAsignaturas;

    }

    // GETTERS Y SETTERS

    public String getCurso() {
        return curso;
    }

    public boolean isTutor() {
        return tutor;
    }

    public ArrayList<String> getListaAsignaturas() {
        return listaAsignaturas;
    }
}
