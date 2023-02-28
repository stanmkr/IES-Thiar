import org.mindrot.jbcrypt.BCrypt;

import javax.crypto.*;
import javax.swing.*;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Encriptacion
 * FECHA:  / 2023
 */
public class Gui {


    private JPanel panelGeneral;
    private JPanel panelSuperior;
    private JRadioButton radioSimetrica;
    private JComboBox<String> comboBox;
    private JRadioButton radioBCrypt;
    private JPanel panelCentral;
    private JTextField textClaveEncriptacion;
    private JPanel panelTextoClaro;
    private JTextArea areaTextoClaro;
    private JPanel panelInferior;
    private JButton botonEncriptar;
    private JButton botonDesencriptar;
    private JPanel panelBCrypt;
    private JPanel panelTextoEncriptado;
    private JTextArea areaTextoEncriptado;
    private JLabel labelHash;
    private String algoritmo;
    private String textoEnClaro;
    private String textoEncriptado;
    private String clave;
    private Encriptadores encriptador;
    private String claveHash;


    public Gui() {
        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(radioBCrypt);
        grupoBotones.add(radioSimetrica);

        comboBox.addItem("AES/ECB");
        comboBox.addItem("AES/CBC");
        comboBox.addItem("DES");
        comboBox.addItem("3DES");

        encriptador = new Encriptadores();

        // BOTON ENCRIPTAR -----------------------------------------------------------------------------
        botonEncriptar.addActionListener(e -> {
            if (radioSimetrica.isSelected()) { // Criptografia simetrica seleccionada
                if (textClaveEncriptacion.getText().equals("") || areaTextoClaro.getText().equals("")) {
                    JOptionPane.showMessageDialog(panelTextoClaro, "Faltan datos", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    textoEnClaro = areaTextoClaro.getText();
                    clave = textClaveEncriptacion.getText();
                    algoritmo = (String) comboBox.getSelectedItem();
                    try {
                        textoEncriptado = encriptador.encriptar(textoEnClaro, clave, algoritmo);
                        textoEnClaro = encriptador.desencriptar(textoEncriptado, clave, algoritmo);
                        areaTextoEncriptado.setText("");
                        areaTextoEncriptado.append(textoEncriptado);
                        areaTextoClaro.setText("");
                    } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException |
                             NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
                        Logger.getLogger(Encriptadores.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else { // Bcrypt seleccionado
                if (areaTextoClaro.getText().equals("")) {
                    JOptionPane.showMessageDialog(getPanelTexto(), "Introduce la clave", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    clave = areaTextoClaro.getText();
                    claveHash = BCrypt.hashpw(clave, BCrypt.gensalt());
                    labelHash.setText("Clave guardada: " + claveHash);
                    areaTextoEncriptado.setText(claveHash);
                    areaTextoClaro.setText("");
                }
            }
        });


        // BOTÓN DESENCRIPTAR -----------------------------------------------------------------------------
        botonDesencriptar.addActionListener(e -> {
            if (radioSimetrica.isSelected()) { // Criptografia simetrica seleccionada
                if (textClaveEncriptacion.getText().equals("")) {
                    JOptionPane.showMessageDialog(getPanelTexto(), "Introduce la clave", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (radioSimetrica.isSelected()) {
                        clave = textClaveEncriptacion.getText();
                        algoritmo = (String) comboBox.getSelectedItem();
                        try {
                            if (!areaTextoEncriptado.getText().equals("")) {
                                textoEncriptado = areaTextoEncriptado.getText();
                                textoEnClaro = encriptador.desencriptar(textoEncriptado, clave, algoritmo);
                                areaTextoClaro.setText(textoEnClaro);
                            } else {
                                JOptionPane.showMessageDialog(getPanelTexto(), "Introduce el hash", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException |
                                 NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
                            JOptionPane.showMessageDialog(getPanelTexto(), "Error entre clave y hashcode", "Error", JOptionPane.ERROR_MESSAGE);
                            throw new RuntimeException(ex);
                        }
                    }
                }
            } else { // BCrypt seleccionado

                if (areaTextoEncriptado.getText().equals("")) {
                    JOptionPane.showMessageDialog(getPanelTexto(), "La clave no está establecida", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (areaTextoClaro.getText().equals("") && !areaTextoEncriptado.getText().equals("")) {
                    JOptionPane.showMessageDialog(getPanelTexto(), "Introduce clave a comprobar", "Error", JOptionPane.ERROR_MESSAGE);


                } else {
                    boolean contrasenyasCoinciden = BCrypt.checkpw(areaTextoClaro.getText(), areaTextoEncriptado.getText());
                    if (contrasenyasCoinciden) {
                        JOptionPane.showMessageDialog(getPanelTexto(), "Clave correcta", "Información", JOptionPane.INFORMATION_MESSAGE);
                        areaTextoEncriptado.setText("");
                    } else {
                        JOptionPane.showMessageDialog(getPanelTexto(), "Clave incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        panelCentral.setVisible(true);
        panelBCrypt.setVisible(false);


        radioSimetrica.addActionListener(e -> {
            if (radioSimetrica.isSelected()) {
                comboBox.setEnabled(true);
                radioSimetrica.setEnabled(false);
                radioBCrypt.setEnabled(true);
                panelCentral.setVisible(true);
                panelBCrypt.setVisible(false);
            }
        });


        radioBCrypt.addActionListener(e -> {
            if (radioBCrypt.isSelected()) {
                comboBox.setEnabled(false);
                radioBCrypt.setEnabled(false);
                radioSimetrica.setEnabled(true);
                panelCentral.setVisible(false);
                labelHash.setText("Clave no guardada");
                panelBCrypt.setVisible(true);
            }
        });
    }

    static void run() {
        Gui formulario = new Gui();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Práctica de encriptación | Stanislav Krastev");
        ventana.setSize(600, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.getContentPane().add(formulario.getPanelGeneral());
    }

    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public JPanel getPanelTexto() {
        return panelTextoClaro;
    }

    public static void main(String[] args) {
        run();
    }
}
