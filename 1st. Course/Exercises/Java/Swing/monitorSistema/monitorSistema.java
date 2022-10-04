package Ejercicios.Ejercicio7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;


/**
 * Created by Stanislav Krastev 1º DAM
 * .org.eclipse.egit.core.cmp - Ejercicios.Ejercicio7
 * Date:  / 2022
 */
public class monitorSistema {
    private JPanel panelPrincipal;
    private JPanel panelElementos;
    private JTextField cargaDelProcesadorTextField;
    private JProgressBar barraCPU;
    private JTextField memoriaRAMEnUsoTextField;
    private JProgressBar barraRAM;
    private JTextField memoriaRAM;
    private JTextField ramTotal;
    private JButton botonActualizar;
    private OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();


    public monitorSistema() {

        botonActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               double memoriaTotal = osBean.getTotalMemorySize()   ;
                double memoriaLibre = osBean.getFreeMemorySize();
                double memoriaOcupada = memoriaTotal - memoriaLibre;
                double porcentaje = memoriaOcupada * 100 / memoriaTotal;
                barraCPU.setValue((int) (osBean.getSystemCpuLoad()*(100)));
                barraCPU.setStringPainted(true);
                barraRAM.setValue((int) porcentaje);
                ramTotal.setText(String.format("%.0f", (memoriaTotal/1024)/1024));
            }

        });
    }

    JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public static void main(String[] args) {
        monitorSistema formulario = new monitorSistema();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Monitor del sistema | Stanislav Krastev");
        ventana.setSize(400, 200);
        ventana.setContentPane(formulario.getPanelPrincipal());
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
