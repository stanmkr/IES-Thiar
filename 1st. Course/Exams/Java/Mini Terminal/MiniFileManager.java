

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - CasoPracticoA
 * Date: abril / 2022
 */
public class MiniFileManager {
    private File f = new File("");
    private String rutaActual;

    //  C O N S T R U C T O R
    public MiniFileManager() {
        rutaActual = f.getAbsolutePath();
        f = new File(rutaActual);
    }

    // M É T O D O S

    /**
     * PWD
     *
     * @return cadena de texto con la ruta de la carpeta actual
     */
    public String getPWD() {
        return rutaActual;
    }


    /**
     * CD
     * Cambia la carpeta actual a ‘directorio’. Con '..' cambia a la carpeta superior.
     *
     * @param directorio el directorio al que se quiere cambiar, lo he modificado para que funcione con carpetas que contengan espacio, la modificación está en la clase main
     */
    public void cd(String directorio) {
        if (directorio.equals("..")) {
            rutaActual = new File(rutaActual).getParent(); // cambio la ruta actual del objeto File, será la ruta Padre, un paso hacia atras.
        } else if (directorio.charAt(0) == '/' || directorio.charAt(1) == ':') { // aquí compruebo si se trata de una ruta absoluta
            if (new File(directorio).isDirectory()) { // si la ruta existe en el sistema cambio la ruta actual por la ruta absoluta introducida por el usuario
                rutaActual = directorio;
            } else {
                System.out.println("La ruta especificada no existe.");
            }
        } else if (new File(f.getAbsolutePath() + "\\" + directorio).isDirectory()) { // aquí entrará en caso de que no sea .. o ruta absoluta, es decir, será ruta relativa
            rutaActual = new File(rutaActual).getAbsolutePath() + "\\" + directorio; // la ruta actual cambia a la ruta absoluta de la actual sumándole (concatenando) lo introducido por el usuario
        } else {
            System.out.println("La ruta no existe."); //    en caso de que no exista la ruta relativa
        }
    }


    /**
     * LS / LL
     * Muestra una lista de las carpetas y los archivos en el directorio actual de ejecución del método, ordenados alfabéticamente.
     * Primero se muestran directorios después archivos.
     * Si se pasa True mostrara la lista detallada, False para lista normal
     */
    public void printList(boolean info) {
        f = new File(rutaActual);   // File con la ruta actual
        File[] lista = f.listFiles(); //    lista de los ficheros y archivos que contiene la ruta
        long milisegundos = f.lastModified();
        Date fecha = new Date(milisegundos);

        for (File f : lista) {  //  bucle para recorrer la lista y ver obtener todos los DIRECTORIOS
            if (f.isDirectory()) {  // compruebo si es carpeta
                Arrays.sort(lista); //  ordeno alfabéticamente
                if (!info) {    //  si es False mostrará únicamente los nombres de las carpetas
                    System.out.println("[*] " + f.getName());
                } else {    //  True para mostrar más detalles
                    System.out.println("[*] " + f.getName() + " | " + f.length() + " bytes" + " | Fecha de última modificación: " + fecha);
                }
            }
        }
        System.out.println();
        for (File f : lista) {  //  bucle para recorrer la lista y ver obtener todos los ARCHIVOS
            if (f.isFile()) {   // compruebo si es archivo
                Arrays.sort(lista); //  ordeno alfabéticamente
                if (!info) {    //  si es False mostrará únicamente los nombres de los archivos
                    System.out.println("[A] " + f.getName());
                } else {    //  True para mostrar más detalles
                    System.out.println("[A] " + f.getName() + " | " + f.length() + " bytes" + " | Fecha de última modificación: " + fecha);
                }
            }
        }
    }

    /**
     * MKDIR
     * crea un directorio que el usuario pasará como parámetro
     *
     * @param directorio el nuevo directorio que se creerá
     */
    public void mkdir(String directorio) {
        File f1 = new File(f.getAbsolutePath() + "\\" + directorio);
        if (f1.mkdir()) {
            System.out.println("El directorio se ha creado correctamente.");
        } else {
            System.out.println("El directorio no debe contener espacios.");
        }
    }

    /**
     * RM
     *
     * @param file el archivo que quiero eliminar
     * @throws NullPointerException
     */
    public void remove(String file) throws NullPointerException {
        File f1 = new File(f.getAbsolutePath() + "/" + file);
        if (f1.isFile()) {  // compruebo si el File es archivo
            System.out.println(f1.delete() ? "Archivo borrado con éxito" : "No ha sido posible borrar el archivo");
        } else if (f1.isDirectory()) {  //  compruebo si el File es carpeta
            File[] listaArchivos = f1.listFiles();  //  guardo en listaArchivos una lista de lo que contiene f1
            for (File archivo : listaArchivos) {   //   recorro el array
                if (archivo.isFile()) { //  si es archivo, lo borro
                    archivo.delete();
                } else {
                    System.out.println(file + " contiene subdirectorio " + archivo.getName());  //  solo queda que sea carpeta, imprimo un aviso al usuario
                }
            }
            // si no contiene sub carpetas se borrara y mostrar un mensaje de éxito. Si tiene sub carpetas las dejará intactas y no borrara la carpeta padre.
            System.out.println(f1.delete() ? "El directorio se ha borrado con éxito" : "No ha sido posible borrar el directorio " + file);
        } else {
            throw new NullPointerException("No se encuentra el archivo/directorio");
        }
    }


    /**
     * MV
     * mueve o renombra origen a destino
     *
     * @param origen  ruta origen
     * @param destino ruta destino
     */
    public void mv(String origen, String destino) {
        File fileOrigen = new File(f.getAbsolutePath() + "\\" + origen);
        File fileDestino = new File(f.getAbsolutePath() + "\\" + destino);
        if (fileDestino.isDirectory()) {    // si es una carpeta la ruta destino, cambiará el FileDestino con una nueva ruta para mover el archivo
            fileDestino = new File(f.getAbsolutePath() + "\\" + destino + "\\" + origen);
            if (fileOrigen.renameTo(fileDestino)) {
                System.out.println(origen + " se ha movido correctamente al directorio " + destino);
            }
        } else if (fileDestino.isFile()) { //   si se intenta mover el origen ya sea carpeta o archivo, a un destino que es un archivo.
            System.out.println("No es posible, el destino es un archivo existente");
        } else if (destino.charAt(0) == '/' || destino.charAt(1) == ':') { // para cuando se le pasa una ruta absoluta como destino (no consigo hacerlo fucnionar)
            fileOrigen.renameTo(new File(destino + "\\" + origen));
            System.out.println(destino + "\\" + origen);

        } else {    //  cuando el destino que se le pasa ni es archivo ni es carpeta, solo queda renombrar el origen
            System.out.println(fileOrigen.renameTo(fileDestino) ? origen + " se ha renombrado correctamente" : "Ha habido un error al renombrar.");
        }
    }


    /**
     * HELP
     * imprime un la ayuda de los comandos
     */
    public void ayuda() {
        System.out.println("""
                \npwd --> Muestra cual es la carpeta actual.
                cd <DIR> --> Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.
                ls -->  Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego archivos, ambos ordenados alfabéticamente).
                ll -->  Como ls pero muestra también el tamaño y la fecha de última modificación.
                mkdir <DIR> --> Crea el directorio ‘DIR’ en la carpeta actual.
                rm <FILE> --> Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.
                mv <FILE1> <FILE2> --> Mueve o renombra ‘FILE1’ a ‘FILE2’.
                help --> Muestra una breve ayuda con los comandos disponibles
                exit --> Termina el programa.
                """);
    }
}
