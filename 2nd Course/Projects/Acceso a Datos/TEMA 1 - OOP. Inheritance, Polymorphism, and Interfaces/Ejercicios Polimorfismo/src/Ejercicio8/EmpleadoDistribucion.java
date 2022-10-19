package Ejercicio8;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: Octubre / 2022
 */
public class EmpleadoDistribucion extends Asalariado{
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase, String region) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.region=region;
    }

    @Override
    public double getSalario(double salarioBase){
        return this.salarioBase * 1.10;
    }

    // GETTERS Y SETTERS
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
