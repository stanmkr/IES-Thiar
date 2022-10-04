package Ejercicios.Ejercicio9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * .org.eclipse.egit.core.cmp - Ejercicios.Ejercicio9
 * Date:  / 2022
 */
public class inicioSesion {
    private JPanel panelSuperior;
    private JButton botonIniciarSesion;
    private JButton botonCrearUsuario;
    private JTextField usuario;
    private JLabel labelUsuario;
    private JLabel labelContrasenya;
    private JPanel panelInferior;
    private JPasswordField contrasenya;

    private HashMap<String, String> usuarios = new HashMap<>();

    public inicioSesion() {
        // Inicializar el hashmap de usuarios
        leerUsuarios();

        botonIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String clave = usuarios.get(usuario.getText());
                System.out.println("Intento de inicio. USUARIO: <" + usuario.getText() + "> CONTRASEÑA: <" + String.valueOf(contrasenya.getPassword()) + ">");
                if (clave == null || !clave.equals(String.valueOf(contrasenya.getPassword())))
                    JOptionPane.showMessageDialog(panelSuperior, "El usuario o la contraseña son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(panelSuperior, "Sesión iniciada correctamente", "Iniciado", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        botonCrearUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!usuarios.containsKey(usuario.getText())) { // si el hashmap de usuarios no contiene una clave con valor del contenido de Textfield de usuarios entonces creamos uno en el archivo con su respectiva conrtraseña del valor de JpasswordField
                    try {
                        File fichaUsuarios = new File("src/Ejercicios/Ejercicio9/archivos/users.txt");
                        FileWriter fw = new FileWriter(fichaUsuarios,true);
                        fw.write(usuario.getText() + " " + String.valueOf(contrasenya.getPassword()) + "\n");
                        fw.close();
                        JOptionPane.showMessageDialog(panelSuperior, "Usuario guardado correctamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(panelSuperior, "Error al guardar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    public JPanel getPanelSuperior() {
        return panelSuperior;
    }


    /**
     * Método para leer el archivo users.txt y guardar cada usuario con su contraseña en el hashmap de usuarios (usuario = key , contraseña = value)
     */
    public void leerUsuarios() {
        File fichaUsuarios = new File("src/Ejercicios/Ejercicio9/archivos/users.txt");
        try {
            Scanner us = new Scanner(fichaUsuarios);
            while (us.hasNext()) {
                String[] linea = us.nextLine().split(" ");
                usuarios.put(linea[0], linea[1]);
            }
            us.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        inicioSesion formulario = new inicioSesion();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(formulario.getPanelSuperior());
        ventana.setTitle("Inicio de sesión | Stanislav Krastev");
        ventana.setSize(370, 230);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);

    }
}

