package ContandorVocales;

import java.io.File;
import java.io.IOException;

/**
 * Created by Stanislav Krastev
 * Ej5_LanzadorSumador.java
 * Date: Septiembre / 2022
 */
public class Lanzador {
    public static void main(String[] args) throws IOException, InterruptedException {
        long tInicio, tFin, tiempo;
        tInicio = System.currentTimeMillis();

        String ficheroEntrada = args[0];
        String[] vocales = {"A", "E", "I", "O", "U"};
        // String clase = "ContadorVocales.ProcesadorFichero";

        for (int i = 0; i < vocales.length; i++) {
            String logErrores = "Errores_" + vocales[i] + ".txt";
            //String ficheroSalida = vocales[i] + ".txt";
            // ProcesadorFichero.hacerRecuento(ficheroEntrada, vocales[i] + ".txt", vocales[i]);
            //  ProcessBuilder pb = new ProcessBuilder("java", "-cp", "G:\\Mi unidad\\GitHub\\IES Thiar GitHub\\2nd Course\\Proyects\\Programación de Servicios y Procesos\\UNIDAD 1 - Programacion de Procesos\\out\\production\\UNIDAD 1 - Programacion de Procesos");
            ProcessBuilder pb = new ProcessBuilder("java", "ContadorVocales.ProcesadorFichero", ficheroEntrada, vocales[i] + ".txt", vocales[i]);
            pb.directory(new File("G:\\Mi unidad\\GitHub\\IES Thiar GitHub\\2nd Course\\Projects\\Programación de Servicios y Procesos\\UNIDAD 1 - Programacion de Procesos\\out\\production\\UNIDAD 1 - Programacion de Procesos"));
            pb.redirectError(new File(logErrores));
            pb.start();
        }
        Thread.sleep(3000);
        tFin = System.currentTimeMillis();
        tiempo = tFin - tInicio;
        System.out.println("El tiempo empleado es: " + tiempo);
    }
}
