import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.io.FilenameUtils;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;


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
    private  JButton botonEnviar;
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
                nombreArchivo = FilenameUtils.getBaseName(nombreArchivo) + "." + FilenameUtils.getExtension(nombreArchivo);
                DescargaArchivo.descargarArchivo(url = new URL(fieldURLArchivo.getText()), nombreArchivo);
                archivo = new File(nombreArchivo);
                System.out.println("Descarga completada del archivo " + nombreArchivo + "\nRUTA DEL ARCHIVO DESCARGADO:\n" + archivo.getAbsolutePath());
                JOptionPane.showMessageDialog(null, "Archivo descargado correctamente.", "Descarga completada", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al descargar el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });


        botonEnviar.addActionListener(e -> {
            if (conectorFTP.conexionServidor(fieldServidorFTP.getText(), fieldUsuario.getText(), String.valueOf(fieldClave.getPassword()))) {
                try {
                    clienteFTP.setFileType(FTP.BINARY_FILE_TYPE);
                    FileInputStream fileInputStream = new FileInputStream(archivo.getName());
                    clienteFTP.storeFile(archivo.getName(), fileInputStream);
                    fileInputStream.close();
                    JOptionPane.showMessageDialog(null, "El archivo se ha subido correctamente a la carpeta del usuario FTP", "Archivo subido", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                enviarEmail(archivo.getName());
            }
        });
    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public FTPClient getClienteFTP() {
        return clienteFTP;
    }


    public void enviarEmail(String archivo) {
        final String username = "stani.tests@gmail.com"; // cuenta email del emisor
        final String password = "rcatvotpgxqxyzjh"; // contraseña de la cuenta del emisor  (esta contraseña se tiene que generar en el apartado de contraseñas de aplicaciones)

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            String receptor = "stanis.krastev@gmail.com"; // cuenta email del destinatario
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(receptor));
            message.setSubject("Esto es una prueba de envío de correo de mi aplicación Java "); // asunto del email

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Te estoy enviando este correo desde mi aplicación hecha en Java usando Swing y un servidor FTP.\nSí, soy así de chulo y no me gusta utilizar la aplicación de Gmail predeterminada.\n\nUn Saludo.\nAtt: Stanislav Krastev");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(new File("src/Archivos_Descargados/" + archivo));
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(archivo);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            System.out.println("Procediendo a enviar correo...");
            JOptionPane.showMessageDialog(null, "Procediendo a enviar email a: " + receptor, "Procediendo al envío", JOptionPane.INFORMATION_MESSAGE);
            botonEnviar.setEnabled(false);
            Transport.send(message);
            System.out.println("Correo enviado con éxito.");
            botonEnviar.setEnabled(true);
            JOptionPane.showMessageDialog(null, "El correo ha sido enviado a la dirección de email: " + receptor, "Correo enviado", JOptionPane.INFORMATION_MESSAGE);

        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al enviar el correo. ", "Error", JOptionPane.ERROR_MESSAGE);

        }
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
