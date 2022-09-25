package ejercicios.ejerciciosTema8;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosTema8
 * febrero - 2022
 */
public class ConsumoElectricoPRUEBAS {
    public static void main(String[] args) {
        Aparatos a1 = new Aparatos("Bombilla", 100);
        Aparatos a2 = new Aparatos("Radiador", 2000);
        Aparatos a3 = new Aparatos("Plancha", 1200);
        System.out.println("El aparato " + a1.getNombre() + " tiene un consumo de " + a1.getConsumoIndividual() + "W");
        System.out.println("El aparato " + a2.getNombre() + " tiene un consumo de " + a2.getConsumoIndividual() + "W");
        System.out.println("El aparato " + a3.getNombre() + " tiene un consumo de " + a3.getConsumoIndividual() + "W");
        System.out.println("El consumo eléctrico es: " + Aparatos.consumoTotalWatios() + "W");
        a2.encender();
        System.out.println("El consumo eléctrico es: " + Aparatos.consumoTotalWatios() + "W");
        a1.encender();
        System.out.println("El consumo eléctrico es: " + Aparatos.consumoTotalWatios() + "W");
        a2.apagar();
        System.out.println("El consumo eléctrico es: " + Aparatos.consumoTotalWatios() + "W");


    }
}
