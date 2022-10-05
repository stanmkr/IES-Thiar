package EjercicioCreacionCRUD.Paso2;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema14_BBDD - EjercicioCreacionCRUD.Paso2
 * Date: Mayo / 2022
 */
public class Ciudad {
    private String nombre, distrito, id, poblacion, code;

    //  CONSTRUCTOR
    public Ciudad(String id, String nombre, String distrito, String poblacion, String code) {
        this.id = id;
        this.nombre = nombre;
        this.distrito = distrito;
        this.poblacion = poblacion;
        this.code = code;
    }

    //  GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
