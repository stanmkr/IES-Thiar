package Ejercicio9_EmpresaYEmpleados;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Ejercicio9_EmpresaYEmpleados
 * Date: marzo / 2022
 */
public class Empleado {
    private final String nombre;
    private final String dni;
    private double sueldoBruto;
    private int edad;
    private String telefono;
    private String direccion;

    //  CONSTRUCTOR
    public Empleado(String nombre, String dni, double sueldoBruto) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
    }

    //  CONSTRUCTOR 2
    public Empleado(String nombre, String dni, double sueldoBruto, int edad, String telefono, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //  GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    //  MÉTODOS
    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Sueldo bruto: " + this.sueldoBruto);
        if (this.edad > 0) {
            System.out.println("Edad: " + this.edad);
        }
        if (this.telefono != null) {
            System.out.println("Teléfono: " + this.telefono);
        }
        if (this.direccion != null) {
            System.out.println("Dirección: " + this.direccion);
        }
    }

    public double sueldoNeto() {
        double brutoAnual = this.sueldoBruto * 12;
        double porcentajeIRPF;
        double sueldoNeto;
        if (brutoAnual < 12000) {
            porcentajeIRPF = 20;
        } else if (brutoAnual >= 12000 && brutoAnual <= 25000) {
            porcentajeIRPF = 30;
        } else {
            porcentajeIRPF = 40;
        }
        sueldoNeto = this.sueldoBruto - ((this.sueldoBruto * porcentajeIRPF) / 100);
        return sueldoNeto;

    }


}
