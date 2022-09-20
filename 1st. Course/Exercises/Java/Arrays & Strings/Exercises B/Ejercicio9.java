package EjerciciosB;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosB
 * noviembre - 2021
 * <p>
 * Juego del ahorcado. Realiza un programa para jugar al juego del ahorcado.
 * El programa elegirá de forma aleatoria una palabra de una lista predefinida,
 * mostrará la palabra oculta de alguna forma e irá pregunta letra a letra
 * hasta que acertemos la palabra o lleguemos al número máximo de intentos.
 * Al introducir una letra, si está en la palabra, la mostraremos. Si no está en la palabra, sumaremos un fallo.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] reservadas = "abstract assert boolean break byte case catch char class const continue default do double else enum extends false final finally float for goto if implements import instanceof int interface long native new null package private protected public return short static strictfp String super switch synchronized this throw throws transient true try void volatile while".split(" ");
        int aleatorio;
        String valorUsuario;

        String[] imagenes = {
                "		      +---+\n"
                        + "		      |   |\n"
                        + "		          |\n"
                        + "		          |\n"
                        + "		          |\n"
                        + "		          |\n"
                        + "		    =========",
                "		      +---+\n"
                        + "		      |   |\n"
                        + "		      O   |\n"
                        + "		          |\n"
                        + "		          |\n"
                        + "		          |\n"
                        + "		    =========",
                "		      +---+\n"
                        + "		      |   |\n"
                        + "		      O   |\n"
                        + "		      |   |\n"
                        + "		          |\n"
                        + "		          |\n"
                        + "		    =========",
                "		      +---+\n"
                        + "		      |   |\n"
                        + "		      O   |\n"
                        + "		     /|   |\n"
                        + "		          |\n"
                        + "		          |\n"
                        + "		    =========",
                "		      +---+\n"
                        + "		      |   |\n"
                        + "		      O   |\n"
                        + "		     /|\\  |\n"
                        + "		          |\n"
                        + "		          |\n"
                        + "		    =========",
                "		      +---+\n"
                        + "		      |   |\n"
                        + "		      O   |\n"
                        + "		     /|\\  |\n"
                        + "		     /    |\n"
                        + "		          |\n"
                        + "		    =========",
                "		      +---+\n"
                        + "		      |   |\n"
                        + "		      O   |\n"
                        + "		     /|\\  |\n"
                        + "		     / \\  |\n"
                        + "		          |\n"
                        + "		    ========="
        };

        aleatorio = ThreadLocalRandom.current().nextInt(0, reservadas.length);
        System.out.printf("PALABRA GENERADA: %s%n", reservadas[aleatorio]);
        String palabraGenerada = reservadas[aleatorio];


        char letra;
        for (int i = 0; i < imagenes.length; i++) {
            System.out.print("Introduce la letra con la que quieres probar: ");
            valorUsuario = scanner.nextLine();
            letra = valorUsuario.charAt(0);        }


    }
}
