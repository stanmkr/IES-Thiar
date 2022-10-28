import java.util.*;

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
        System.out.print("Introduce el nombre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.print("\nIntroduce el DNI del alumno: ");
        String dni = scanner.nextLine();
        System.out.print("\nIntroduce el teléfono del profesor: ");
        int telefono = Integer.parseInt(scanner.nextLine());
        System.out.print("\nIntroduce la edad del profesor: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("\nIntroduce el curso del profesor: ");
        String curso = scanner.nextLine();
        System.out.print("\nIntroduce si el profesor es tutor true/false (true=SI)(false=NO): ");
        boolean tutor = Boolean.parseBoolean(scanner.nextLine());
        listaProfesores.add(new Profesor(nombre, dni, telefono, edad, curso, tutor));
        System.out.println("\nProfesor añadido correctamente...");
    }

    /**
     * elimina un profesor dado su dni
     */
    @Override
    public void eliminar() {
        System.out.print("Escribe el DNI del profesor para eliminarlo: ");
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
    public void eliminarAsignaturasProfesor() {
        System.out.print("Introduce el DNI del profesor para eliminar sus asignaturas: ");
        String dni = scanner.nextLine();
        for (Profesor profesor : listaProfesores) {
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                profesor.eliminarAsignaturas();
            }
        }
    }

    /**
     * dado un dni de profesor, añade una asignatura a la lista de asignaturas a ese profesor
     */
    public void anyadirAsignaturaProfesor() {
        System.out.print("Introduce el DNI del profesor para añadir una asignatura: ");
        String dni = scanner.nextLine();
        for (Profesor profesor : listaProfesores) {
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                profesor.anyadirAsignatura();
            }
        }
    }

    /**
     * recorre la lista de profesores y muestra solo los que son tutores
     */
    public void listarTutores() {
        System.out.println("***** TUTORES *****");
        for (Profesor profesor : listaProfesores) {
            if (profesor.isTutor()) {
                System.out.println(profesor);
            }
        }
    }

    /**
     * lista todos los profesores de una asignatura
     */
    public void listarPorAsignatura() {
        Map<String, ArrayList<String>> asignaturasProfesores = new LinkedHashMap<>();
        for (Profesor profesor : listaProfesores) {
            if (!asignaturasProfesores.containsKey(profesor.getCurso())) {
                asignaturasProfesores.put(profesor.getCurso(), new ArrayList<>());
                asignaturasProfesores.get(profesor.getCurso()).add(profesor.getNombre());
            } else {
                asignaturasProfesores.get(profesor.getCurso()).add(profesor.getNombre());
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry : asignaturasProfesores.entrySet()) {
            System.out.printf("Curso: %s -> %s%n", entry.getKey(), entry.getValue());
        }


    }

    /**
     * Ordena por orden alfabético (por nombre del profesor)la lista de profesores
     */
    public void ordenarAlfabeticamente() {
        listaProfesores.sort(new Comparator<Profesor>() {
            @Override
            public int compare(Profesor o1, Profesor o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println("Profesores ordenados alfabéticamente...");
    }
}

