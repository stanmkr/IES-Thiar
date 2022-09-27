package Ejercicio9_EmpresaYEmpleados;

import java.util.ArrayList;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio9_EmpresaYEmpleados
 * Date: Febrero / 2022
 */
public class Empresa {
    private final String nombre;
    private final String CIF;
    private String telefono;
    private String direccion;
    private ArrayList<Empleado> empleados;


    //  CONSTRUCTOR
    public Empresa(String nombre, String CIF, String telefono, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
        empleados = new ArrayList<>();
    }


    //  MÉTODOS
    public void añadirEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void eliminarEmpleado(Empleado e) {
        this.empleados.remove(e);
    }

    public void imprimirEmpleados(){
        System.out.println("*** INFO DE EMPLEADOS ***");
        for (Empleado e :empleados) {
            e.mostrar();
            System.out.println("Sueldo neto: "+e.sueldoNeto());
            System.out.println();
        }
    }


    public double sueldoBrutoEmpleados(){
        double sueldoBrutoEmpl=0;
        for (Empleado e: empleados) {
            sueldoBrutoEmpl +=e.getSueldoBruto();
        }
        return sueldoBrutoEmpl;
    }

    public double sueldoNetoEmpleados(){
        double sueldonetoEmpl=0;
        for (Empleado e: empleados) {
            sueldonetoEmpl +=e.sueldoNeto();
        }
        return sueldonetoEmpl;
    }


    //  GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
