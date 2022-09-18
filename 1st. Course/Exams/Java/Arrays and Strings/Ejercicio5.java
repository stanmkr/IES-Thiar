import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * EXAMEN_ARRAY_STRING - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreCompleto;
        char a = 'A';
        char e = 'E';
        char mii = 'I';
        char o = 'O';
        char u = 'U';
        int contador = 0;
        char espacio = ' ';
        String identificador = "";
        System.out.print("Introduce el nombre completo del usuario: ");
        nombreCompleto = scanner.nextLine();
        nombreCompleto = nombreCompleto.toUpperCase();

        identificador = nombreCompleto.substring(0, 3); // almaceno siempre los 3 primeros caracteres del nombre
        for (int i = 0; i < nombreCompleto.length(); i++) { // recorro el nombre
            if (nombreCompleto.charAt(i) == a){
                contador++;
            }
            if (nombreCompleto.charAt(i) == mii){
                contador++;
            }
            if (nombreCompleto.charAt(i) == e){
                contador++;
            }
            if (nombreCompleto.charAt(i) == u){
                contador++;
            }
            if (nombreCompleto.charAt(i) == o){
                contador++;
            }
            if (espacio == nombreCompleto.charAt(i)) { // si la variable en la que almaceno un espacio es igual al caracter de la cadena de texto hago la operacion inferior
                identificador += nombreCompleto.substring(i + 1, i + 4);


            }
        }
        System.out.printf("Tu identificador de usuario es %s", identificador+contador); // muestro la variable en la que he ido almacenando y concatenando caracteres


    }

}

