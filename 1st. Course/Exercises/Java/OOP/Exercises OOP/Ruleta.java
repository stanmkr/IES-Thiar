package ejercicios.ejerciciosTema8;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev 1º DAM
 * Programación - ejercicios.ejerciciosTema8
 * Date: FEBRERO / 2022
 */
public class Ruleta {

    int dineroTotalApostado;
    int tiradas;
    boolean apuesta; // true para PAR, false para IMPAR
    int dineroApostado = 1;


    // CONSTRUCTOR
    public Ruleta(int dineroTotalApostado, int tiradas, boolean apuesta) {
        this.dineroTotalApostado = dineroTotalApostado;
        this.tiradas = tiradas;
        this.apuesta = apuesta;
    }

    //SETTER & GETTERS


    public int tiradas() {
        return tiradas;
    }

    public Ruleta setTiradas(int tiradas) {
        this.tiradas = tiradas;
        return this;
    }

    public boolean apuesta() {
        return apuesta;
    }

    public Ruleta setApuesta(boolean apuesta) {
        this.apuesta = apuesta;
        return this;
    }

    public int getDineroTotalApostado() {
        return dineroTotalApostado;
    }


    public void setDineroTotalApostado(int dineroTotalApostado) {
        this.dineroTotalApostado = dineroTotalApostado;
    }


    public int getDineroApostado() {
        return dineroApostado;
    }

    /**
     * metodo para establecer cuanto dinero voy a estar apostado
     * @param dineroApostado
     */
    public void setDineroApostado(int dineroApostado) {
        this.dineroApostado = dineroApostado;
    }

    // METODO

    /**
     * voy a girar y voy a evaluar condiciones, segun la condición restaré o sumaré al total apostado la cantidad que se ha apoistado en esa vuelta
     */
    public void girar() {
        int aleatorio = ThreadLocalRandom.current().nextInt(0, 36 + 1);
        if (aleatorio == 0) {
            dineroTotalApostado -= getDineroApostado();
        } else if (aleatorio % 2 == 0 && apuesta) {
            dineroTotalApostado += getDineroApostado();
        } else if (aleatorio % 2 != 0 && !apuesta) {
            dineroTotalApostado += getDineroApostado();
        } else {
            dineroTotalApostado -= getDineroApostado();
        }
    }
}
