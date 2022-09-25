package ejercicios.ejerciciosE;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class ArticuloPruebas {
    public static void main(String[] args) {
        Articulo art1 = new Articulo("Articulo1","ReDucido",21,5);
        Articulo art2 = new Articulo("Articulo2","resducido",21,5);
//        art1.nombre = "Pijama";
//        art1.precioSinIVA = 15;
//        art1.stock = 5;
        art1.setNombre("Pantalones");
        art1.setStock(-2);
        System.out.printf("%s - Precio: %.2f€ - IVA: %.2f%% - PVP: %.2f€%n", art1.getNombre(), art1.getPrecioSinIVA(), art1.getIva(), art1.getPVP());
        art1.imprimir();
        System.out.printf("El artículo con el descuento aplicado(en %%) se queda en: %.2f€%n", art1.getPVPDescuento(14));
        System.out.println( art1.vender(7));
        art1.imprimir();
        System.out.println(art1.almacenar(2));
        art1.imprimir();
        art2.imprimir();

    }
}
