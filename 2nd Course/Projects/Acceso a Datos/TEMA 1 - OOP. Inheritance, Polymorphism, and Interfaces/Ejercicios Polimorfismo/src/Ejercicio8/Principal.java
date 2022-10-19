package Ejercicio8;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: Octubre / 2022
 */
public class Principal {
    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina", 12345678, 28,
                1200);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Jua Mota",
                55333222, 30, 1200, "noche");

        System.out.printf("Nombre: %s | Sueldo: %.2f\n", empleado1.getNombre(), empleado1.getSalario(empleado1.getSalarioBase()));
        System.out.printf("Nombre: %s | Sueldo: %.2f\n", empleado2.getNombre(), empleado2.getSalario(empleado2.getSalarioBase()));

        Asalariado empleadoX;
        empleadoX = empleado1;
        empleado1 = empleado2;
        System.out.println("* * * * * * * * ");
        System.out.printf("Nombre: %s | Sueldo: %.2f\n", empleado1.getNombre(), empleado1.getSalario(empleado1.getSalarioBase()));
        System.out.printf("Nombre: %s | Sueldo: %.2f\n", empleado2.getNombre(), empleado2.getSalario(empleado2.getSalarioBase()));


        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio Gil", 55333666, 35, 1200, " Cáceres");
        empleado1 = empleadoX;
        System.out.println("* * * * * * * * ");
        System.out.printf("Nombre: %s | Sueldo: %.2f\n", empleado1.getNombre(), empleado1.getSalario(empleado1.getSalarioBase()));
        System.out.printf("Nombre: %s | Sueldo: %.2f\n", empleado2.getNombre(), empleado2.getSalario(empleado2.getSalarioBase()));
        System.out.printf("Nombre: %s | Sueldo: %.2f\n", empleado3.getNombre(), empleado3.getSalario(empleado3.getSalarioBase()));
        System.out.printf("Turno del empleado %s es %s\n", empleado2.getNombre(), empleado2.getTurno());
        System.out.printf("Region del empleado %s es %s\n", empleado3.getNombre(), empleado3.getRegion());

        Asalariado[] array_asal = new Asalariado[3];
        array_asal[0]=empleado1;
        array_asal[1]=empleado2;
        array_asal[2]=empleado3;
        System.out.println("* * * * * * * * ");
        for (Asalariado empleado : array_asal) {
            System.out.printf("Empleado %s tiene un sueldo de %.2f\n",empleado.getNombre(),empleado.getSalario(empleado.getSalarioBase()));

        }


    }
}
