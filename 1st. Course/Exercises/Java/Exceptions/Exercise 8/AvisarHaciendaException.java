package ejercicio_8;

/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - ejercicio_8
 * Date: marzo / 2022
 */
public class AvisarHaciendaException extends Exception{
    private String mensaje;

    public AvisarHaciendaException(String mensaje){
        this.mensaje=mensaje;
    }

    @Override
    public String toString() {
        return "Excepción ingreso: " + this.mensaje;
    }
}
