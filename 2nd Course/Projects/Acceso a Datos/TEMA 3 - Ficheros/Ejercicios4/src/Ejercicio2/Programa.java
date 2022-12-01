package Ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios4 - Ejercicio2
 * Date: Noviembre / 2022
 * **************************************
 * Se debe guardar un listado de alumnos en un fichero con la siguiente información:
 * • Nº de expediente
 * • Nombre
 * • Nota 1º parcial.
 * • Nota 2º parcial.
 * • Nota 3º parcial.
 * El programa debe realizar:
 * • Crear el archivo pidiendo los datos por consola.
 * • Obtener un listado en el que aparezcan los datos del estudiante más la media
 * de sus tres notas.
 * • Obtener un listado con los estudiantes que superen un 7 de nota media.
 */
public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Antonio Pérez", "FS5671TY", 4, 7.5, 6));
        listaAlumnos.add(new Alumno("Pepe Rodriguez", "XX5551TY", 7, 7.5, 8.5));
        listaAlumnos.add(new Alumno("Francisco Sanchez", "FF4471UU", 3, 2.5, 4));
        listaAlumnos.add(new Alumno("Jose Joselito", "RR5701TY", 4, 5, 5));
        listaAlumnos.add(new Alumno("Sancho Sancho", "ZV8871TY", 6, 6, 6));

        System.out.println("Introduce el archivo que vas a crear: ");
        //String nombreArchivo = scanner.nextLine();
        String nombreArchivo = "src/Ejercicio2/CarpetaAlumnos/datosAlumnos.obj";

        System.out.println("\n*************** LISTA DE ALUMNOS ***************\n");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(nombreArchivo);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Alumno alumno : listaAlumnos) {
                objectOutputStream.writeObject(alumno);
                System.out.println(alumno);
            }
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("\n*************** ALUMNOS QUE SUPERAN UN 7 DE NOTA MEDIA ***************\n");

        try {
            FileInputStream fileInputStream = new FileInputStream(nombreArchivo);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Alumno alumno = (Alumno) objectInputStream.readObject();
            while (alumno != null) {
                if (alumno.getMedia() > 7) {
                    System.out.println(alumno);
                }
                try {
                    alumno = (Alumno) objectInputStream.readObject();
                } catch (EOFException e) {
                    break;
                }
            }
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
