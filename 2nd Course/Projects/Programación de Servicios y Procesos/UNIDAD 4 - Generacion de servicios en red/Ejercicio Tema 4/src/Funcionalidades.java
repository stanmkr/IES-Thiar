import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Properties;

/**
 * Created by Stanislav Krastev
 * Ejercicio Tema 4 - PACKAGE_NAME
 * Date: Febrero / 2023
 */
public class Funcionalidades {
    public static void descargarArchivo(URL url, String outputFileName) throws IOException
    {
        try (InputStream in = url.openStream();
             ReadableByteChannel rbc = Channels.newChannel(in);
             FileOutputStream fos = new FileOutputStream(outputFileName)) {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
    }

    public static void enviarEmail(JTextArea areaTexto, String archivo) {
        final String usuario = "your_email_here / tu_email"; // cuenta email del emisor
        final String password = "your_password_here / tu_contraseña"; // contraseña de la cuenta del emisor (esta contraseña se tiene que generar en el apartado de contraseñas de aplicaciones)

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(usuario, password);
                    }
                });
        try {
            Message mensaje = new MimeMessage(session);
            mensaje.setFrom(new InternetAddress(usuario));
            String receptor = "jesua.educa@gmail.com"; // cuenta email del destinatario
            mensaje.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(receptor));
            mensaje.setSubject("Esto es una prueba de envío de correo de mi aplicación Java "); // asunto del email

            String cuerpo = areaTexto.getText()+"\nEl fichero se ha enviado correctamente.";

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(cuerpo);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(new File("src/Archivos_Descargados/" + archivo));
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(archivo);
            multipart.addBodyPart(messageBodyPart);
            mensaje.setContent(multipart);
            System.out.println("Procediendo a enviar correo...");
            JOptionPane.showMessageDialog(null, "Procediendo a enviar email a: " + receptor, "Procediendo al envío", JOptionPane.INFORMATION_MESSAGE);
            Transport.send(mensaje);
            areaTexto.append("\nEl fichero se ha enviado correctamente.");
            System.out.println("Correo enviado con éxito.");
            JOptionPane.showMessageDialog(null, "El correo ha sido enviado a la dirección de email: " + receptor, "Correo enviado", JOptionPane.INFORMATION_MESSAGE);
        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al enviar el correo. ", "Error", JOptionPane.ERROR_MESSAGE);
            areaTexto.append("\nHa habido un error al enviar el correo electrónico.\nConsulta con el administrador del programa para solucionar el problema.");
        }
    }

    public static void run( Gui gui) {
        JFrame ventana = gui.getVentana();
        ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana.setTitle("Ejercicio Tema 4 | Stanislav Krastev");
        ventana.setSize(400, 550);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.getContentPane().add(gui.getPanelGeneral());
        ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(ventana, "¿Estas seguro/a de que quieres salir del programa?", "Cerrar sesión?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        gui.getClienteFTP().logout();
                        gui.getClienteFTP().disconnect();
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
}