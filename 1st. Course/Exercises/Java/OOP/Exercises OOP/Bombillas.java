package ejercicios.ejerciciosTema8;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosTema8
 * febrero - 2022
 */
public class Bombillas {
    private boolean interruptor;
    private static boolean interruptorGeneral;

    // CONSTRUCTOR
    public Bombillas() {
        interruptor = false;
    } // por defecto el objeto creado esta con el interruptor en OFF (esta apagado)

    // MÉTODOS

    /**
     * método de objeto, que cambia el estado del interruptor del objeto al que se aplica, comprueba si el interruptor está encendido entonces lo apaga, y si no está encendido pues lo enciende
     */
    public void pulsarInterruptor() {
        if (interruptor == true) {
            interruptor = false;
        } else {
            interruptor = true;
        }
    }

    /**
     * método de clase, que se invoca desde la clase NO desde un objeto, cambia el estado del interruptor general, recibe un parámetro True/False, y asigna ese parámetro al atributo estático de clase <interruptorGeneral>
     *
     * @param nuevoEstado
     */
    public static void interruptorGeneral(boolean nuevoEstado) {
        interruptorGeneral = nuevoEstado;
    }

    /**
     * Dice si la bombilla está encendida, para que esté encendida se tienen que cumplir dos condiciones a la vez,
     * comprueba si el interruptor del objeto bombilla está en ON(true) y si el interruptor general de clase está en ON (true)
     * entonces devuelve que la bombilla está encendida, si no se cumplen estas dos condiciones, devuelve False
     *
     * @return devuelve true si esta encendida o false si esta apagada
     */
    public boolean estaEncedida() {
        if (interruptor == true && interruptorGeneral == true) {
            return true;
        } else {
            return false;
        }
    }


}
