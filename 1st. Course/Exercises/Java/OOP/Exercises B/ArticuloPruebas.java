package ejercicios.ejerciciosB;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class ArticuloPruebas {
    public static void main(String[] args) {
        Articulo art1 = new Articulo("Pijama",-3,-2,5);
//        art1.nombre = "Pijama";
//        art1.precioSinIVA = 15;
//        art1.stock = 5;
        System.out.printf("%s - Precio: %.2f€ - IVA: %.2f%% - PVP: %.2f", art1.nombre, art1.precioSinIVA, art1.iva, ((art1.precioSinIVA * art1.iva) / 100)+ art1.precioSinIVA);
    }
}
