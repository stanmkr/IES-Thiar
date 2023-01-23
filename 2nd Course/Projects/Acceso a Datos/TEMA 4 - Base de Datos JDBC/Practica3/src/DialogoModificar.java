import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class DialogoModificar extends JDialog {
    private JPanel contentPane;
    private JButton btnModAceptar;
    private JButton btnModCancelar;
    private JTextField txtModDni;
    private JTextField txtModNombre;
    private JTextField txtModApellidos;
    private JTextField txtModSueldo;
    private JTextField txtModDia;
    private JTextField txtModMatricula;
    private JTextField txtModAnio;
    private JTextField txtModMes;

    public DialogoModificar() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnModAceptar);

        btnModAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        btnModCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

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
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public void ponerTabla(JTable tabla, DefaultTableModel model){
        int filaSeleccionada;
        String dni, nombre, apellidos, sueldo, fecha, matricula;
        filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null,"Debes seleccionar el trabajador a modificar.");
        }else {
            try {
                model = (DefaultTableModel) tabla.getModel();
                dni = (String) model.getValueAt(filaSeleccionada,0);
                nombre = (String) model.getValueAt(filaSeleccionada,1);
                apellidos = (String) model.getValueAt(filaSeleccionada,2);
                sueldo = (String) model.getValueAt(filaSeleccionada,3);
                fecha = (String) model.getValueAt(filaSeleccionada,4);
                matricula = (String) model.getValueAt(filaSeleccionada,5);
                txtModDni.setText(dni);
                txtModNombre.setText(nombre);
                txtModApellidos.setText(apellidos);
                txtModSueldo.setText(sueldo);
                txtModDia.setText(fecha.substring(0,2));
                txtModMes.setText(fecha.substring(3,5));
                txtModAnio.setText(fecha.substring(6,10));
                txtModMatricula.setText(matricula);

                setSize(300,400);
                setLocationRelativeTo(null);
                setModal(true);
                setVisible(true);


            } catch (Exception exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al extraer los datos de la tabla");
            }
        }
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        DialogoModificar dialog = new DialogoModificar();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
