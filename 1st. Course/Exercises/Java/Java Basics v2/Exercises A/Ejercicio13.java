package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 *  Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta adivinarlo.
 *  Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado).
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 101;
        String inputUser;
        int aleatorio;
        System.out.println("Piensa un número, el ordenador intentará adivinarlo. Guía al ordenador con 'menor' 'mayor' o 'igual'");
        do {
            aleatorio = (int) (Math.random()*(max-min)+min);
            System.out.printf("El ordenador dice que es: %d %n",aleatorio);
            System.out.print("Escribe tu respuesta: ");
            inputUser = scanner.nextLine();
            if (inputUser.equals("mayor")){
                min = aleatorio +1;
            } else if (inputUser.equals("menor")){
                max = aleatorio;
            }
        } while (!inputUser.equals("igual"));
        System.out.printf("El número que pensaste era: %d",aleatorio);
    }
}
