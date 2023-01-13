package Ejercicio1;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.sql.*;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1
 * FECHA: Enero / 2023
 */
public class AccesoBD {
    static Connection conexion;
    static Statement sentencia;


    public AccesoBD() {
        initComponents();
        prepararBaseDatos();


    }


    static void prepararBaseDatos() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/manempsa", "root", "");
            sentencia = conexion.createStatement();
            System.out.println("Conexión con la base de datos realizada con éxito.");
        } catch (SQLException e) {
            System.err.println("No se pudo conectar con la base de datos.");
        }
    }


    public static void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVerDatosActionPerformed
    {
        //GEN-HEADEREND:event_btnVerDatosActionPerformed
        String info = "";
        double totalsu = 0;
        try {
            // TODO add your handling code here:
            try {
                ResultSet r = sentencia.executeQuery("select * from trabajadores order by Nombre");
                while (r.next()) {
                    info = info + r.getString("Nombre") + " " + r.getString("Apellidos") + "\t\t " + r.getString("Sueldo") + "\n";
                    totalsu = totalsu + r.getDouble("Sueldo");
                }
                JOptionPane.showMessageDialog(null, info);
                JOptionPane.showMessageDialog(null, "La suma de los sueldos es: " + totalsu);
            }catch (NullPointerException e){
                System.err.println("No es posible ejecutar la sentencia");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores" + ex);
        }
    }


    static void initComponents() {

        gui formulario = new gui();
        gui.ventana = new JFrame();
        gui.ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        gui.ventana.setTitle("Ejercicio 1 | Stanislav Krastev");
        gui.ventana.setSize(700, 500);
        gui.ventana.setVisible(true);
        gui.ventana.setLocationRelativeTo(null);
        gui.ventana.getContentPane().add(formulario.getPanelGeneral());
        gui.ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(gui.ventana,
                        "¿Estas seguro/a de que quieres cerrar sesión?", "Cerrar sesión?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        conexion.close();
                        System.out.println("Conexión con la base de datos cerrada correctamente.");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,"No se pudo cerrar la base de datos");
                    }
                    System.exit(0);
                }
            }
        });

    }



}



