import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 *
 * Realiza un programa que lea una fecha introduciendo el día,
 * mes y año por separado y nos diga si la fecha es correcta o no.
 * Supondremos que todos los meses tienen 30 días. Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no
 *
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia, mes, anyo;
        System.out.print("Introduce el dia: ");
        dia = scanner.nextInt();
        System.out.print("Introduce el mes: ");
        mes = scanner.nextInt();
        System.out.print("Introduce el año: ");
        anyo = scanner.nextInt();
        // manera 1
        System.out.println((fechaCorrecta(dia,mes,anyo)?"La fecha es correcta":"La fecha no es correcta"));
        //MANERA 2
        if (fechaCorrecta(dia,mes,anyo)){
            System.out.println("La fecha existe");
        } else {
            System.out.println("La fecha no existe");
        }
    }

    /**
     * introducidos tres parámetros, la función calcula si los parámetros son correctos, siendo estos dia del mes, mes y añó
     * @param day el dia del mes
     * @param month el mes del año
     * @param year el año
     * @return devuelve si la fecha está en el rango correcto o no
     */

   public static boolean fechaCorrecta(int day, int month, int year) {
       return !(day>30 || day<1 || month > 12 || month <1 || year<0);
//        String resultado = "Correcta";
//        if (day < 1 || day > 30) {
//            resultado = "Incorrecta";
//        } else if (month < 1 || month > 12) {
//            resultado = "Incorrecta";
//        } else if (year < 0 ){
//            resultado = "Incorrecta";
//        }
    }
}
