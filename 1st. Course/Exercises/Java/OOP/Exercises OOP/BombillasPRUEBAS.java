package ejercicios.ejerciciosTema8;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosTema8
 * febrero - 2022
 */
public class BombillasPRUEBAS {
    public static void main(String[] args) {

        Bombillas bombillaPhilips = new Bombillas();
        Bombillas bombillaSony = new Bombillas();
        if (bombillaPhilips.estaEncedida()){
            System.out.println("philips esta encendida");
        }else {
            System.out.println("philips esta apagada");
        }

        bombillaPhilips.pulsarInterruptor();
        Bombillas.interruptorGeneral(true);

        if (bombillaPhilips.estaEncedida()){
            System.out.println("philips esta encendida");
        }else {
            System.out.println("philips esta apagada");
        }



    }
}
