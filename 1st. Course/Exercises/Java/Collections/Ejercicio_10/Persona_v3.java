package Ejercicio_10;

import java.time.LocalDate;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Ejercicio_3
 * Date: marzo / 2022
 */
public class Persona_v3 implements Comparable <Persona_v3>{
    private String nombre, tlf, email;
    private LocalDate fechaNacimiento;

    public Persona_v3(String nombre, String tlf, String email, LocalDate fechaNacimiento) {
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
    public String toString() {
        return "Soy " + nombre + ", mi teléfono es " + tlf + " y mi email es " + email + ". Mi fecha de nacimiento es " + fechaNacimiento;
    }

    @Override
    public int compareTo(Persona_v3 p) {
        return this.nombre.compareToIgnoreCase(p.getNombre());
    }
}
