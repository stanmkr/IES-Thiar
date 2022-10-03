package EjerciciosA;

import java.io.File;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosA
 * Date: abril / 2022
 */
public class ejercicio4 {
    public static void main(String[] args) {
        File f = new File("Documentos/Mis cosas");
        f.mkdir();
        File f2 = new File("Documentos/Alfabeto");
        f2.mkdir();
        File f4  = new File("Documentos/Fotografias");
        f4.renameTo(new File("Documentos/Mis Cosas/Fotografias"));
        File f5 = new File("Documentos/Libros");
        f5.renameTo(new File("Documentos/Mis Cosas/Libros"));

        for (int i = 65; i <=90; i++) {
            char ascii = (char) i;
            System.out.println(ascii);
            File f3 = new File(f2.getAbsoluteFile()+"\\" + ascii);
            f3.mkdir();
        }







    }
}
