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
    public ListaCursos() {
        this.listaCursos = new ArrayList<>();
        this.arrayAlumnos = new ArrayList<>();
    }


    // MÉTODOS


    /**
     * añade un curso a la lista de cursos
     */
    @Override
    public void anyadir() {
        System.out.print("Introduce el código del curso a añadir: ");
        String codigo = scanner.nextLine();
        System.out.print("\nIntroduce el nombre del curso a añadir: ");
        String nombre = scanner.nextLine();
        listaCursos.add(new Curso(codigo, nombre));
        arrayAlumnos = new ArrayList<>();
        System.out.println("Curso añadido correctamente...");
    }


    /**
     * busca un curso de la lista de cursos pasado su código como referencia
     * el código del curso a buscar
     */
    @Override
    public void buscar() {
        System.out.print("Introduce el código del curso que quieres  buscar: ");
        String codigo = scanner.nextLine();
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println(curso);
            }
        }
    }

    @Override
    public void eliminar() {
        /*
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


    public void mostrarAlumnosDeUnCurso() {
        System.out.print("Introduce el código del curso que quieres buscar: ");
        String codigoCurso = scanner.nextLine();
        for (Curso curso : listaCursos) {
            if (codigoCurso.equalsIgnoreCase(curso.getCodigo())) {
                for (Alumno alumno : this.arrayAlumnos) {
                    System.out.println(alumno.getNombre());
                }
                //  System.out.printf("El alumno %s pertenece al curso %s con código [%s]", alumno.getNombre(), alumno.getCurso(), codigoCurso);
            }
        }
    }


    public ArrayList<Alumno> getArrayAlumnos() {
        return arrayAlumnos;
    }
}
