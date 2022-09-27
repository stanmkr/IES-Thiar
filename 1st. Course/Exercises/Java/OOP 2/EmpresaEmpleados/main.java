package Ejercicio9_EmpresaYEmpleados;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Ejercicio9_EmpresaYEmpleados
 * Date: marzo / 2022
 */
public class main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Pepe", "X231231", 1500);
        Empleado e2 = new Empleado("Juan", "aaaaaaaaa", 2000);
        e1.setEdad(12);
        e1.setTelefono("312313");
        e1.mostrar();
        System.out.println("Sueldo neto mensual: " + e1.sueldoNeto());

        System.out.println();
        Empresa empresa1 = new Empresa("ZARA","X2131231","67882849","Calle sol");
        empresa1.añadirEmpleado(e1);
        empresa1.añadirEmpleado(e2);

        empresa1.imprimirEmpleados();
        System.out.println(empresa1.sueldoBrutoEmpleados());
        System.out.println(empresa1.sueldoNetoEmpleados());

    }
}
