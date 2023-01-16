import org.apache.commons.net.examples.util.IOUtil;
import org.apache.commons.net.telnet.TelnetClient;
import java.io.IOException;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: ConexionTelnet
 * FECHA: Enero / 2023
 */
public class ClienteTelnetPracticas {
    public static void main(String[] args) { // Creamos un nuevo cliente telnet
        TelnetClient telnet = new TelnetClient();
        String localhost = args[0];
        int puerto = Integer.parseInt(args[1]);

        try {
            // Realizamos la conexión¡
            telnet.connect(localhost, puerto);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }
        /* Enlazamos los flujos de entrada y salida del cliente telnet
         * con las entradas y salidas estándar (monitor/teclado)
         */
        IOUtil.readWrite(telnet.getInputStream(), telnet.getOutputStream(), System.in, System.out);
        try {
            telnet.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(3);
        }
    }
}
