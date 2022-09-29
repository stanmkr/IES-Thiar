package ejercicio_8;

/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class CuentaException extends Exception{
    private String mensaje;

    public CuentaException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Excepción Cuenta: " + this.mensaje;
    }

}
