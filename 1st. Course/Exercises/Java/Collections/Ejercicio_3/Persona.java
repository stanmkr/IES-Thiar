package Ejercicio_3;

import java.time.LocalDate;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Ejercicio_3
 * Date: marzo / 2022
 */
public class Persona {
    private String nombre, tlf, email;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String tlf, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return nombre.equalsIgnoreCase(persona.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Soy " + nombre + ", mi teléfono es " + tlf + " y mi email es " + email + ". Mi fecha de nacimiento es " + fechaNacimiento;
    }
}
