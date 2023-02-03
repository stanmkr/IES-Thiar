import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.io.FilenameUtils;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;


/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicio Tema 4
 * FECHA:  / 2023
 */
public class Gui {
    private JPanel panelGeneral;
    private JTextField fieldURLArchivo;
    private JButton botonCargarArchivo;
    private JTextField fieldServidorFTP;
    private JTextField fieldPuertoServidor;
    private JTextField fieldUsuario;
    private JPasswordField fieldClave;
    private JButton botonEnviar;
    private JPanel panelSuperior;
    private JPanel panelInformacion;
    private JTextArea areaTexto;
    private URL url;
    private File archivo;
    private JFrame ventana = new JFrame();
    ConectorFTP conectorFTP;
    FTPClient clienteFTP = new FTPClient();

    public Gui() {
        conectorFTP = new ConectorFTP(clienteFTP);
        areaTexto.append("Bienvenidos a la prueba de servicios");

        botonCargarArchivo.addActionListener(e -> {
            try {
                String nombreArchivo = fieldURLArchivo.getText();
                nombreArchivo = FilenameUtils.getBaseName(nombreArchivo) + "." + FilenameUtils.getExtension(nombreArchivo);
                Funcionalidades.descargarArchivo(url = new URL(fieldURLArchivo.getText()), nombreArchivo);
                archivo = new File(nombreArchivo);
                System.out.println("Descarga completada del archivo " + nombreArchivo + "\nRUTA DEL ARCHIVO DESCARGADO:\n" + archivo.getAbsolutePath());
                JOptionPane.showMessageDialog(null, "Archivo descargado correctamente.", "Descarga completada", JOptionPane.INFORMATION_MESSAGE);
                areaTexto.append("\nFichero: " + archivo.getName() +
                        "\nTamaño del archivo en kilobytes: " + (archivo.length() / 1024) + " Kb\n" +
                        "\n---------Fichero cargado con ÉXITO---------");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al descargar el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });


        botonEnviar.addActionListener(e -> {
            if (conectorFTP.conexionServidor(fieldServidorFTP.getText(), fieldUsuario.getText(), String.valueOf(fieldClave.getPassword()))) {
                try {
                    areaTexto.append("\nConectando con el servidor FTP..." +
                            "\n" + clienteFTP.getReplyString() +
                            "\nServidor: " + clienteFTP.getSystemName());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    clienteFTP.setFileType(FTP.BINARY_FILE_TYPE);
                    FileInputStream fileInputStream = new FileInputStream(archivo.getName());
                    clienteFTP.storeFile(archivo.getName(), fileInputStream);
                    fileInputStream.close();
                    JOptionPane.showMessageDialog(null, "El archivo se ha subido correctamente a la carpeta del usuario FTP", "Archivo subido", JOptionPane.INFORMATION_MESSAGE);
                    areaTexto.append("\nFichero subido a la carpeta del usuario FTP: " + fieldUsuario.getText() + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                areaTexto.append("\n---------Comenzando el envío del fichero---------");
                Funcionalidades.enviarEmail(areaTexto, archivo.getName());
            }
        });
    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public FTPClient getClienteFTP() {
        return clienteFTP;
    }

    public  JFrame getVentana() {
        return ventana;
    }

    public static void main(String[] args) {
        Funcionalidades.run(new Gui());
    }
}
