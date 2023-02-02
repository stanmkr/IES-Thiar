import org.apache.commons.net.ftp.FTPClient;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by Stanislav Krastev
 * Ejercicio Tema 4 - PACKAGE_NAME
 * Date: Enero / 2023
 */

public class ConectorFTP {

    private final FTPClient clienteFTP;


    public ConectorFTP(FTPClient clienteFTP) {
        this.clienteFTP = clienteFTP;
    }

    public FTPClient getClienteFTP() {
        return clienteFTP;
    }

    public boolean conexionServidor(String servidor, String usuario, String clave) {
        try {
            clienteFTP.connect(servidor);
            boolean login = clienteFTP.login(usuario, clave);
            if (login) {
                if (servidor.equals("")){
                    System.out.println("Cliente: <" + usuario + "> conectado al servidor FTP: <localhost>.");
            ;
                }else {
                    System.out.println("Cliente: <" + usuario + "> conectado al servidor FTP: <" + servidor + ">.");

                }
                JOptionPane.showMessageDialog(null, "Conexión realizada con éxito.", "Conexión exitosa", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Conexión fallida, revisa los datos.", "Algo ha salido mal", JOptionPane.ERROR_MESSAGE);
                System.err.println("No ha sido posible la conexión.");
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Conexión fallida, revisa el nombre del servidor.", "No se reconoce el nombre del servidor", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }



}
