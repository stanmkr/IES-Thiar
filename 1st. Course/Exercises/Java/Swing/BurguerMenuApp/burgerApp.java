package Ejercicios.BurgerMenuApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stanislav Krastev 1º DAM
 * .org.eclipse.egit.core.cmp - Ejercicios.BurgerMenuApp
 * Date:  / 2022
 */
public class burgerApp {
    private JPanel panelGeneral;
    private JLabel tituloMenu;
    private JPanel panelNorte;
    private JPanel panelHamburguesa;
    private JPanel panelPan;
    private JPanel panelPatatas;
    private JPanel panelBebida;
    private JRadioButton opcionCola;
    private JRadioButton opcionNaranja;
    private JRadioButton opcionLimon;
    private JRadioButton opcionAgua;
    private JRadioButton opcionCerveza;
    private JPanel panelSur;
    private JPanel panelOpcionesExtra;
    private JPanel panelSalsas;
    private JRadioButton opcionPollo;
    private JRadioButton opcionCerdo;
    private JRadioButton opcionTernera;
    private JRadioButton opcionVegana;
    private JRadioButton opcionNormal;
    private JRadioButton opcionIntegral;
    private JRadioButton opcionCenteno;
    private JRadioButton opcionFritas;
    private JRadioButton opcionGajo;
    private JRadioButton opcionCaseras;
    private JCheckBox opcionBurguerDoble;
    private JCheckBox opcionExtraQueso;
    private JCheckBox opcionExtraPatatas;
    private JSpinner opcionMostaza;
    private JSpinner opcionThai;
    private JRadioButton opcionReparto;
    private JRadioButton opcionRecogida;
    private JButton botonCalcular;
    private JTextField iva;
    private JPanel panelCalculos;
    private JSpinner opcionKetchup;
    private JSpinner opcionBBQ;
    private JTextField precio;
    private JTextField precioPVP;

    public burgerApp() {
        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double precioBase = 8;
                if (!opcionPollo.isSelected() && !opcionCerdo.isSelected() && !opcionTernera.isSelected() && !opcionVegana.isSelected()){
                    JOptionPane.showMessageDialog(panelGeneral,"Elige la carne por favor.","ATENCIÓN",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!opcionNormal.isSelected() && !opcionIntegral.isSelected() && !opcionCenteno.isSelected()){
                    JOptionPane.showMessageDialog(panelGeneral,"Elige el pan por favor.","ATENCIÓN",JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (!opcionReparto.isSelected() && !opcionRecogida.isSelected() ){
                    JOptionPane.showMessageDialog(panelGeneral,"Elige reparto o recogida.","ATENCIÓN",JOptionPane.WARNING_MESSAGE);
                    return;
                }



                if (opcionTernera.isSelected() || opcionVegana.isSelected()) precioBase += 1;
                if (opcionCaseras.isSelected()) precioBase += 1;
                if (opcionBurguerDoble.isSelected()) precioBase += 2;
                if (opcionExtraQueso.isSelected()) precioBase += 0.5;
                if (opcionExtraPatatas.isSelected()) precioBase += 1;
                if ((int) opcionKetchup.getValue() > 0) precioBase += (int) opcionKetchup.getValue() * 0.50;
                if ((int) opcionBBQ.getValue() > 0) precioBase += (int) opcionBBQ.getValue() * 0.50;
                if ((int) opcionMostaza.getValue() > 0) precioBase += (int) opcionMostaza.getValue() * 0.50;
                if ((int) opcionThai.getValue() > 0) precioBase += (int) opcionThai.getValue() * 0.50;
                if (opcionRecogida.isSelected()) precioBase = precioBase * 0.8;
                precio.setText(String.format("%.2f €",precioBase));
                iva.setText(String.format("%.2f €", precioBase * 21 / 100));
                precioPVP.setText(String.format("%.2f €", precioBase + (precioBase * 21 / 100)));
            }
        });
    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public static void main(String[] args) {
        burgerApp formulario = new burgerApp();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Burger Menu app | Stanislav Krastev");
        ventana.setSize(600, 700);
        ventana.setResizable(false);
        ventana.setContentPane(formulario.getPanelGeneral());
        ventana.setVisible(true);
    }

}
