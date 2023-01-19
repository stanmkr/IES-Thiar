package ejemplo.programa;

import ejemplo.base.Alumno;
import ejemplo.base.Asignatura;
import ejemplo.base.Profesor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.io.File;
import java.time.LocalDate;
import java.util.HashSet;

public class Programa {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Fernando", "Veldon");
        Profesor profesor2 = new Profesor("Maria", "Jimenez");

        Alumno alumno1 = new Alumno("1234", LocalDate.now());
        Alumno alumno2 = new Alumno("5678", LocalDate.now());

        Asignatura asignatura1 = new Asignatura("Biología", profesor1);
        Asignatura asignatura2 = new Asignatura("Matemáticas", profesor2);
        Asignatura asignatura3 = new Asignatura("Física", profesor2);

        asignatura1.getAlumnos().add(alumno1);
        asignatura1.getAlumnos().add(alumno2);
        asignatura2.getAlumnos().add(alumno2);
        asignatura3.getAlumnos().add(alumno1);

        HashSet<Asignatura> asignaturas = new HashSet<>();
        asignaturas.add(asignatura1);
        asignaturas.add(asignatura2);
        asignaturas.add(asignatura3);

        try {
            JasperReport informe = (JasperReport) JRLoader.loadObject(new File("informes/Blank.jasper"));
            JRBeanCollectionDataSource coleccion = new JRBeanCollectionDataSource(asignaturas);
            JasperPrint print = JasperFillManager.fillReport(informe, null, coleccion);
            JasperViewer visor = new JasperViewer(print);
            visor.setVisible(true);


        } catch (JRException e) {
            throw new RuntimeException(e);
        }


    }
}
