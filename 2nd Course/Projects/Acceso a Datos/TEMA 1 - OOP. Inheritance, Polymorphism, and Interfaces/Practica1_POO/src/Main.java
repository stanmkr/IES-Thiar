import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class Main {
    public static void main(String[] args) {
        ListaAlumnos listaAlumnos = new ListaAlumnos();
        ListaProfesores listaProfesores = new ListaProfesores();
        ListaCursos listaCursos = new ListaCursos();
        String option = "", option2 = "", option3 = "", option4 = "";

        while (!option.equals("0")) {
            option = menuPrincipal();
            switch (option) {
                case "1":
                    while (!option2.equals("0")) {
                        switch (option2 = menuGestionaCursos()) {
                            case "1":
                                listaCursos.anyadir();
                                break;
                            case "2":
                                listaCursos.eliminar();
                                break;
                            case "3":
                                listaCursos.listar();
                                break;
                            case "4":
                                listaAlumnos.mostrarAlumnosDeUnCurso();
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("La opción no se encuentra en el menú.");
                                break;
                        }
                    }
                    break;
                case "2":
                    while (!option3.equals("0")) {
                        switch (option3 = menuGestionaAlumnos()) {
                            case "1":
                                listaAlumnos.anyadir();
                                break;
                            case "2":
                                listaAlumnos.eliminar();
                                break;
                            case "3":
                                listaAlumnos.listar();
                                break;
                            case "4":
                                listaAlumnos.ordenarAlfabeticamente();
                                break;
                            case "5":
                                listaAlumnos.mostrarAlumnosDeUnCurso();
                                break;
                            case "6":
                                listaAlumnos.buscar();
                                break;
                            case "7":
                                listaAlumnos.anyadirNotaAlumno();
                                break;
                            case "8":
                                listaAlumnos.eliminarNotasAlumno();
                                break;
                            case "9":
                                listaAlumnos.listarAprobados();
                                break;
                            case "10":
                                listaAlumnos.listarSuspensos();
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("La opción no se encuentra en el menú.");
                                break;
                        }
                    }
                    break;
                case "3":
                    while (!option4.equals("0")) {
                        switch (option4 = menuGestionaProfesores()) {
                            case "1":
                                listaProfesores.anyadir();
                                break;
                            case "2":
                                listaProfesores.eliminar();
                                break;
                            case "3":
                                listaProfesores.listar();
                                break;
                            case "4":
                                listaProfesores.ordenarAlfabeticamente();
                                break;
                            case "5":
                                listaProfesores.listarTutores();
                                break;
                            case "6":
                                listaProfesores.listarPorAsignatura();
                                break;
                            case "7":
                                listaProfesores.buscar();
                                break;
                            case "8":
                                listaProfesores.anyadirAsignaturaProfesor();
                                break;
                            case "9":
                                listaProfesores.eliminarAsignaturasProfesor();
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("La opción no se encuentra en el menú.");
                                break;
                        }
                    }
                    break;
                case "0":
                    break;
                default:
                    System.out.println("La opción no se encuentra en el menú.");
            }
            option2 = "";
            option3 = "";
            option4 = "";
        }
        System.out.println("\n------ PROGRAMA FINALIZADO ------");

    }

    public static String menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                \n1. Gestión de cursos
                2. Gestión de alumnos
                3. Gestión de profesores
                0. Salir
                """);
        System.out.print("Elija una opción: ");
        return scanner.nextLine();
    }

    public static String menuGestionaCursos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                \n1. Añadir curso
                2. Eliminar curso
                3. Listar cursos
                4. Mostrar alumnos de un curso
                0. Salir
                """);
        System.out.print("Elija una opción: ");
        return scanner.nextLine();

    }

    public static String menuGestionaAlumnos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                \n1. Añadir alumno
                2. Eliminar alumno
                3. Listar alumnos
                4. Ordenar alfabéticamente
                5. Mostrar alumnos de un curso
                6. Mostrar info alumno
                7. Añadir nota
                8. Eliminar notas de alumno
                9. Listar alumnos aprobados
                10. Listar alumnos suspensos
                0. Salir
                """);
        System.out.print("Elija una opción: ");
        return scanner.nextLine();
    }

    public static String menuGestionaProfesores() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                \n1. Añadir profesor
                2. Eliminar profesor
                3. Listar profesores
                4. Ordenar alfabéticamente
                5. Listar profesores tutores
                6. Listar profesores de una asignaturas
                7. Mostrar info profesor
                8. Añadir asignatura
                9. Eliminar asignaturas de profesor
                0. Salir
                """);
        System.out.print("Elija una opción: ");
        return scanner.nextLine();
    }
}

