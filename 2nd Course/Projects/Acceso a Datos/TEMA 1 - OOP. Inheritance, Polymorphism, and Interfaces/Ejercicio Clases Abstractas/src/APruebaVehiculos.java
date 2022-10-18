import java.awt.*;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicio Clases Abstractas
 * FECHA: Octubre / 2022
 */
public class APruebaVehiculos {
    public static void main(String[] args) {
        AMotocicleta motoBarata1 = new AMotocicleta("Rojo", (short) 125, (short) 25);
        AMotocicleta motoBarata2 = new AMotocicleta("Rojo", (short) 125, (short) 25);
        AMotocicleta motoCara = new AMotocicleta("Amarillo", (short) 1000, (short) 90);
        ACamion camionNormal = new ACamion("Rojo", (byte) 4, (short) 2, (short) 4000, (byte) 300);
        ACamion camionEnorme = new ACamion("Rojo", (byte) 24, (short) 6, (short) 15000, (byte) 800);

        motoBarata1.setColorVehiculo("Verde Kawasaki");
        motoBarata1.setPotencia((short) 39);
        motoCara.setPotencia((short) 900);
        System.out.printf("El impuesto de la moto cara es: %.2f €\n", motoCara.impuesto());
        System.out.println("Cambio la potencia de la moto cara a 1200");
        motoCara.setPotencia((short) 1200);
        System.out.printf("El impuesto de la moto cara es: %.2f €\n", motoCara.impuesto());

        System.out.println("El camión normal tiene " + camionNormal.getNumeroDeRuedas() + " ruedas");
        System.out.printf("El impuesto del camión normal es: %.2f €\n", camionNormal.impuesto());
        System.out.println("Cambio la cantidad de ruedas del camión normal a 8 ruedas");
        camionNormal.setNumeroDeRuedas((byte) 8);
        System.out.printf("El impuesto del camión normal es: %.2f €\n", camionNormal.impuesto());






    }
}
