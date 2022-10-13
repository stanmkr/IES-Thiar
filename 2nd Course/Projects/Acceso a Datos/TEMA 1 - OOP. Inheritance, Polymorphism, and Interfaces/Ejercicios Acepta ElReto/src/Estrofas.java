import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios Acepta ElReto - PACKAGE_NAME
 * Date: Octubre / 2022
 */
public class Estrofas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int versos = 1;
        String frase, frase2, frase3, frase4;
        List<String> listaVersos = new ArrayList<>();
        while (versos > 0) {
            try {
                System.out.print("Introduce el número de versos: ");
                versos = Integer.parseInt(scanner.nextLine());
                listaVersos.clear();
                for (int i = 0; i < versos; i++) {
                    String verso = scanner.nextLine();
                    listaVersos.add(verso);
                }
                //noinspection EnhancedSwitchMigration
                switch (versos) {
                    case 2:
                        frase = listaVersos.get(0);
                        frase2 = listaVersos.get(1);
                        String dosUltimasLetrasFrase1 = frase.substring(frase.length() - 2);
                        String dosUltimasLetrasFrase2 = frase2.substring(frase2.length() - 2);
                        String tresUltimasLetrasFrase1 = frase.substring(frase.length() - 3);
                        String tresUltimasLetrasFrase2 = frase2.substring(frase2.length() - 3);
                        if (dosUltimasLetrasFrase1.equals(dosUltimasLetrasFrase2) || tresUltimasLetrasFrase1.equals(tresUltimasLetrasFrase2)) {
                            System.out.println("PAREADO");
                        } else {
                            System.out.println("DESCONOCIDO");
                        }
                        break;
                    case 3:
                        frase = listaVersos.get(0);
                        frase3 = listaVersos.get(2);
                        dosUltimasLetrasFrase1 = frase.substring(frase.length() - 2);
                        String dosUltimasLetrasFrase3 = frase3.substring(frase3.length() - 2);
                        tresUltimasLetrasFrase1 = frase.substring(frase.length() - 3);
                        String tresUltimasLetrasFrase3 = frase3.substring(frase3.length() - 3);
                        if (dosUltimasLetrasFrase1.equals(dosUltimasLetrasFrase3) || tresUltimasLetrasFrase1.equals(tresUltimasLetrasFrase3)) {
                            System.out.println("TERCETO");
                        } else {
                            System.out.println("DESCONOCIDO");
                        }
                        break;
                    case 4:
                        System.out.println("a");
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("Debes de introducir números.");
            }

        }
    }
}
