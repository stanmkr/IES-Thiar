package Ejercicio1;

import javax.swing.*;
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
            throw new RuntimeException(e);
        }
    }


    public static void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVerDatosActionPerformed
    {
        //GEN-HEADEREND:event_btnVerDatosActionPerformed
        String info = "";
        double totalsu = 0;
        try {
            // TODO add your handling code here:
            ResultSet r = sentencia.executeQuery("select * from trabajadores order by Nombre");
            while (r.next()) {
                info = info + r.getString("Nombre") + " " + r.getString("Apellidos") + "\t\t " + r.getString("Sueldo") + "\n";
                totalsu = totalsu + r.getDouble("Sueldo");
            }
            JOptionPane.showMessageDialog(null, info);
            JOptionPane.showMessageDialog(null, "La suma de los sueldos es: " + totalsu);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores" + ex);
        }
    }


    static void initComponents() {
        gui formulario = new gui();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Ejercicio 1 | Stanislav Krastev");
        ventana.setSize(700, 500);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.getContentPane().add(formulario.getPanelGeneral());
    }

}



