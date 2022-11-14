package Ejercicio8;


/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class Piscina {
    private int nivel;
    public final int MAX_NIVEL;

    public Piscina(int max) {
        if (max < 0) max = 0;
        MAX_NIVEL = max;
    }

    public int getNivel() {
        return nivel;
    }

    public void vaciar(int cantidad) throws Exception {
        if (nivel - cantidad <0){
            throw new Exception("El nivel esta por debajo de 0, no es posible vaciar.");
        }else{
            nivel = nivel - cantidad;
        }
    }

    public void llenar(int cantidad) throws Exception {
        if (nivel+cantidad>MAX_NIVEL){
            throw new Exception("El nivel esta por encima del nivel máximo, no es posible llenar tanto.");
        }else {
            nivel = nivel + cantidad;
        }
    }
}

/*
Modifica los métodos vaciar(...) y llenar(...) de manera que lancen una excepción cuando al
vaciar el nivel quede por debajo de cero y cuando al llenar el nivel quede por encima de
MAX_NIVEL.
 */

