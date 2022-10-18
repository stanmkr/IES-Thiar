package Ejercicio_4;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class Camion extends Vehiculo { // clase que hereda de la clase Vehículo
    private byte numeroDeEjes; // atributo privado de la clase


    // CONSTRUCTOR de la clase Camión que contiene los parámetros del constructor de la clase padre y atributos de la clase hijo Camion
    public Camion(String colorVehiculo, byte numRuedas, short cilindrada, short potencia, byte numeroDeEjes) {
        super(colorVehiculo, numRuedas, cilindrada, potencia); // El constructor de la superclase (clase padre) Vehículo
        this.numeroDeEjes = numeroDeEjes;
    }

    // GETTERS Y SETTERS
    public byte getNumEjes() {
        return numeroDeEjes;
    }

    public void setNumEjes(byte numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }
}
