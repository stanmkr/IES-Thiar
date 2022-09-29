import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor=1;
        do {
            System.out.print("\nIntroduce un valor positivo: ");
            try {
                valor = scanner.nextInt();
                imprimePositivo(valor);
            } catch (InputMismatchException e) {
                System.out.println("Debes de introducir enteros");
                scanner.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (valor != 0);

        int valor2=-1;
        do{
            System.out.print("\nIntroduce un valor negativo: ");
            try{
                valor2 = scanner.nextInt();
                imprimeNegativo(valor2);
            }catch (InputMismatchException e){
                System.out.println("Debes de introducir enteros");
                scanner.nextLine();
            }catch (Exception e){
                e.printStackTrace();
            }
        }while(valor2 !=0);


    }


    static void imprimePositivo(int p) throws Exception {
        if (p < 0) throw new Exception("El número no puede ser negativo");
        else System.out.println("Este es tu número positivo: " + p);
    }

    static void imprimeNegativo(int p) throws Exception {
        if (p > 0) throw new Exception("El número no puede ser positivo");
        else System.out.println("Este es tu número negativo: " + p);
    }
}
