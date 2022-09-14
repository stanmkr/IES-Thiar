import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que recibe como datos de entrada una hora expresada en horas,
 * minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas, minutos, segundos;
        System.out.print("Introduce las horas: ");
        horas = scanner.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos = scanner.nextInt();
        System.out.print("Introduce los segundos: ");
        segundos = scanner.nextInt();
        if (segundos == 59) {
            segundos = 0;
            if (minutos == 59) {
                minutos = 0;

                if (horas == 23) {
                    horas = 0;
                } else if (horas < 23) {
                    horas += 1;
                }
            } else if (minutos < 59) {
                minutos += 1;
            }
        } else if (segundos < 59) {
            segundos += 1;
        }
        System.out.printf("Son las %d:%d:%d", horas, minutos, segundos);
        //System.out.printf("Son las  %d:%d:%d", horas, minutos, segundos);

    }
}
