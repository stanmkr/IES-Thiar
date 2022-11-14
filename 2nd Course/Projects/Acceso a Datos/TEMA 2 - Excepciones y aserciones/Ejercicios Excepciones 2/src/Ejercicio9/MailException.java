package Ejercicio9;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class MailException extends Exception {
    private String descripcion;

    public MailException(String mensaje) throws Exception {
        super(mensaje);
        this.descripcion="";
    }

    public MailException(String mensaje, String descripcion){
        super(mensaje);
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
