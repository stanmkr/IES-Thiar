import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica3
 * FECHA:  / 2023
 */
public class Gui {
    JPanel panelGeneral;
    private JButton btnEliminar;
    private JFrame ventanaPrincipal;
    private JTable tabla;
    private JPanel panelAcciones;
    private JButton nuevoButton;
    private JButton btnModificar;
    private JButton btnFiltrar;
    private JTextField etiSueldoMedio;
    private JTextField etiNumeroTrab;
    static DefaultTableModel model;
    private String[] titulos = {"DNI", "Nombre", "Apellidos", "Sueldo", "Fecha", "Matrícula"};
    private JDialog dialogoNuevo;
    private JDialog dialogoModificar;


    public Gui() {
        dialogoNuevo = new DialogoNuevo();
        dialogoModificar = new DialogoModificar();
        prepararTabla(tabla);


        btnEliminar.addActionListener(e -> {
            btnEliminarActionPerformed(e);
        });


        nuevoButton.addActionListener(e -> {
            dialogoNuevo.setSize(500, 400);
            dialogoNuevo.setModal(true);
            dialogoNuevo.setLocationRelativeTo(null);
            dialogoNuevo.setVisible(true);
            mostrarTrabajadores();
        });


        btnModificar.addActionListener(e -> {
            DialogoModificar dialogoMod = new DialogoModificar();
            dialogoMod.ponerTabla(tabla, model);
            mostrarTrabajadores();

        });


        btnFiltrar.addActionListener(e -> {
            DialogoFiltrar dialogoFiltrar = new DialogoFiltrar();
            dialogoFiltrar.setSize(400, 500);
            dialogoFiltrar.setLocationRelativeTo(null);
            dialogoFiltrar.setModal(true);
            dialogoFiltrar.setVisible(true);

        });
    }

    public void hacerCalculos(ResultSet resultSet) {
        int numTrabajadores = 0;
        double sumaSueldo = 0;
        double media;
        try {
           //resultSet.beforeFirst();
            while (resultSet.next()) {
                numTrabajadores++;
                sumaSueldo = sumaSueldo + resultSet.getDouble("sueldo");
            }
            media = sumaSueldo / numTrabajadores;
            etiNumeroTrab.setText("" + numTrabajadores);
            etiSueldoMedio.setText("" + media);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al realizar cálculos");
        }
    }

    public void prepararTabla(JTable tb) {
        model = new DefaultTableModel(null, titulos);
        tb.setModel(model);
    }


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        int filaSeleccionada;
        String dni;
        int respuesta;
        try {
            filaSeleccionada = tabla.getSelectedRow();
            if (filaSeleccionada == -1) { // no se seleccionó ninguna fila
                JOptionPane.showMessageDialog(null, "Debes seleccionar el trabajador a borrar");
            } else { // si se seleccionó una fila
                //pido confirmación
                respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el trabajador seleccionado?", "Eliminar trabajador", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    model = (DefaultTableModel) tabla.getModel();
                    dni = (String) model.getValueAt(filaSeleccionada, 0); // extraigo el DNI de la tabla
                    // elimino al que tenga ese DNI
                    AccesoBD.sentencia.executeUpdate("DELETE FROM trabajadores WHERE DNI='" + dni + "'");
                    mostrarTrabajadores();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al extraer los datos de la tabla");
        }
    }


    private void iniciarComponentes() {
        ventanaPrincipal = new JFrame();
        ventanaPrincipal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventanaPrincipal.setTitle("Práctica 3 | Stanislav Krastev");
        ventanaPrincipal.setSize(500, 500);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.getContentPane().add(this.panelGeneral);
        ventanaPrincipal.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(ventanaPrincipal, "¿Estas seguro/a de que quieres cerrar sesión?", "Cerrar sesión?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        AccesoBD.conexion.close();
                        System.out.println("Conexión con la base de datos cerrada correctamente.");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "No se pudo cerrar la base de datos");
                    }
                    System.exit(0);
                }
            }
        });
        mostrarTrabajadores();
    }

    void mostrarTrabajadores() {
        String fecha;
        try {
            // extraer datos de la tabla y almacenarlos en resultset
            ResultSet r = AccesoBD.sentencia.executeQuery("Select * FROM trabajadores");
            prepararTabla(tabla);
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
                model.addRow(fila);
            }
            tabla.setModel(model);
            ResultSet res = AccesoBD.sentencia.executeQuery("SELECT * FROM trabajadores");
            hacerCalculos(res);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al extraer los datos de la tabla");
        }
    }

    public JTable getTabla() {
        return tabla;
    }

    public static void main(String[] args) {
        Gui formulario = new Gui();
        AccesoBD.prepararBaseDatos();
        formulario.iniciarComponentes();


    }
}
