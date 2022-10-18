package Ejercicio_4;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class Vehiculo {
    // atributos privados de la clase padre de la que heredarán las demas clases
    private String colorVehiculo;
    private byte numeroDeRuedas;
    private short cilindrada;
    private short potencia;

    // CONSTRUCTOR con todos los atributos de la clase
    public Vehiculo(String colorVehiculo, byte numeroDeRuedas, short cilindrada, short potencia) {
        this.colorVehiculo = colorVehiculo;
        this.numeroDeRuedas = numeroDeRuedas;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }



    // GETTERS Y SETTERS
    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public byte getNumRuedas() {
        return numeroDeRuedas;
    }

    public void setNumRuedas(byte numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public short getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(short cilindrada) {
        this.cilindrada = cilindrada;
    }

    public short getPotencia() {
        return potencia;
    }

    public void setPotencia(short potencia) {
        this.potencia = potencia;
    }
}
