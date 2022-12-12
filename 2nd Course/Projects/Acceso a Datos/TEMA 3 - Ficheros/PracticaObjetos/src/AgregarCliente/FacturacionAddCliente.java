package AgregarCliente;

import javax.swing.*;
import java.io.*;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: PracticaObjetos
 * FECHA:  / 2022
 */
public class FacturacionAddCliente {
    private JPanel panelGeneral;
    private JPanel panelBoton;
    private JButton botonCrearArchivo;
    private JPanel panelNuevoCliente;
    private JTextField fieldDNI;
    private JTextField fieldNombre;
    private JTextField fieldDireccion;
    private JTextField fieldSaldo;
    private JButton botonAnyadirCliente;
    private JButton SALIRButton;
    private PrintWriter fichero;
    private File archivo;


    public FacturacionAddCliente() {
        panelNuevoCliente.setVisible(false);

        // LISTENER BOTON DE CREAR NUEVO ARCHIVO
        botonCrearArchivo.addActionListener(e -> {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File("."));
            jFileChooser.setApproveButtonText("Guardar");
            int seleccion = jFileChooser.showOpenDialog(getPanelGeneral());
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                try {
                    fichero = new PrintWriter(jFileChooser.getSelectedFile() + ".txt");
                    archivo = new File(jFileChooser.getSelectedFile() + ".txt");
                    System.out.println("Archivo " + archivo.getName() + " guardado en ''" + archivo.getAbsolutePath() + "''");
                    JOptionPane.showMessageDialog(getPanelGeneral(), "ARCHIVO CREADO CORRECTAMENTE EN: " + archivo.getAbsolutePath());
                    panelBoton.setVisible(false);
                    panelNuevoCliente.setVisible(true);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        // LISTENER BOTÓN DE AÑADIR NUEVO CLIENTE
        botonAnyadirCliente.addActionListener(e -> {
            try {
                ControlArchivo.anyadir(fieldDNI.getText(), fieldNombre.getText(), fieldDireccion.getText(), Double.parseDouble(fieldSaldo.getText()));
                System.out.println("Cliente con DNI: " + fieldDNI.getText() + " y NOMBRE: " + fieldNombre.getText() + " añadido correctamente");
                JOptionPane.showMessageDialog(getPanelGeneral(), "Cliente con DNI: " + fieldDNI.getText() + " y NOMBRE: " + fieldNombre.getText() + " AÑADIDO CORRECTAMENTE", "Cliente Añadido", JOptionPane.INFORMATION_MESSAGE);
                fieldDNI.setText("");
                fieldNombre.setText("");
                fieldDireccion.setText("");
                fieldSaldo.setText("");
            } catch (NumberFormatException exception) {
                System.out.println("El campo saldo contiene caracteres inválidos.");
                JOptionPane.showMessageDialog(getPanelGeneral(), "Revisa el campo saldo.", "ERROR AL CREAR CLIENTE", JOptionPane.ERROR_MESSAGE);
            }
        });

        // LISTENER BOTÓN DE SALIR
        SALIRButton.addActionListener(e -> {
            if (!ControlArchivo.listaClientes.isEmpty()) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(archivo);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    for (Cliente cliente : ControlArchivo.listaClientes) {
                        objectOutputStream.writeObject(cliente);
                    }
                    objectOutputStream.close();
                    System.out.println("Los clientes han sido guardados correctamente en " + archivo.getAbsolutePath());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } else {
                System.out.println("La lista de clientes está vacía.");
            }
            System.out.println("Programa finalizado.");
            System.exit(0);
        });
    }

    /**
     * @return el panel general
     */
    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    /**
     * Método que ejecuta la aplicación
     */
    public static void run() {
        FacturacionAddCliente formulario = new FacturacionAddCliente();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Añadir Cliente | Stanislav Krastev");
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.getContentPane().add(formulario.getPanelGeneral());
    }

    public static void main(String[] args) {
        run();
    }
}
