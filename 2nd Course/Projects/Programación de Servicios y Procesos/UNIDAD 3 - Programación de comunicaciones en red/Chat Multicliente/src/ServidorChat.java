import javax.swing.*;

/**
 * Created by Stanislav Krastev
 * Chat Multicliente - PACKAGE_NAME
 * Date:  / 2023
 */
public class ServidorChat {
    private JPanel panelGeneral;
    private JTextArea areaDeTexto;


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }


    public static void run() {
        ServidorChat formulario = new ServidorChat();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Servidor de Chat | Stanislav Krastev");
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        run();
    }
}
