import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Developed by Stanislav Krastev 1º DAM
 * EXAMEN_4y5 - PROGRAMACIÓN
 * noviembre - 2021
 * Vamos a hacer un programa para jugar a adivinar un número.
 * El programa elegirá un número al azar entre el 1 y el 999
 * Hay que intentar adivinar ese número en un número máximo de intentos. El número máximo de intentos se preguntará al inicio del juego.
 * Se podrá intentar adivinar el número hasta que queden intentos. El programa mostrará cuantos intentos quedan, y al introducir el número mostrará si has acertado o no.
 * En caso de no acertar, el juego dará una pista para ayudarnos a encontrar el número.
 */
public class ADIVINA_EL_NUMERO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declaración de variables
        int intentos; // variable para almacenar el numero de intentos
        int numeroAleatorio; // variable para almacenar el numero aleatorio creado por el ordenador
        int respuestaUsuario; // variable para almacenar el input del usuario
        boolean flag = false; // variable booleana que servira para imprimir un mensaje u otro

        System.out.print("INTRODUCE EL NÚMERO DE INTENTOS: ");
        intentos = scanner.nextInt(); // leo el input del usuario
        numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 999); // genero un número alaeatorio entre el 1 y el 999 y lo guardo en la variable
        System.out.printf("el numero es: %d %n", numeroAleatorio); // esto es para facilitar la correción del ejercicio

        for (int i = intentos; i >= 1; i--) { // hago un bucle For en el que recorro los número de intentos hasta el 0, restando un intento por cada vuelta del bucle
            System.out.printf("Te queda/n %d intento/s.", intentos);
            intentos--; // resto 1 a intentos
            System.out.print(" Introduce un número: ");
            respuestaUsuario = scanner.nextInt(); // leo respuesta del usuario
            if (respuestaUsuario == numeroAleatorio) { // condicional, si se cumple entra dentro del IF, levanto la bandera, y corto el programa
                flag = true;
                break;
            }
            if (respuestaUsuario > numeroAleatorio) { // otro condicional, en el que entrará siempre y cuando no haya entrado en el anterior condicional
                System.out.println("El número introducido es mayor"); // imprime esto si es verdadero
            } else {
                System.out.println("El número introducido es menor"); // imprime esto, si da False la condición
            }
        }

        if (flag) { // una vez fuera del bucle tengo un condicional, IF flag (está levantado, es decir flag = true), imprime la linea de abajo
            System.out.printf("Has acertado, el número aleatorio era: %d", numeroAleatorio); // si es verdadero imprime esto
        } else { // si es falso imprime esto
            System.out.printf("Lo siento, HAS PERDIDO, has agotado el número de intentos. El número era: %d", numeroAleatorio);
        }


    }
}
