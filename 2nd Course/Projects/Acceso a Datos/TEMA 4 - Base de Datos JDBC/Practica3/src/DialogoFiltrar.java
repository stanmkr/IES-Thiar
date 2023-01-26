import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DialogoFiltrar extends JDialog {
    private JPanel contentPane;
    private JButton btnFiltraAceptar;
    private JButton btnFiltrarCancelar;
    private JButton btnFiltrarVerTodos;
    private JTextField txtFiltrarDNI;
    private JTextField txtFiltrarNombre;
    private JTextField txtFiltrarApellidos;
    private JComboBox comboSueldo;
    private JTextField txtFiltrarSueldo;
    private JComboBox comboFecha;
    private JTextField txtFiltrarDia;
    private JTextField txtFiltrarMes;
    private JTextField txtFiltrarAnio;
    private JTextField txtFiltrarMatricula;
    private JPanel panelOrdenacion;
    private JComboBox comboCamposOrdenacion;
    private JRadioButton radioASC;
    private JRadioButton radioDESC;
    private String[] signosFiltrado = {"=", ">", "<", ">=", "<=", "<>"};
    private String[] ordenacion = {"Sin ordenacion", "DNI", "Nombre", "Apellidos", "Sueldo", "Fecha", "Matricula"};
    private DefaultTableModel m;
    private ButtonGroup grupoBotones = new ButtonGroup();
    private static Gui gui;

    public DialogoFiltrar(Gui gui) {
        DialogoFiltrar.gui = gui;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnFiltraAceptar);
        for (String signo : signosFiltrado) {
            comboFecha.addItem(signo);
            comboSueldo.addItem(signo);
        }
        for (String o : ordenacion) {
            comboCamposOrdenacion.addItem(o);
        }
        grupoBotones.add(radioASC);
        grupoBotones.add(radioDESC);


        btnFiltraAceptar.addActionListener(e -> onOK());

        btnFiltrarCancelar.addActionListener(e -> onCancel());

        btnFiltrarVerTodos.addActionListener(e -> onVerTodos());


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
        String dni, nombre, apellidos, sueldo, fecha, matricula;
        String cmboSueldo, cmboFecha;
        String sql;
        int numeroCondiciones = 0;
        JTable tabla = gui.getTabla();

        try {
            dni = txtFiltrarDNI.getText();
            nombre = txtFiltrarNombre.getText();
            apellidos = txtFiltrarApellidos.getText();
            sueldo = txtFiltrarSueldo.getText().replace(",", ".");
            fecha = txtFiltrarAnio.getText() + "/" + txtFiltrarMes.getText() + "/" + txtFiltrarDia.getText();
            matricula = txtFiltrarMatricula.getText();
            cmboSueldo = (String) comboSueldo.getSelectedItem();
            cmboFecha = (String) comboFecha.getSelectedItem();

            sql = "SELECT * FROM trabajadores";
            if (!dni.equals("")) {
                numeroCondiciones++;
                sql += " WHERE dni LIKE '%" + dni + "%' ";
            }
            if (!nombre.equals("")) {
                numeroCondiciones++;
                if (numeroCondiciones == 1) {
                    sql += " WHERE nombre LIKE '%" + nombre + "%' ";
                } else {
                    sql += " AND nombre LIKE '%" + nombre + "%' ";
                }
            }
            if (!apellidos.equals("")) {
                numeroCondiciones++;
                if (numeroCondiciones == 1) {
                    sql += " WHERE apellidos LIKE '%" + apellidos + "%' ";
                } else {
                    sql += " AND apellidos LIKE '%" + apellidos + "%' ";
                }
            }
            if (!sueldo.equals("")) {
                numeroCondiciones++;
                if (numeroCondiciones == 1) {
                    sql += " WHERE sueldo " + cmboSueldo + " " + sueldo;
                } else {
                    sql += " AND sueldo " + cmboSueldo + " " + sueldo;
                }
            }
            if (!fecha.equals("//")) {
                numeroCondiciones++;
                if (numeroCondiciones == 1) {
                    sql += " WHERE fecha" + cmboFecha + "'" + fecha + "'";
                } else {
                    sql += " AND fecha" + cmboFecha + "'" + fecha + "'";
                }
            }
            if (!matricula.equals("")) {
                numeroCondiciones++;
                if (numeroCondiciones == 1) {
                    sql += " WHERE matricula LIKE '%" + matricula + "%' ";
                } else {
                    sql += " AND matricula LIKE '%" + apellidos + "%' ";
                }
            }
            String campoOrden = (String) comboCamposOrdenacion.getSelectedItem();
            if (!campoOrden.equals("Sin ordenacion")) {
                if (radioASC.isSelected()) {
                    sql += " ORDER by " + campoOrden + " ASC";
                } else {
                    sql += " ORDER by " + campoOrden + " DESC";
                }
            }else {
                System.out.println();
            }
            try {
                System.out.println(sql);
                ResultSet r = AccesoBD.sentencia.executeQuery(sql);
                m = gui.getModel();
                while (m.getRowCount() > 0) {
                    m.removeRow(0);
                }
                String[] titulos = {"DNI", "Nombre", "Apellidos", "Sueldo", "Fecha", "Matrícula"};
                //Gui.prepararTablaNueva(m,gui.getTabla());
                String[] fila = new String[6];
                while (r.next()) {
                    fila[0] = r.getString("DNI");
                    fila[1] = r.getString("Nombre");
                    fila[2] = r.getString("Apellidos");
                    fila[3] = r.getString("Sueldo").replace(".", ",");
                    fecha = r.getString("Fecha");
                    fecha = fecha.substring(8, 10) + "/" + fecha.substring(5, 7) + "/" + fecha.substring(0, 4);
                    fila[4] = fecha;
                    fila[5] = r.getString("Matricula");
                    m.addRow(fila);
                }
                tabla.setModel(m);
                dispose();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al filtrar la tabla trabajadores");
        }


    }

    private void onVerTodos() {
       gui.mostrarTrabajadores();
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        DialogoFiltrar dialog = new DialogoFiltrar(gui);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
