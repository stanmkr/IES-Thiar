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


    // CONSTRUCTOR
    public Profesor(String nombre, String dni, int telefono, int edad, String curso) {
        super(nombre, dni, telefono, edad);
        this.curso = curso;
        this.listaAsignaturas = new ArrayList<>();
    }


    // MÉTODOS
    public void anyadirAsignatura() {
        System.out.print("Introduce la asignatura que quieres añadir a la lista de asignaturas: ");
        String asignatura = scanner.nextLine();
        this.listaAsignaturas.add(asignatura);

    }

    public void eliminarAsignatura() {
        System.out.print("Introduce la asignatura que quieres eliminar de la lista de asignaturas: ");
        String asignatura = scanner.nextLine();

//        for (String asignat : listaAsignaturas) {
//            if (asignatura.equals(asignat)){
//                listaAsignaturas.remove(asignat);
//            }
//        }
        listaAsignaturas.removeIf(asignatura::equals);
    }

    @Override
    public String toString() {
        return "El profesor " + getNombre() + " que imparte los cursos " + curso;

    }

    // GETTERS Y SETTERS

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<String> getListaAsignaturas() {
        return listaAsignaturas;
    }


}
