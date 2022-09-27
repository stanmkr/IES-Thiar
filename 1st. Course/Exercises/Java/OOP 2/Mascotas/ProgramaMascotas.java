package Ejercicio7_Mascotas;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio7_Mascotas
 * Date: Febrero / 2022
 */
public class ProgramaMascotas {
    public static void main(String[] args) {

        Mascota perro1 = new Perro("Mocho",5,"vivo","1-1-2000","Desconocida",false);
        Mascota perro2 = new Perro("rony",5,"medio vivo","1-1-2000","Desconocida",true);
        Mascota gato = new Gato("Pepe",2,"nose","11-1-20303","Blanco",true);
        Mascota ave = new Loro("La ave",2,"nose","11-1-20303","Largo",true,"desconocido",true);

        Inventario  animales = new Inventario();
        animales.insertarAnimal(perro1);
        animales.insertarAnimal(perro2);
        animales.insertarAnimal(gato);
        animales.insertarAnimal(ave);




    }
}
