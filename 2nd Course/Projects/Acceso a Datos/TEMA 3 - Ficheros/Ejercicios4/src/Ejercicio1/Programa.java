package Ejercicio1;

import Ejercicio2.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios4
 * FECHA: Noviembre / 2022
 */
public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("Pepe Salazar", "Calle Sol", 500.5, Cuenta.AL_DIA));
        listaClientes.add(new Cliente("Juan Perez", "Calle Luna", 100, Cuenta.ATRASADA));
        listaClientes.add(new Cliente("Pepe Sanchez", "Calle a la calle", 10, Cuenta.DEUDOR));
        listaClientes.add(new Cliente("Pablo Escobar", "Calle Marte", 222.75, Cuenta.AL_DIA));
        listaClientes.add(new Cliente("Manolo el del bombo", "Calle Jupiter", 1230, Cuenta.DEUDOR));

        System.out.println("Introduce el archivo que vas a crear: ");
        //String nombreArchivo = scanner.nextLine();
        String nombreArchivo = "src/Ejercicio1/CarpetaClientes/clientes deudores.obj";


        System.out.println("\n*************** LISTA DE CLIENTES ***************\n");

        try {
          FileOutputStream fileOutputStream = new FileOutputStream(nombreArchivo);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Cliente cliente : listaClientes) {
                objectOutputStream.writeObject(cliente);
                System.out.println(cliente);
            }
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        System.out.println("\n*************** CLIENTES DEUDORES ***************\n");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(nombreArchivo);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Cliente cliente = (Cliente) objectInputStream.readObject();
            while (cliente!=null){
                if (cliente.getEstadoCuenta().equals(Cuenta.DEUDOR)){
                    System.out.println(cliente);
                }
                try {
                    cliente = (Cliente) objectInputStream.readObject();

                }catch (EOFException e){
                    break;
                }
            }
            objectInputStream.close();

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
