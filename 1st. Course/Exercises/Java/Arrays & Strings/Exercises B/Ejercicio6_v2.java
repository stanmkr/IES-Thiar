package EjerciciosB;


import java.util.Scanner;

public class Ejercicio6_v2 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase:");
        String frase = entrada.nextLine().toUpperCase();
        char[] vocales = {'A', 'E', 'I', 'O', 'U'};

        // Para cada una de las vocales
        for (int i = 0; i < vocales.length; i++) {
            int contador = 0;
            // Recorro la frase buscando esas vocales
            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == vocales[i])
                    contador++;

            }
            System.out.println("Nº de " + vocales[i] + "'s: " + contador);

        }
    }
}