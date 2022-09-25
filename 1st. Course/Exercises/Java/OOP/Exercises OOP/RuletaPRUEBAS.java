package ejercicios.ejerciciosTema8;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Programación - ejercicios.ejerciciosTema8
 * Date: FEBRERO / 2022
 */
public class RuletaPRUEBAS {
    public static void main(String[] args) {
        Ruleta primerJuego = new Ruleta(10000,100,true);
        Scanner scanner = new Scanner(System.in);
        primerJuego.setDineroApostado(50); // cantidad que se va a apostar en cada giro de la ruleta
        for (int i = 0; i <primerJuego.tiradas ; i++) {
            primerJuego.girar();
        }
        System.out.println(primerJuego.getDineroTotalApostado()); // muestro el dinero total con el que ha acabado las tiradas

        //System.out.print("¿Cuánto vas a apostar en esta vuelta?: ");
        //primerJuego.setDineroApostado(scanner.nextInt());

    }
}
