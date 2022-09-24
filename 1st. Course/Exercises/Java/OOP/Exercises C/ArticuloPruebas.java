package ejercicios.ejerciciosC;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class ArticuloPruebas {
    public static void main(String[] args) {
        Articulo art1 = new Articulo("Pijama",15,21,5);
//        art1.nombre = "Pijama";
//        art1.precioSinIVA = 15;
//        art1.stock = 5;
        art1.setNombre("Pantalones");
        System.out.printf("%s - Precio:%.2f€ - IVA:%.2f%% - PVP: %.2f", art1.getNombre(), art1.getPrecioSinIVA(), art1.getIva(), ((art1.getPrecioSinIVA() * art1.getIva()) / 100)+ art1.getPrecioSinIVA());
    }
}
