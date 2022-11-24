import java.util.ArrayList;
import java.util.Comparator;
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
    public ListaAlumnos() {
        this.listaAlumnos = new ArrayList<>();
    }


    @Override
    public void anyadir() {
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("\nIntroduce el DNI del alumno: ");
        String dni = scanner.nextLine();
        System.out.print("\nIntroduce el teléfono del alumno: ");
        int telefono = Integer.parseInt(scanner.nextLine());
        System.out.print("\nIntroduce la edad del alumno: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("\nIntroduce el curso del alumno: ");
        String curso = scanner.nextLine();
        listaAlumnos.add(new Alumno(nombre, dni, telefono, edad, curso));
        System.out.println("\nAlumno añadido correctamente...");

    }

    /**
     * elimina un alumno dado su dni
     */
    @Override
    public void eliminar() {
        System.out.print("Introduce el DNI del alumno: ");
        String dni = scanner.nextLine();
        /*
              for (Alumno alumno : listaAlumnos) {
                      if (alumno.getDni().equals(dni)){
                          listaAlumnos.remove(alumno);
                      }
                  }
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
        listaAlumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println("Alumnos ordenados alfabéticamente...");
    }

    /**
     * Pasado un DNI de alumno, se añade una nota a la lista de notas de ese alumno
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

    /**
     * Pasado un DNI de alumno, elimina las notas de este
     */
    public void eliminarNotasAlumno() {
        System.out.print("Introduce el DNI del alumno que quieres eliminar una nota: ");
        String dni = scanner.nextLine();
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getDni().equalsIgnoreCase(dni)) {
                alumno.eliminarNotas();
            }
        }
    }

    /**
     * pasado un código de curso, se imprimen los alumnos que están en ese curso
     */


    public void mostrarAlumnosDeUnCurso() {
        System.out.print("Introduce el nombre del curso que quieres buscar: ");
        String nombreCurso = scanner.nextLine();
        for (Alumno alumno : listaAlumnos) {
            if (nombreCurso.equalsIgnoreCase(alumno.getCurso())) {
                System.out.printf("El alumno %s pertenece al curso [%s]\n", alumno.getNombre(), alumno.getCurso());
            }
        }
    }


    /**
     * Recorre la lista de alumnos y por cada alumno recorre su lista de notas, hace la media
     * de sus notas, y si la media es mayor o igual a 5 guardas el objeto Alumno en un ArrayList de alumnos aprobados
     * después se muestra el array de aprobados
     */
    public void listarAprobados() {
        double sumaNotas = 0;
        double notaMedia;
        for (Alumno alumno : listaAlumnos) {
            ArrayList<Double> totalNotas = alumno.getListaNotas();
            for (Double nota : totalNotas) {
                sumaNotas += nota;
            }
            notaMedia = sumaNotas / totalNotas.size();
            if (notaMedia >= 5) {
                System.out.println(alumno + " | NOTA MEDIA: [" + notaMedia + "]");
            }
            sumaNotas = 0;
        }
    }


    /**
     * Recorre la lista de alumnos y por cada alumno recorre su lista de notas, hace la media
     * de sus notas, y si la media es menor a 5 guardas el objeto Alumno en un ArrayList de alumnos suspensos
     * después se muestra el array de aprobados
     */
    public void listarSuspensos() {
        double sumaNotas = 0;
        double notaMedia;
        for (Alumno alumno : listaAlumnos) {
            ArrayList<Double> totalNotas = alumno.getListaNotas();
            for (Double nota : totalNotas) {
                sumaNotas += nota;
            }
            notaMedia = sumaNotas / totalNotas.size();
            if (notaMedia < 5) {
                System.out.println(alumno + " | NOTA MEDIA: [" + notaMedia + "]");
            }
            sumaNotas = 0;
        }
    }


}
