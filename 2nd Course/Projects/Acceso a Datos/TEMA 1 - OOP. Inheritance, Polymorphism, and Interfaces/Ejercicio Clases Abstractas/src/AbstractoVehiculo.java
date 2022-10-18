/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicio Clases Abstractas
 * FECHA: Octubre / 2022
 */
public abstract class AbstractoVehiculo {
    private String colorVehiculo;
    private byte numeroDeRuedas;
    private short cilindrada;
    private short potencia;

    // CONSTRUCTOR con todos los atributos de la clase
    public AbstractoVehiculo(String colorVehiculo, byte numeroDeRuedas, short cilindrada, short potencia) {
        this.colorVehiculo = colorVehiculo;
        this.numeroDeRuedas = numeroDeRuedas;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }


    // método abstracto
    public abstract double impuesto();

    // GETTERS Y SETTERS

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public byte getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(byte numeroDeRuedas) {
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
