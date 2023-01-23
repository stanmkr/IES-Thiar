import javax.swing.*;
import java.awt.event.*;

public class Dialogo extends JDialog {
    private JPanel contentPane;
    private JTextField txtNuevoDni;
    private JTextField txtNuevoNombre;
    private JTextField txtNuevoApellidos;
    private JButton btnNuevoAceptar;
    private JButton btnNuevoCancelar;
    private JTextField txtNuevoSueldo;
    private JTextField txtNuevoDia;
    private JTextField txtNuevoMatricula;
    private JTextField txtNuevoAnio;
    private JTextField txtNuevoMes;
    private JPanel panelNuevoTrabajador;
    private JPanel panelNuevoBotones;

    public Dialogo() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnNuevoAceptar);


        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


        btnNuevoAceptar.addActionListener(e -> {
            String dni, nombre, apellidos, sueldo, fecha, matricula;
            String sql;
            try {
                // se recogen datos
                dni = txtNuevoDni.getText();
                nombre = txtNuevoNombre.getText();
                apellidos = txtNuevoApellidos.getText();
                sueldo = txtNuevoSueldo.getText().replace(",", ".");
                fecha = txtNuevoAnio.getText() + "/" + txtNuevoMes.getText() + "/" + txtNuevoDia.getText();
                matricula = txtNuevoMatricula.getText();
                // construyo  y ejecuto la sentencia sql
                sql = "Insert INTO trabajadores values ('" + dni + "','" + nombre + "','" + apellidos + "'," + sueldo + ",'" + fecha + "','" + matricula + "')";
                //System.out.println(sql);
                AccesoBD.sentencia.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Trabajador con DNI " + dni + " introducido correctamente");
                dispose();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Error al introducir el nuevo trabajador");
            }
        });


        btnNuevoCancelar.addActionListener(e -> {
            dispose();
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Dialogo dialog = new Dialogo();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
