package ejercicio_8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - ejercicio_8
 * Date: marzo / 2022
 */
public class main {
    public static void main(String[] args) throws AvisarHaciendaException {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = null;
        boolean cuentaCorrecta = false;

        do {
            try {
                System.out.println("Introduce el IBAN de la cuenta bancaria: ");
                String iban = scanner.nextLine();
                System.out.println("Introduce el titular de la cuenta bancaria: ");
                String titular = scanner.nextLine();
                cuenta = new CuentaBancaria(iban, titular);
                cuentaCorrecta = true;
            } catch (CuentaException e) {
                e.printStackTrace();
            }
        } while (!cuentaCorrecta);
        int opcion = 0;
        do {
            try {
                System.out.println("\n******** MENU ********\n1. Datos de la cuenta.\n2. IBAN.\n3. Titular.\n4. Saldo.\n5. Ingreso.\n6. Retirada.\n7. Movimientos.\n8. Salir.\n**********************");
                System.out.println("Elige una opción del menú: ");
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                // limpio buffer
                scanner.nextLine();
            }
            switch (opcion) {
                case 1:
                    System.out.println("IBAN: " + cuenta.getIban() + "\nTitular: " + cuenta.getTitular() + "\nSaldo: " + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;
                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo: " + cuenta.getSaldo());
                    break;
                case 5:
                    try {
                        System.out.print("Introduce la cantidad a ingresar: ");
                        double cantidad = scanner.nextDouble();
                        if (cuenta.ingresar(cantidad)) System.out.println("Ingreso realizado correctamente.");

                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        scanner.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Introduce la cantidad a retirar");
                        double cantidad = scanner.nextDouble();
                        if (cuenta.retirar(cantidad)) System.out.println("Retirada realizada correctamente");

                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        scanner.nextLine();
                    } catch (CuentaException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    cuenta.mostrarMovimientos();
                    break;
                case 8:
                    System.out.println("HAS DECIDIDO SALIR.");
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 8);

    }
}
