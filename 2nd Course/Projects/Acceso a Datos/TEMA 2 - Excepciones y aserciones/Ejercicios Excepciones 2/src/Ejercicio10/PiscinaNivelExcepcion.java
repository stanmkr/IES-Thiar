package Ejercicio10;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class PiscinaNivelExcepcion extends Exception {
    private int nivel;


    public PiscinaNivelExcepcion(String descripcion, int nivel) {
        super(descripcion);
        this.nivel = nivel;
    }




}
