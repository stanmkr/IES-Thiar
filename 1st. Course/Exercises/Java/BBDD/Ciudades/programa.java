package EjercicioCreacionCRUD.Paso2;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Stanislav Krastev
 * Tema14_BBDD - EjercicioCreacionCRUD.Paso2
 * Date: mayo / 2022
 */
public class programa {
    private JPanel panelGeneral;
    private JPanel panelNorte;
    private JComboBox paisesDesplegable;
    private JPanel panelTabla;
    private JTable tablaCiudades;
    private JTextField campoID;
    private JTextField campoNombre;
    private JTextField campoDistrito;
    private JTextField campoPoblacion;
    private JPanel panelBotones;
    private JButton botonActualizar;
    private JButton botonBorrar;
    private JButton botonInsertar;
    private JPanel panelCampos;
    private int id;
    private int poblacionAnterior;
    private String nombreAnterior, distritoAnterior;


    // headers de la tabla
    private String[] headers = {"ID", "Nombre", "Distrito", "Población"};
    DefaultTableModel modelo = new DefaultTableModel(null, headers) {
        // Evitar que se puedan modificar las columnas de la tabla
        @Override
        public boolean isCellEditable(int row, int column) {
            //todas las celdas false
            return false;
        }
    };


    public programa() throws SQLException {


        // Cargamos driver y conectamos con la Base de datos
        DBManager.loadDriver();
        DBManager.connect();

        //  ArrayList con los nombres de países de la tabla country
        ArrayList<Pais> paises = new DBManager().getListaPaises();

        //  recorro el ArrayList y añado en el desplegable cada país de la lista
        for (int i = 0; i < paises.size(); i++) {
            paisesDesplegable.addItem(paises.get(i));
        }
        paisesDesplegable.setSelectedIndex(-1); // para que al iniciar el programa no haya ningún pais preseleccionado
        if (paisesDesplegable.getSelectedIndex() == -1) { // si no hay pais seleccionado no muestro los JPanel
            panelBotones.setVisible(false);
            panelCampos.setVisible(false);
        }


        ////////////////////////////////////
        /////// BOTONES
        ////////////////////////////////////

        //  botón para actualizar una ciudad
        botonActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablaCiudades.getSelectedRow() != -1) { // si hay ciudad seleccionada...
                    try {
                        if (!nombreAnterior.equalsIgnoreCase(campoNombre.getText()) || !distritoAnterior.equalsIgnoreCase(campoDistrito.getText()) || poblacionAnterior != Integer.parseInt(campoPoblacion.getText())) { // en caso de que los valores de los campos son distintos a los valores de la fila.
                            int filas = DBManager.actualizarCiudad(id, campoNombre.getText(), campoDistrito.getText(), Integer.parseInt(campoPoblacion.getText())); // llamo al método actualizarCiudad del DBManager, guardo el resultado (el número de filas afectadas (ciudades actualizadas)) en una variable
                            crearTabla(); // actualizo la tabla para que se muestre la ciudad con sus nuevos valores
                            JOptionPane.showMessageDialog(null, filas + " fila/s afectadas", "Pais actualizado", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor, modifica algún campo.", "Error", JOptionPane.INFORMATION_MESSAGE);

                        }

                    } catch (NumberFormatException e2) {
                        JOptionPane.showMessageDialog(null, "Debes de introducir números enteros para el campo Población.", "Error", JOptionPane.INFORMATION_MESSAGE);
                        campoPoblacion.setText(String.valueOf(poblacionAnterior));

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes de seleccionar una ciudad.", "Error", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        });

        //  botón para borrar una ciudad
        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablaCiudades.getSelectedRow() != -1) { // si hay ciudad seleccionada...
                    int opcion = JOptionPane.showConfirmDialog(null, "Estas a punto de borrar la ciudad " + campoNombre.getText() + "\n¿Estas seguro?", "Borrar ciudad", JOptionPane.YES_NO_OPTION); // confirmación
                    if (opcion == JOptionPane.YES_NO_OPTION) {
                        DBManager.borrarCiudad(id); // llamo al método de borrar ciudad pasándole el ID de la ciudad
                        modelo.removeRow(tablaCiudades.getSelectedRow()); // una vez borrada la ciudad, elimino esa fila de la tabla
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes de seleccionar una ciudad.", "Error", JOptionPane.INFORMATION_MESSAGE); // Aviso: en caso de no tener seleccionada ninguna fila
                    tablaCiudades.updateUI();
                }
            }
        });

        // botón insertar ciudad
        botonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pais p = (Pais) paisesDesplegable.getSelectedItem(); // creo un objeto pais, a partir del elemento seleccionado del desplegable
                try {
                    if (!nombreAnterior.equalsIgnoreCase(campoNombre.getText()) || !distritoAnterior.equalsIgnoreCase(campoDistrito.getText())) { // en caso de que los valores de los campos son distintos a los valores de la fila, ejecuto..
                        DBManager.insertarCiudad(campoNombre.getText(), campoDistrito.getText(), Integer.parseInt(campoPoblacion.getText()), p.getCode()); // llamo al método insertarCiudad de DBManager, le paso sus correspondientes parámetros y obtengo el ID del objeto pais que he creado desde el elemento seleccionado del desplegable
                        crearTabla(); // actualizo la tabla para que se muestre la nueva ciudad con sus campos
                        JOptionPane.showMessageDialog(null, "La ciudad " + campoNombre.getText() + " ha sido insertada", "Nueva ciudad", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, modifica el nombre o distrito.", "Error", JOptionPane.INFORMATION_MESSAGE); // en caso de que el usuario intente insertar una ciudad que ya existe (mismo nombre y mismo distrito)

                    }
                } catch (NumberFormatException e2) {
                    JOptionPane.showMessageDialog(null, "Debes de introducir números enteros para el campo Población.", "Error", JOptionPane.INFORMATION_MESSAGE); // en caso de que el usuario introduzca una cadena de texto en el campo de población
                    campoPoblacion.setText(String.valueOf(poblacionAnterior)); // vuelvo a mostrar el valor que tenía el campo población antes de que el usuario lo modificara

                }

            }
        });


        ////////////////////////////////////
        /////// DESPLEGABLE
        ////////////////////////////////////
        paisesDesplegable.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) { // si hay elemento seleccionado del desplegable...
                    crearTabla(); // llamo al método de crear la tabla
                }
            }
        });


        ////////////////////////////////////
        /////// TABLA
        ////////////////////////////////////
        tablaCiudades.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tablaCiudades.getSelectedRow() > -1) { // si hay fila seleccionada de la tabla...
                    panelBotones.setVisible(true); //   muestro el JPanel de los botones
                    panelCampos.setVisible(true);  //   muestro el JPanel de los campos
                    campoID.setText(tablaCiudades.getValueAt(tablaCiudades.getSelectedRow(), 0).toString()); // en el campo del ID introduzco el valor de la primera columna
                    campoNombre.setText(tablaCiudades.getValueAt(tablaCiudades.getSelectedRow(), 1).toString()); // en el campo del nombre introduzco el valor de la segunda columna
                    campoDistrito.setText(tablaCiudades.getValueAt(tablaCiudades.getSelectedRow(), 2).toString()); // en el campo del distrito introduzco el valor de la tercera columna
                    campoPoblacion.setText(tablaCiudades.getValueAt(tablaCiudades.getSelectedRow(), 3).toString()); // en el campo de la población introduzco el valor de la cuarta columna
                    poblacionAnterior = Integer.parseInt(campoPoblacion.getText()); // guardo el valor de la población en una variable para utilizarla más tarde en los botones para asegurarme que se ha modificado ese campo
                    nombreAnterior = campoNombre.getText(); // lo mismo que población
                    distritoAnterior = campoDistrito.getText(); // lo mismo que población


                }
                id = Integer.parseInt(campoID.getText()); // el ID lo guardo en una variable <id>, lo obtengo del campo ID. Es una variable que no varía.
            }
        });

    }


    /**
     * método para crear la tabla
     */
    public void crearTabla() {

        // Arraylist con objetos Ciudad
        ArrayList<Ciudad> ciudades;
        try {
            ciudades = new DBManager().getListaCiudades((Pais) paisesDesplegable.getSelectedItem()); // llamo al método getListaCiudades de DBManager, creco ciudades según el país seleccionado
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        tablaCiudades.setModel(this.modelo);
        modelo.setRowCount(0);



        Ciudad[][] datosFila = new Ciudad[ciudades.size()][4]; // Matriz de Ciudad que tendrá ciudades.size (filas) y 4 columnas
        //  recorro la matriz
        for (int i = 0; i < datosFila.length; i++) {
            Vector<String> fila = new Vector<>();   // vector para rellenar cada fila de la tabla
            for (int j = 0; j < datosFila[0].length; j++) {
                if (j == 0) {
                    fila.add(ciudades.get(i).getId()); // en la primera columna de cada fila siempre insertaré de la ciudad su ID

                } else if (j == 1) {
                    fila.add(ciudades.get(i).getNombre()); // en la segunda columna de cada fila siempre insertaré de la ciudad su nombre
                } else if (j == 2) {
                    fila.add(ciudades.get(i).getDistrito()); // en la tercera columna de cada fila siempre insertaré de la ciudad su distrito

                } else if (j == 3) {
                    fila.add(ciudades.get(i).getPoblacion()); // en la cuarta columna de cada fila siempre insertaré de la ciudad su población
                }
            }
            modelo.addRow(fila); // terminada la fila, inserto en el modelo el vector de esa fila, y empiezo la iteración del bucle for con la siguiente fila

        }


    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public static void main(String[] args) {
        // para cambiar los textos de los botones del JOptionPane
        UIManager.put("OptionPane.cancelButtonText", "Anular");
        UIManager.put("OptionPane.noButtonText", "No");
        UIManager.put("OptionPane.okButtonText", "OK");
        UIManager.put("OptionPane.yesButtonText", "Si");
        programa formulario;
        try {
            formulario = new programa();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        JFrame ventana = new JFrame();
        //  para pedir confirmación al salir del programa
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                int resp = JOptionPane.showConfirmDialog(ventana, "¿Quieres salir del programa?",
                        "¿Salir?", JOptionPane.YES_NO_OPTION);

                if (resp == JOptionPane.YES_OPTION) {
                    DBManager.close();
                    System.out.println("Programa terminado.");
                    ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                } else {
                    ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Países | Stanislav Krastev");
        ventana.setSize(1000, 500);
        ventana.setResizable(false);
        ventana.setContentPane(formulario.getPanelGeneral());
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }


}
