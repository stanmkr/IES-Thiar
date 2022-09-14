import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que calcule la nota de un trimestre de la asignatura Programación.
 * El programa pedirá las dos notas que ha sacado el alumno en los dos primeros exámenes.
 * Si la media de los dos exámenes da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media.
 * En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto,
 * por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto).
 * Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Introduce la nota del segundo examen: ");
        double nota2 = Double.parseDouble(scanner.nextLine());
        double notaMedia = (nota1 + nota2) / 2;
        if (notaMedia >= 5) {
            System.out.printf("Estas aprobado, tu media es: %.2f", notaMedia);
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):  ");
            String recuperacion = scanner.nextLine();
            if (recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Tu nota de programación es 5");
            } else {
                System.out.printf("Tu nota media es: %.2f", notaMedia);
            }
        }
    }


}
