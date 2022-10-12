import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios Acepta El Reto - PACKAGE_NAME
 * Date: Octubre / 2022
 * EJERCICIO *************** EJERCITO ROMANO ***************
 * www.aceptaelreto.com/problem/statement.php?id=119&cat=25
 */
public class EjercitoRomano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        while (numero != 0) {
            int totalEscudos = 0;
            int soldados = numero;
            while (soldados > 0) {
                int ladoFormacion = (int) Math.sqrt(soldados);
                int escudosSuperiores = (int) Math.pow(ladoFormacion, 2);
                int escudosLaterales = ladoFormacion * 4;
                totalEscudos += escudosSuperiores + escudosLaterales;
                soldados -= escudosSuperiores;
            }
            System.out.println(totalEscudos);
            numero = scanner.nextInt();
        }
    }
}
