package Ejercicio8;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: Octubre / 2022
 */
public class EmpleadoProduccion extends Asalariado {
    private String turno;

    // CONSTRUCTOR
    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, double salarioBase, String turno) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.turno = turno;
    }

    @Override
    public double getSalario(double salario) {
        return salarioBase * 1.15;
    }

    // GETTERS Y SETTERS
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
