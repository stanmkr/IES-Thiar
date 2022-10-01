

import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - CasoPracticoA
 * Date: abril / 2022
 */


public class MiniTerminal {
    public static void main(String[] args) {
        java.net.InetAddress localMachine = null;
        try {
            localMachine = java.net.InetAddress.getLocalHost(); // para obtener el nombre del host
        } catch (UnknownHostException ignored) {
        }
        MiniFileManager terminal = new MiniFileManager();
        Scanner scanner = new Scanner(System.in);
        String linea;
        String comando;
        System.out.println("""
                **************************************
                ****                              ****
                ****                              ****
                **  BIENVENIDO A MI MINI TERMINAL   **
                ****                              ****
                ****                              ****
                **************************************
                """);
        while (true) {
            assert localMachine != null;
            System.out.print("\n" + System.getProperty("user.name") + "@" + localMachine.getHostName() + ":~$ "); // para mostrar el usuario actual que ejecuta y el nombre del host
            linea = scanner.nextLine();
            String[] parametro = linea.split(" "); // guardar las palabras introducidas por el usuario en un array de Strings
            comando = parametro[0]; // la primera palabra siempre será el comando

            switch (comando) {
                case "pwd":
                    System.out.println(terminal.getPWD());
                    break;
                case "cd":
                    try {
                        String ruta = "";
                        // bucle para poder usar todos  los parametros introducidos menos el primero. De esta manera se podrá cambiar a rutas que contengan espacios
                        for (int i = 1; i < parametro.length; i++) {
                            if (i == 1) {
                                ruta = ruta + parametro[i];
                            } else {
                                ruta = ruta + " " + parametro[i];
                            }
                        }
                        terminal.cd(ruta);
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("Número de parámetros incorrecto");
                    }
                    break;
                case "ls":
                    try {
                        terminal.printList(false);
                    } catch (NullPointerException e) {
                        System.out.println("Algo ha fallado");
                    }
                    break;
                case "ll":
                    try {
                        terminal.printList(true);
                    } catch (NullPointerException e) {
                        System.out.println("Algo ha fallado");
                    }
                    break;
                case "mkdir":
                    try {
                        terminal.mkdir(parametro[1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Número de parámetros incorrecto");
                    }
                    break;
                case "rm":
                    try {
                        terminal.remove(parametro[1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Número de parámetros incorrecto");
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "mv":
                    try {
                        terminal.mv(parametro[1], parametro[2]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Número de parámetros incorrecto");
                    }
                    break;
                case "help":
                    terminal.ayuda();
                    break;
                case "exit":
                    System.out.println("Gracias por usar mi terminal, nos vemos pronto.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Comando desconocido");
                    break;
            }
        }

    }
}
