/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicio Clases Abstractas
 * FECHA: Octubre / 2022
 */
public class ACamion extends AbstractoVehiculo {

    private byte numeroDeEjes;

    public ACamion(String colorVehiculo, byte numeroDeRuedas, short cilindrada, short potencia, byte numeroDeEjes) {
        super(colorVehiculo, numeroDeRuedas, cilindrada, potencia);
        this.numeroDeEjes = numeroDeEjes;
    }

    @Override
    public double impuesto() {
        return (this.getCilindrada() / 30.0) + (this.getPotencia() * 20.0) + (this.getNumeroDeRuedas() * 20.0) + (this.numeroDeEjes * 50);
    }


}
