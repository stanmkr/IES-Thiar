import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class ListaProfesores implements ILista {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Profesor> listaProfesores;

    // CONSTRUCTOR

    public ListaProfesores() {
        this.listaProfesores = new ArrayList<>();

    }

    // MÉTODOS

    @Override
    public void anyadir() {
        System.out.print("Introduce el nomnbre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el DNI del alumno: ");
        String dni = scanner.nextLine();
        System.out.print("Introduce el teléfono del profesor: ");
        int telefono = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce la edad del profesor: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce el curso del profesor: ");
        String curso = scanner.nextLine();
        System.out.print("Introduce si el profesor es tutor true/false (true=SI)(false=NO): ");
        boolean tutor = Boolean.parseBoolean(scanner.nextLine());
        listaProfesores.add(new Profesor(nombre, dni, telefono, edad, curso, tutor));
        System.out.println("Profesor añadido correctamente...");
    }

    /**
     * elimina un profesor dado su dni
     */
    @Override
    public void eliminar() {
        String dni = scanner.nextLine();
        listaProfesores.removeIf(profesor -> profesor.getDni().equals(dni));
    }


    /**
     * Método Buscar hace lo mismo que el método MostrarProfesor(), asi que nos quedamos
     * con el método buscar() de la interfaz ILista
     */
    @Override
    public void buscar() {
        System.out.print("Introduce el DNI del profesor que quieres buscar: ");
        String dni = scanner.nextLine();
        for (Profesor profesor : listaProfesores) {
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                System.out.println(profesor);
            }
        }
    }

    /**
     * lista todos los profesores de la lista de profesores
     */
    @Override
    public void listar() {
        for (Profesor profesor : listaProfesores) {
            System.out.println(profesor);
        }
    }

    /**
     * dado un dni de profesor, elimina todas sus asignaturas de ese profesor
     */
    public void eliminarAsignaturasProfesor(){
        System.out.print("Introduce el DNI del profesor para eliminar sus asignaturas: ");
        String dni = scanner.nextLine();
        for (Profesor profesor : listaProfesores) {
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                profesor.eliminarAsignaturas();
            }
        }
    }

    /**
     * recorre la lista de profesores y muestra solo los que son tutores
     */
    public void listarTutores(){
        System.out.println("***** TUTORES *****");
        for (Profesor profesor : listaProfesores) {
            if (profesor.isTutor()){
                System.out.println(profesor);
            }
        }
    }

    /**
     * lista todos los profesores de una asignatrua
     */
    public void listarPorAsignatura(){
        HashMap<String,String> asignaturasProfesores = new HashMap<>();
        for (Profesor profesor : listaProfesores) {
            asignaturasProfesores.put(profesor.getCurso(), profesor.getNombre());
        }
        for (String asignaturas : asignaturasProfesores.keySet()) {
            System.out.println(asignaturas);
        }
    }



}
