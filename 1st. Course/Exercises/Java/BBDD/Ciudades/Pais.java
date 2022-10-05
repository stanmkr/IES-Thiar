package EjercicioCreacionCRUD.Paso2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Stanislav Krastev
 * Tema14_BBDD - EjercicioCreacionCRUD.Paso2
 * Date: mayo / 2022
 */
public class Pais {
    private String nombre,code;

    //  CONSTRUCTOR
    public Pais(String nombre, String code) {

        this.nombre = nombre;
        this.code = code;
    }

    /**
     *
     * @return el nombre del país
     */
    @Override
    public String toString() {
        return nombre;
    }

    // GETTERS Y SETTERS
    public String getCode() {
        return code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
