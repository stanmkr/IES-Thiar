package Ejercicio10;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class Piscina {
    private int nivel;
    private final int MAX_NIVEL;

    public Piscina(int max) {
        if (max < 0) max = 0;
        MAX_NIVEL = max;
    }

    public void vaciar(int cantidad) throws PiscinaNivelExcepcion {
        if (nivel - cantidad < 0) {
            throw new PiscinaNivelExcepcion("Vaciado excesivo", nivel - cantidad);
        } else {
            nivel = nivel - cantidad;
        }
    }

    public void llenar(int cantidad) throws PiscinaNivelExcepcion {
        if (nivel + cantidad > MAX_NIVEL) {
            throw new PiscinaNivelExcepcion("Llenado excesivo", nivel + cantidad);
        } else {
            nivel = nivel + cantidad;
        }
    }



    public int getNivel() {
        return nivel;
    }


}
