package Ejercicio12;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        assert (radio >0) :"NO SE PUEDE CREAR UN CIRCULO CON RADIO NEGATIVO";
    }


    public double calculaArea() {
        assert (this.radio > 0):"EL RADIO ES NEGATIVO";
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double calculaPerimetro() {
        assert (this.radio > 0):"EL RADIO ES NEGATIVO";
        return Math.PI * 2 * this.radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
