package Ejercicio7_Mascotas;

import java.util.ArrayList;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio7_Mascotas
 * Date: Febrero / 2022
 */
public class Inventario {
    ArrayList<Mascota> animales = new ArrayList<>();

    //  MÉTODOS


    private String getTipoMascota (Mascota m){
        if (m instanceof Perro){
            return "Perro";
        }else if (m instanceof Gato){
            return "Gato";
        }else if (m instanceof Loro){
            return "loro";
        }else if (m instanceof Canario){
            return "Canario";
        }else {
            return null;
        }
    }

    public void mostrarLista(){
        System.out.println("--- LISTA DE ANIMALES ---");
        for (int i = 0; i <animales.size() ; i++) {
            Mascota m = animales.get(i);
            System.out.println("Tipo: " + getTipoMascota(m) + "Nombre: " + m.getNombre());
        }
    }


    public boolean eliminarAnimal(int indice){
       if (indice >= 0 && indice <= animales.size()){
           animales.remove(indice);
           return true;
       }else {
           return false;
       }

    }

    public void mostrarAnimal(int indice) {
        if (indice >= 0 && indice <= animales.size()) {
            System.out.println("MASCOTA " + indice);
            Mascota mascota = animales.get(indice);
            mascota.muestra();
        }

    }

    public void mostrarTodosAnimales() {
        for (int i = 0; i < animales.size(); i++) {
            mostrarAnimal(i);
            System.out.println();
        }
    }

    public void insertarAnimal(Mascota mascota) {
        animales.add(mascota);
    }

    public void vaciarInventario() {
        animales.clear();
    }
}
