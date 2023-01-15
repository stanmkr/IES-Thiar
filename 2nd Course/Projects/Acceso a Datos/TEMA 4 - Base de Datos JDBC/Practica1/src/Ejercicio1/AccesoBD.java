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
    static gui formulario;

    public AccesoBD() {
        initComponents();
        prepararBaseDatos();


    }


    static void prepararBaseDatos() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/manempsa", "root", "");
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
            } catch (NullPointerException e) {
                System.err.println("No es posible ejecutar la sentencia");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }

    public static void btnServiciosActionPerfomed(java.awt.event.ActionEvent evt) {
        String info = "";
        String cadFecha, cadDia, cadMes, cadAnio, cadCoste;
        try {
            ResultSet r = sentencia.executeQuery("select * from servicios order by cantidad");
            while (r.next()) {
                cadFecha = r.getString("fecha");
                cadAnio = cadFecha.substring(0, 4);
                cadMes = cadFecha.substring(5, 7);
                cadDia = cadFecha.substring(8, 10);
                cadFecha = cadDia + "/" + cadMes + "/" + cadAnio;

                cadCoste = r.getString("cantidad");
                cadCoste = cadCoste.replace(".", ",");

                info = info + cadFecha + " " + r.getString("tipo") + " " + cadCoste + "\n";
            }
            JOptionPane.showMessageDialog(null, info);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla servicios.");
        }
    }

    public static void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        String nomCli, tfno1, tfno2;
        try {
            ResultSet r = sentencia.executeQuery("select * from clientes order by nombre");
            while (r.next()) {
                nomCli = r.getString("nombre");
                tfno1 = r.getString("tfno1");
                if (tfno1 == null || tfno1.equals("")) {
                    tfno1 = "no tiene";
                }
                tfno2 = r.getString("tfno2");
                if (tfno2 == null || tfno2.equals("")) {
                    tfno2 = "no tiene";
                }
                info = info + nomCli + " --- " + "Fijo: " + tfno1 + "   " + "Móvil: " + tfno2 + "\n";
            }
            JOptionPane.showMessageDialog(null, info);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla clientes");
        }
    }

    public static void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        String cadNombre, cadApell, cadSueldo, cadFecha;
        try {
            ResultSet r = sentencia.executeQuery("select * from trabajadores order by sueldo");
            while (r.next()) {
                cadNombre = r.getString("nombre");
                cadApell = r.getString("apellidos");
                cadSueldo = r.getString("sueldo");
                cadSueldo = cadSueldo.replace(".", ",");
                cadFecha = r.getString("fecha");
                cadFecha = cadFecha.substring(8, 10) + "/" + cadFecha.substring(5, 7) + "/" + cadFecha.substring(0, 4);
                info = info + cadNombre + " " + cadApell + " --- " + cadSueldo + " -- " + cadFecha + "\n";
            }
            formulario.getTxtPanel().setText("");
            formulario.getTxtPanel().setText(info);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }

    public static void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        String cadNombre, cadApell, cadSueldo, cadFecha;
        try {
            String consulta = "select * from trabajadores where sueldo = " + formulario.getTxtSueldo().getText();
            ResultSet r = sentencia.executeQuery(consulta);
            while (r.next()) {
                cadNombre = r.getString("nombre");
                cadApell = r.getString("apellidos");
                cadSueldo = r.getString("sueldo");
                cadSueldo = cadSueldo.replace(".", ",");
                cadFecha = r.getString("fecha");
                cadFecha = cadFecha.substring(8, 10) + "/" + cadFecha.substring(5, 7) + "/" + cadFecha.substring(0, 4);
                info = info + cadNombre + " " + cadApell + " --- " + cadSueldo + " -- " + cadFecha + "\n";
            }
            formulario.getTxtPanel().setText("");
            formulario.getTxtPanel().setText(info);
            if (formulario.getTxtPanel().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No hay trabajadores con ese sueldo.");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }


    public static void btnMayorActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        String cadNombre, cadApell, cadSueldo, cadFecha;
        try {
            String consulta = "select * from trabajadores where sueldo > " + formulario.getTxtSueldo().getText();
            ResultSet r = sentencia.executeQuery(consulta);
            while (r.next()) {
                cadNombre = r.getString("nombre");
                cadApell = r.getString("apellidos");
                cadSueldo = r.getString("sueldo");
                cadSueldo = cadSueldo.replace(".", ",");
                cadFecha = r.getString("fecha");
                cadFecha = cadFecha.substring(8, 10) + "/" + cadFecha.substring(5, 7) + "/" + cadFecha.substring(0, 4);
                info = info + cadNombre + " " + cadApell + " --- " + cadSueldo + " -- " + cadFecha + "\n";
            }
            formulario.getTxtPanel().setText("");
            formulario.getTxtPanel().setText(info);
            if (formulario.getTxtPanel().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No hay trabajadores con sueldos mayores de " + formulario.getTxtSueldo().getText());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }

    public static void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        String cadNombre, cadApell, cadSueldo, cadFecha;
        try {
            String consulta = "select * from trabajadores where sueldo < " + formulario.getTxtSueldo().getText();
            ResultSet r = sentencia.executeQuery(consulta);
            while (r.next()) {
                cadNombre = r.getString("nombre");
                cadApell = r.getString("apellidos");
                cadSueldo = r.getString("sueldo");
                cadSueldo = cadSueldo.replace(".", ",");
                cadFecha = r.getString("fecha");
                cadFecha = cadFecha.substring(8, 10) + "/" + cadFecha.substring(5, 7) + "/" + cadFecha.substring(0, 4);
                info = info + cadNombre + " " + cadApell + " --- " + cadSueldo + " -- " + cadFecha + "\n";
            }
            formulario.getTxtPanel().setText("");
            formulario.getTxtPanel().setText(info);
            if (formulario.getTxtPanel().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No hay trabajadores con sueldos menores de " + formulario.getTxtSueldo().getText());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }

    public static void btnNombreIgualActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        String cadNombre, cadApell, cadSueldo, cadFecha;
        try {
            String consulta = "select * from trabajadores where nombre = '" + formulario.getTxtNombre().getText() + "'";
            ResultSet r = sentencia.executeQuery(consulta);
            while (r.next()) {
                cadNombre = r.getString("nombre");
                cadApell = r.getString("apellidos");
                cadSueldo = r.getString("sueldo");
                cadSueldo = cadSueldo.replace(".", ",");
                cadFecha = r.getString("fecha");
                cadFecha = cadFecha.substring(8, 10) + "/" + cadFecha.substring(5, 7) + "/" + cadFecha.substring(0, 4);
                info = info + cadNombre + " " + cadApell + " --- " + cadSueldo + " -- " + cadFecha + "\n";
            }
            formulario.getTxtPanel().setText("");
            formulario.getTxtPanel().setText(info);
            if (formulario.getTxtPanel().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No hay trabajadores con el nombre de " + formulario.getTxtNombre().getText());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }

    public static void btnContieneActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        String cadNombre, cadApell, cadSueldo, cadFecha;
        try {
            String consulta = "select * from trabajadores where nombre LIKE '%" + formulario.getTxtNombre().getText() + "%'";
            ResultSet r = sentencia.executeQuery(consulta);
            while (r.next()) {
                cadNombre = r.getString("nombre");
                cadApell = r.getString("apellidos");
                cadSueldo = r.getString("sueldo");
                cadSueldo = cadSueldo.replace(".", ",");
                cadFecha = r.getString("fecha");
                cadFecha = cadFecha.substring(8, 10) + "/" + cadFecha.substring(5, 7) + "/" + cadFecha.substring(0, 4);
                info = info + cadNombre + " " + cadApell + " --- " + cadSueldo + " -- " + cadFecha + "\n";
            }
            formulario.getTxtPanel().setText("");
            formulario.getTxtPanel().setText(info);
            if (formulario.getTxtPanel().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No hay trabajadores que contengan en su nombre las letras " + formulario.getTxtNombre().getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }


    public static void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        String cadNombre, cadApell, cadSueldo, cadFecha;
        try {

            ResultSet r = sentencia.executeQuery("select * from trabajadores where fecha < '"+ formulario.getTxtAnio().getText() + "-" + formulario.getTxtMes().getText() + "-" + formulario.getTxtDia().getText()+"'");
            while (r.next()) {
                cadNombre = r.getString("nombre");
                cadApell = r.getString("apellidos");
                cadSueldo = r.getString("sueldo");
                cadSueldo = cadSueldo.replace(".", ",");
                cadFecha = r.getString("fecha");
                cadFecha = cadFecha.substring(8, 10) + "/" + cadFecha.substring(5, 7) + "/" + cadFecha.substring(0, 4);
                info = info + cadNombre + " " + cadApell + " --- " + cadSueldo + " -- " + cadFecha + "\n";
            }
            formulario.getTxtPanel().setText("");
            formulario.getTxtPanel().setText(info);
            if (formulario.getTxtPanel().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No hay trabajadores que hayan entrado anterior a esa fecha ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }


    public static void btnDespuesActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        String cadNombre, cadApell, cadSueldo, cadFecha;
        try {
            ResultSet r = sentencia.executeQuery("select * from trabajadores where fecha > '"+ formulario.getTxtAnio().getText() + "-" + formulario.getTxtMes().getText() + "-" + formulario.getTxtDia().getText()+"'");
            while (r.next()) {
                cadNombre = r.getString("nombre");
                cadApell = r.getString("apellidos");
                cadSueldo = r.getString("sueldo");
                cadSueldo = cadSueldo.replace(".", ",");
                cadFecha = r.getString("fecha");
                cadFecha = cadFecha.substring(8, 10) + "/" + cadFecha.substring(5, 7) + "/" + cadFecha.substring(0, 4);
                info = info + cadNombre + " " + cadApell + " --- " + cadSueldo + " -- " + cadFecha + "\n";
            }
            formulario.getTxtPanel().setText("");
            formulario.getTxtPanel().setText(info);
            if (formulario.getTxtPanel().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No hay trabajadores que hayan entrado posterior a esa fecha  ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la tabla trabajadores");
        }
    }


    static void initComponents() {

        formulario = new gui();
        gui.ventana = new JFrame();
        gui.ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        gui.ventana.setTitle("Ejercicio 1 | Stanislav Krastev");
        gui.ventana.setSize(800, 500);
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
                        JOptionPane.showMessageDialog(null, "No se pudo cerrar la base de datos");
                    }
                    System.exit(0);
                }
            }
        });

    }


}



