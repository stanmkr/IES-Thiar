/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicio Clases Abstractas
 * FECHA: Octubre / 2022
 */
public class AMotocicleta extends AbstractoVehiculo {
    private static final byte numeroDeRuedas = 2;


    public AMotocicleta(String colorVehiculo, short cilindrada, short potencia) {
        super(colorVehiculo, numeroDeRuedas, cilindrada, potencia);
        byte numeroDePlazas = 2;
    }

    @Override
    public double impuesto() {
        return (this.getCilindrada() / 30.0) + (this.getPotencia() * 30.0);
    }
}
