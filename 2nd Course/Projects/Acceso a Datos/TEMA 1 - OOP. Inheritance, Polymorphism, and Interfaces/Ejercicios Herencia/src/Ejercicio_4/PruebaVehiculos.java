package Ejercicio_4;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class PruebaVehiculos { // clase main
    public static void main(String[] args) {

        // instanciación de 3 objetos Motocicleta
        Motocicleta motoBarata1 = new Motocicleta("Rojo", (short) 125, (short) 25);
        Motocicleta motoBarata2 = new Motocicleta("Rojo", (short) 125, (short) 25);
        Motocicleta motoCara = new Motocicleta("Amarillo", (short) 1000, (short) 90);

        // instanciación de 3 objetos Camion

        Camion camionNormal = new Camion("Rojo", (byte) 4, (short) 2, (short) 4000, (byte) 300);
        Camion camionEnorme = new Camion("Rojo", (byte) 24, (short) 6, (short) 15000, (byte) 800);

        // accediendo a los métodos de las clases
        motoBarata1.setNumeroDePlazas((byte) 1);
        System.out.println(motoBarata1.getNumeroDePlazas());
        System.out.println(motoBarata2.getCilindrada());
        System.out.println(camionEnorme.getNumEjes());
    }
}
