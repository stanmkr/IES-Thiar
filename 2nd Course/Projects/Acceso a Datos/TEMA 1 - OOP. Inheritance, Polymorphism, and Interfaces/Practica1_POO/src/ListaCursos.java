import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class ListaCursos implements ILista {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Curso> listaCursos;
    private ArrayList<Alumno> arrayAlumnos;

    // CONSTRUCTOR
    public ListaCursos(ArrayList<Curso> listaCursos, ArrayList<Alumno> arrayAlumnos) {
        this.listaCursos = listaCursos;
        this.arrayAlumnos = arrayAlumnos;
    }


    // MÉTODOS

    /**
     * añade un curso a la lista de cursos
     */
    @Override
    public void anyadir() {
        System.out.print("Introduce el código del curso a añadir: ");
        System.out.print("Introduce el nombre del curso a añadir: ");
        String codigo = scanner.nextLine();
        String nombre = scanner.nextLine();
        listaCursos.add(new Curso(codigo, nombre));
    }


    /**
     * busca un curso de la lista de cursos pasado su código como referencia
     *  el código del curso a buscar
     */
    @Override
    public void buscar() {
        System.out.print("Introduce el código del curso que quieres  buscar: ");
        String codigo = scanner.nextLine();
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigo)){
                System.out.println(curso);
            }
        }
    }

    @Override
    public void eliminar() {
        /**
         * ******* Otra manera de hacerlo ********
         *    for (Curso curso : listaCursos) {
         *             if (curso.getCodigo().equals(codigo)){
         *                 listaCursos.remove(curso);
         *             }
         *         }
         */
        System.out.print("Introduce el código del curso a eliminar: ");
        String codigo = scanner.nextLine();
        listaCursos.removeIf(curso -> curso.getCodigo().equals(codigo));
    }


    /**
     * muestra la lista de cursos
     */
    @Override
    public void listar() {
        for (Curso curso : listaCursos) {
            System.out.println(curso);
        }
    }


    // GETTERS Y SETTERS

    public ArrayList<Curso> getListCursos() {
        return listaCursos;
    }

    public void setListCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public ArrayList<Alumno> getArrayAlumnos() {
        return arrayAlumnos;
    }

    public void setArrayAlumnos(ArrayList<Alumno> arrayAlumnos) {
        this.arrayAlumnos = arrayAlumnos;
    }


}
