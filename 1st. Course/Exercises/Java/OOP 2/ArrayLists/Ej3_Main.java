package Ejercicios_ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicios_ArrayLists
 * Date: Febrero / 2022
 */
public class Ej3_Main {
    public static void main(String[] args) {

        //  Crea 5 instancias de la Clase Producto.
        Ej3_Producto product1 = new Ej3_Producto("Chocolate", 5);
        Ej3_Producto product2 = new Ej3_Producto("Magdalena", 2);
        Ej3_Producto product3 = new Ej3_Producto("Plátano", 1);
        Ej3_Producto product4 = new Ej3_Producto("Cheesecake", 6);
        Ej3_Producto product5 = new Ej3_Producto("Agua", 10);

        // Crea un ArrayList.
        ArrayList<Ej3_Producto> listaEj3Productos = new ArrayList<Ej3_Producto>();

        // Añade las 5 instancias de Producto al ArrayList.
        listaEj3Productos.add(product1);
        listaEj3Productos.add(product2);
        listaEj3Productos.add(product3);
        listaEj3Productos.add(product4);
        listaEj3Productos.add(product5);

        // Visualiza el contenido de ArrayList utilizando Iterator.
        Iterator<Ej3_Producto> iterator = listaEj3Productos.iterator();
        while (iterator.hasNext()) {
            Ej3_Producto p = iterator.next();
            System.out.println(p.getNombre() + " cantidad: " + p.getCantidad());
        }

        System.out.println();
        // Elimina dos elementos del ArrayList.
        listaEj3Productos.remove(product2);
        listaEj3Productos.remove(product3);

        // Inserta un nuevo objeto producto en medio de la lista.
        Ej3_Producto ej3Producto6 = new Ej3_Producto("Donut", 3);
        listaEj3Productos.add(listaEj3Productos.size() / 2, ej3Producto6);


       // Visualiza de nuevo el contenido de ArrayList utilizando Iterator.

        iterator = listaEj3Productos.iterator();
        while (iterator.hasNext()){
            Ej3_Producto p = iterator.next();
            System.out.println(p.getNombre()+" cantidad: "+ p.getCantidad());

        }
//        for (int i = 0; i < listaProductos.size(); i++) {
//            Producto p = listaProductos.get(i);
//            System.out.println(p.getNombre() + " cantidad: " + p.getCantidad());
//        }

        // Elimina todos los valores del ArrayList.
        listaEj3Productos.clear();

    }
}
