package pspT1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: UNIDAD 1 - Programacion de Procesos
 * FECHA: Octubre / 2022
 */
public class Ej9_Lanzador {
    public static void main(String[] args) throws IOException, InterruptedException {
        long tInicio, tFin, tiempo;
        tInicio = System.currentTimeMillis();
        String ficheroEntrada = args[0]; // el fichero .txt pasado como argumento que vamos a leer
        String[] vocales = {"A", "E", "I", "O", "U", "Á", "É", "Í", "Ó", "Ú", "Ü"};
        // matriz de Procesos para guardar cada proceso ejecutado (1 proceso por letra)
        Process[] matrizProcesos = new Process[vocales.length];
        for (int i = 0; i < vocales.length; i++) {
            String logErrores = "Errores_" + vocales[i] + ".txt";
            String ficheroSalida = vocales[i] + ".txt";
            String vocal = vocales[i];
            ProcessBuilder pb = new ProcessBuilder("java", "-cp", "G:\\Mi unidad\\GitHub\\IES Thiar GitHub\\2nd Course\\Projects\\Programación de Servicios y Procesos\\UNIDAD 1 - Programacion de Procesos\\out\\production\\UNIDAD 1 - Programacion de Procesos", "pspT1.Ej8_ProcesadorFichero", ficheroEntrada, vocal, ficheroSalida);
            // esto es una prueba, no estoy seguro si funciona correctamente, la idea es que cuando no hay errores el programa NO cree los archivos de errores Errores_A.txt Errores_E.txt ....
            if (pb.redirectErrorStream()) {
                pb.redirectError(new File(logErrores));
            }
            Process proceso = pb.start();
            matrizProcesos[i] = proceso;
        }
        // bucle para recorrer los procesos guardados y esperar un tiempo dinámico por cada proceso
        for (Process proceso : matrizProcesos) {
            proceso.waitFor();
        }

        // bucle para recorrer los archivos creados y leer su contenido (total de vocales) y guardarlo en una variable almacen
        int totalTodasVocales = 0;
        for (int i = 0; i < vocales.length; i++) {
            String fichero = vocales[i] + ".txt";
            System.out.println("Creando archivo " + fichero);
            BufferedReader br = Ej7_UtilidadesFicheros.getBufferedReader(fichero);
            totalTodasVocales += Integer.parseInt(br.readLine());
        }

        tFin = System.currentTimeMillis();
        tiempo = tFin - tInicio;
        System.out.println("\nEl tiempo empleado para leer todas las vocales de todos los archivo es: " + tiempo + " milisegunos");
        System.out.println("El recuento total de las vocales guardadas en los archivos creados es: " + totalTodasVocales);
    }
}
