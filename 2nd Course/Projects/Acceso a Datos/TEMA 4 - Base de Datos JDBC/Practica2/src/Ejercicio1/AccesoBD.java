package Ejercicio1;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.sql.*;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica2
 * FECHA: Enero / 2023
 */
public class AccesoBD {

    static Connection conexion;
    static Statement sentencia;
    static Gui ventanaPrincipal;

    static void prepararBaseDatos() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/manempsa", "root", "");
            sentencia = conexion.createStatement();
            System.out.println("Conexión con la base de datos realizada con éxito.");
        } catch (SQLException e) {
            System.err.println("No se pudo conectar con la base de datos.");
        }
    }

    static void iniciarComponentes() {

        ventanaPrincipal = new Gui();
        Gui.ventanaPrincipal = new JFrame();
        Gui.ventanaPrincipal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Gui.ventanaPrincipal.setTitle("Ejercicio 1 | Stanislav Krastev");
        Gui.ventanaPrincipal.setSize(550, 600);
        Gui.ventanaPrincipal.setVisible(true);
        Gui.ventanaPrincipal.setLocationRelativeTo(null);
        Gui.ventanaPrincipal.getContentPane().add(ventanaPrincipal.getPanelGeneral());
        Gui.ventanaPrincipal.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(Gui.ventanaPrincipal,
                        "¿Estas seguro/a de que quieres cerrar sesión?", "Cerrar sesión?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        conexion.close();
                        System.out.println("Conexión con la base de datos cerrada correctamente.");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "No se pudo cerrar la base de datos");
                    }
                    System.exit(0);
                }
            }
        });
    }


    public static void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTodos();
    }

    public static void mostrarTodos() {
        String info = "";
        String cadDNI,cadNombre, cadApell, cadSueldo, cadFecha,cadMat;
        try {
            ResultSet r = sentencia.executeQuery("select * from trabajadores order by sueldo");
            while (r.next()) {
                cadDNI=r.getString("DNI");
                cadNombre = r.getString("nombre");
                cadApell = r.getString("apellidos");
                cadSueldo = r.getString("sueldo");
                cadSueldo = cadSueldo.replace(".", ",");
                cadFecha = r.getString("fecha");
                cadFecha = cadFecha.substring(8, 10) + "/" + cadFecha.substring(5, 7) + "/" + cadFecha.substring(0, 4);
                cadMat = r.getString("matricula");
                info = info + cadDNI + " -- "+cadNombre + " " + cadApell + " -- " + cadSueldo + " -- " + cadFecha + " -- " + cadMat + "\n";
            }

            ventanaPrincipal.getPanelTexto().setText("");
            ventanaPrincipal.getPanelTexto().setText(info);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }

    public static void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {
        String consulta = "";
        try {
            consulta = "insert into trabajadores values (";
            consulta += "'" + ventanaPrincipal.getTxtDNI().getText() + "',";
            consulta += "'" + ventanaPrincipal.getTxtNombre().getText() + "',";
            consulta += "'" + ventanaPrincipal.getTxtApellidos().getText() + "',";
            consulta += ventanaPrincipal.getTxtSueldo().getText() + ",";
            consulta += "'" + ventanaPrincipal.getTxtAnio().getText() + "-" + ventanaPrincipal.getTxtMes().getText() + "-" + ventanaPrincipal.getTxtDia().getText() + "',";
            consulta += "'" + ventanaPrincipal.getTxtMatricula().getText() + "')";
            System.out.println(consulta);
            sentencia.executeUpdate(consulta);
            JOptionPane.showMessageDialog(null, "Trabajador introducido correctamente.");
            mostrarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al introducir el nuevo trabajador");
        }
    }

    public static void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        String consulta = "";
        String dni="";
        int respuesta; // respuesta a pregunta de confirmación
        try {

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al introducir el nuevo trabajador");
        }
    }


}