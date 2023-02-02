package MostrarClientes;

import AgregarCliente.Cliente;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: PracticaObjetos
 * FECHA:  / 2022
 */
public class FacturacionListar {
    private JPanel panelGeneral;
    private JPanel panelBoton;
    private JButton botonAbrirArchivo;
    private JPanel panelTabla;
    JTable tabla;
    private JButton botonSalir;
    private JButton botonDeudores;
    private JTable tablaDeudores;
    private JLabel tituloDeudores;
    private File archivo;
    private DefaultTableModel m;
    private ArrayList<Cliente> listaDeudores;
    private String[] titulos = {"DNI", "Nombre", "Dirección", "Saldo", "Estado Cuenta"};
    DefaultTableModel model;


    // CONSTRUCTOR
    public FacturacionListar() {
        panelTabla.setVisible(false);
        tituloDeudores.setVisible(false);
        tablaDeudores.setVisible(false);

        // LISTENER BOTON DE ABRIR ARCHIVO
        botonAbrirArchivo.addActionListener(e -> {
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setFileFilter(filtro);
            jFileChooser.setCurrentDirectory(new File("."));
            jFileChooser.setApproveButtonText("Abrir");
            int seleccion = jFileChooser.showOpenDialog(getPanelGeneral());
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                try {
                    archivo = jFileChooser.getSelectedFile();
                    panelBoton.setVisible(false);
                    panelTabla.setVisible(true);
                    prepararTabla(tabla);
                    llenarTabla(archivo.getAbsolutePath());
                } catch (IOException | ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        // LISTENER BOTÓN DE SALIR
        botonSalir.addActionListener(e -> {
            System.out.println("Programa finalizado.");
            System.exit(0);
        });

        // ACTION LISTENER BOTON DE MOSTRAR LOS CLIENTES DEUDORES
        botonDeudores.addActionListener(e -> {
            try {
                tablaDeudores.setVisible(true);
                tituloDeudores.setVisible(true);
                prepararTabla(tablaDeudores);
                llenarTablaDeudores(archivo.getAbsolutePath());
                botonDeudores.setEnabled(false);
            } catch (IOException | ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        });
    }

    public JPanel getPanelGeneral() {
        return panelGeneral;
    }


    /**
     * MÉTODO QUE PREPARA LA TABLA
     */
    void prepararTabla(JTable tb) {
        model = new DefaultTableModel(null, titulos);
        tb.setModel(model);
    }

    /**
     * MÉTODO QUE LLENA LA TABLA
     */
    public void llenarTabla(String nombrefich) throws IOException, ClassNotFoundException {
        ArrayList<Cliente> lista = mostrar(nombrefich);
        Cliente cliente;
        Object[] fila = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            cliente = lista.get(i);
            fila[0] = cliente.getDNI();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getDireccion();
            fila[3] = cliente.getSaldo();
            fila[4] = cliente.getEstado_cuenta();
            m = (DefaultTableModel) tabla.getModel(); //recoge el modelo de la tabla
            m.addRow(fila);
        }
    }


    public void llenarTablaDeudores(String nombrefich) throws IOException, ClassNotFoundException {
        ArrayList<Cliente> listaDeudores = mostrar(nombrefich);
        Object[] fila = new Object[5];
        for (Cliente cliente : listaDeudores) {
            if (cliente.getEstado_cuenta().equals("deudor")) {
                fila[0] = cliente.getDNI();
                fila[1] = cliente.getNombre();
                fila[2] = cliente.getDireccion();
                fila[3] = cliente.getSaldo();
                fila[4] = cliente.getEstado_cuenta();
                m = (DefaultTableModel) tablaDeudores.getModel(); //recoge el modelo de la tabla
                m.addRow(fila);
            }
        }
    }

    public static ArrayList<Cliente> mostrar(String nombreFichero) throws IOException, ClassNotFoundException {
        FileInputStream fichero = new FileInputStream(nombreFichero);
        ObjectInputStream objectInputStream = new ObjectInputStream(fichero);
        ArrayList listaClintes = (ArrayList) objectInputStream.readObject();
        return listaClintes;
    }

    /**
     * MÉTODO QUE EJECUTA EL PROGRAMA
     */
    public static void run() {
        FacturacionListar formulario = new FacturacionListar();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Mostrar Clientes | Stanislav Krastev");
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.getContentPane().add(formulario.getPanelGeneral());
    }


    public static void main(String[] args) {
        run();
    }
}
