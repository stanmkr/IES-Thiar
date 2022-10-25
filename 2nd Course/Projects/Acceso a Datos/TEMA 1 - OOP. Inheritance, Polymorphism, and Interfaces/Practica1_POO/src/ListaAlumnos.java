import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class ListaAlumnos implements ILista {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Alumno> listaAlumnos;


    //  CONSTRUCTOR
    public ListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }


    @Override
    public void anyadir() {
        System.out.print("Introduce el nomnbre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el DNI del alumno: ");
        String dni = scanner.nextLine();
        System.out.print("Introduce el teléfono del alumno: ");
        int telefono = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce la edad del alumno: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce el curso del alumno: ");
        String curso = scanner.nextLine();
        ArrayList<Double> listaNotas = new ArrayList<>();
        listaAlumnos.add(new Alumno(nombre, dni, telefono, edad, curso, listaNotas));
        System.out.println("Alumno añadido correctamente...");

    }

    @Override
    public void eliminar() {
        String dni = scanner.nextLine();
        /**
         *     for (Alumno alumno : listaAlumnos) {
         *             if (alumno.getDni().equals(dni)){
         *                 listaAlumnos.remove(alumno);
         *             }
         *         }
         */
        listaAlumnos.removeIf(alumno -> alumno.getDni().equals(dni));
    }

    /**
     * busca un alumno por dni
     */
    @Override
    public void buscar() {
        System.out.print("Introduce el DNI del alumno que quieres buscar: ");
        String dni = scanner.nextLine();
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getDni().equalsIgnoreCase(dni)) {
                System.out.println(alumno);
            }
        }
    }

    /**
     * muestra la lista de alumnos
     */
    @Override
    public void listar() {
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

    /**
     * ordena por orden alfabético (por el nombre del alumno) la lista de alumnos
     */
    public void ordenarAlfabeticamente() {
        Collections.sort(listaAlumnos);
    }

    /**
     * Pasado un DNI de alumno, se anyade una nota a la lista de notas de ese alumno
     */
    public void anyadirNotaAlumno() {
        System.out.print("Introduce el DNI del alumno que quieres añadir una nota: ");
        String dni = scanner.nextLine();
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getDni().equalsIgnoreCase(dni)) {
                alumno.anyadirNota();
            }
        }
    }

}
