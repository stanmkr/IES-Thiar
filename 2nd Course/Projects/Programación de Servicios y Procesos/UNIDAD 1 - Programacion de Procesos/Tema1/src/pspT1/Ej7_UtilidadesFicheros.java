package pspT1;

import java.io.*;
import java.util.ArrayList;

public class Ej7_UtilidadesFicheros {
    public static BufferedReader getBufferedReader(String nombreFichero) throws FileNotFoundException {

        FileReader lector;
        lector = new FileReader(nombreFichero);
        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(lector);

        return bufferedReader;
    }

    public static PrintWriter getPrintWriter(String nombreFichero) throws IOException {

        PrintWriter printWriter;
        FileWriter fileWriter;
        fileWriter = new FileWriter(nombreFichero);
        printWriter = new PrintWriter(fileWriter);

        return printWriter;
    }

    public static ArrayList<String> getLineasFichero(String nombreFichero) throws IOException {

        ArrayList<String> lineas = new ArrayList<>();
        File pruebaFichero = new File(nombreFichero);
        System.out.println("Ruta absoluta: "+pruebaFichero.getAbsolutePath());
        BufferedReader bfr = getBufferedReader(nombreFichero);
        //Leemos líneas del fichero...
        String linea = bfr.readLine();
        while (linea != null) {
            //Y las añadimos al array
            lineas.add(linea);
            linea = bfr.readLine();
        }
        //Fin del bucle que lee líneas
        return lineas;
    }

    public static double getSuma(String[] listaNombresFichero) {
        double suma = 0;
        ArrayList<String> lineas;
        String lineaCantidad;
        double cantidad;
        for (String nombreFichero : listaNombresFichero) {
            try {
                //Recuperamos todas las líneas
                lineas = getLineasFichero(nombreFichero);
                //Pero solo nos interesa la primera
                lineaCantidad = lineas.get(0);
                //Convertimos la linea a número
                cantidad = Double.parseDouble(lineaCantidad);
                //Y se incrementa la suma total
                suma = suma + cantidad;
            } catch (IOException e) {
                System.err.println("Fallo al procesar el fichero " + nombreFichero);
                //Fin del catch
            }
            //Fin del for que recorre los nombres de fichero
        }
        return suma;
    }
}
