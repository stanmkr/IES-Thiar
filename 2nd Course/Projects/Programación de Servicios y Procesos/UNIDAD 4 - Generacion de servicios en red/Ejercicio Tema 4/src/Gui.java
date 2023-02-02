import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.io.FilenameUtils;
import javax.swing.*;
import java.awt.event.WindowEvent;
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
    static JFrame ventana;
    ConectorFTP conectorFTP;
    FTPClient clienteFTP = new FTPClient();

    public Gui() {
        conectorFTP = new ConectorFTP(clienteFTP);

        botonCargarArchivo.addActionListener(e -> {
            try {
                String nombreArchivo = fieldURLArchivo.getText();
                nombreArchivo = FilenameUtils.getBaseName(nombreArchivo) +"."+ FilenameUtils.getExtension(nombreArchivo);
                DescargaArchivo.descargarArchivo(url = new URL(fieldURLArchivo.getText()), nombreArchivo);
                archivo = new File(nombreArchivo);
                System.out.println("Descarga completada del archivo " + nombreArchivo +"\nRUTA DEL ARCHIVO DESCARGADO:\n" + archivo.getAbsolutePath());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        botonEnviar.addActionListener(e -> {
            if (conectorFTP.conexionServidor(fieldServidorFTP.getText(), fieldUsuario.getText(), String.valueOf(fieldClave.getPassword()))){
                try {
                    clienteFTP.setFileType(FTP.BINARY_FILE_TYPE);
                    FileInputStream fileInputStream = new FileInputStream(archivo.getName());
                    clienteFTP.storeFile(archivo.getName(), fileInputStream);
                    fileInputStream.close();
                    JOptionPane.showMessageDialog(null, "El archivo se ha subido correctamente a la carpeta del usuario FTP", "Archivo subido", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

           // conectorFTP.conexionServidor(fieldServidorFTP.getText(), fieldUsuario.getText(), String.valueOf(fieldClave.getPassword()));
        /*    if (archivo != null) {
                System.out.println(archivo.getName());
            }*/

        });
    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public FTPClient getClienteFTP() {
        return clienteFTP;
    }

    public static void run() {
        Gui formulario = new Gui();
        ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana.setTitle("Ejercicio Tema 4 | Stanislav Krastev");
        ventana.setSize(400, 550);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.getContentPane().add(formulario.getPanelGeneral());

        ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(ventana, "¿Estas seguro/a de que quieres salir del programa?", "Cerrar sesión?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        formulario.getClienteFTP().disconnect();
                        System.out.println("El cliente se ha desconectado del servidor.");
                        JOptionPane.showMessageDialog(null, "El cliente se ha desconectado del servidor", "Cliente desconectado", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NullPointerException | IOException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                }
            }
        });
    }

    public static void main(String[] args) {
        run();
    }
}
