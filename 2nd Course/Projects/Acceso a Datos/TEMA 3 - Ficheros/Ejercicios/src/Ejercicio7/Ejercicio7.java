package Ejercicio7;

import java.io.File;

/**
 * Created by Stanislav Krastev
 * Ejercicios - Ejercicio7
 * Date: Noviembre / 2022
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        File fichero = new File("D:/Home/d1/f21.txt");
        comprobarPermisosRX(fichero);

    }

    public static void comprobarPermisosRX(File fichero) {
        System.out.println("Fichero " + fichero.getAbsolutePath());
        System.out.println("Permisos de lectura " + fichero.canRead());
        System.out.println("Permisos de ejecución " + fichero.canExecute());
        System.out.println("\nProcediendo a denegar los permisos del archivo ......");
        if (fichero.setReadable(false,false)) {
            System.out.println("El fichero " + fichero.getAbsolutePath() + " ya no tiene permisos de lectura");
        } else {
            System.out.println("No ha sido posible denegar el permiso de lectura del archivo " + fichero.getAbsolutePath());
        }
        if (fichero.setExecutable(false,false)) {
            System.out.println("El fichero " + fichero.getAbsolutePath() + " ya no tiene permisos de ejecución");
        } else {
            System.out.println("No ha sido posible denegar el permiso de ejecución del archivo " + fichero.getAbsolutePath());
        }
        System.out.println("\nMostrando los permisos del archivo " + fichero.getAbsolutePath());
        System.out.println("Permisos de lectura " + fichero.canRead());
        System.out.println("Permisos de ejecución " + fichero.canExecute());
    }
}
