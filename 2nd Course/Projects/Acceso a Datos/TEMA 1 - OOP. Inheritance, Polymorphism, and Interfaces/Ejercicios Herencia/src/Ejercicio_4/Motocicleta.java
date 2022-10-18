package Ejercicio_4;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class Motocicleta extends Vehiculo { // clase que hereda de Vehiculo

    //  atributo privado estático y final de la clase, no puede ser modificado su valor, siempre 2, y no necesita de objeto para ser utilizado
    private static final byte numeroDeRuedas = 2;

    private byte numeroDePlazas; // atributo privado


    // CONSTRUCTOR con los atributos de la superclase
    public Motocicleta(String colorVehiculo, short cilindrada, short potencia) {
        super(colorVehiculo, numeroDeRuedas, cilindrada, potencia);
    }


    // GETTERS Y SETTERS

    public byte getNumeroDePlazas() {
        return numeroDePlazas;
    }

    public void setNumeroDePlazas(byte numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }

    public byte getNumOcupantesPermitido() {
        return numeroDePlazas;
    }

    public void setNumOcupantesPermitido(byte numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }
}
