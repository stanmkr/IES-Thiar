package ejemplo.base;

import java.time.LocalDate;

public class Alumno {
    private String dni;
    private LocalDate fecha;

    public Alumno(String dni, LocalDate fecha) {
        this.dni = dni;
        this.fecha = fecha;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
