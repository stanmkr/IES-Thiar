import java.sql.*;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica3
 * FECHA: Enero / 2023
 */
public class AccesoBD {
    static Connection conexion;
    static Statement sentencia;
    static Gui ventanaPrincipal;


    static void prepararBaseDatos() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/manempsa", "root", "");
            sentencia = conexion.createStatement();
            System.out.println("Conexión con la base de datos realizada con éxito.");
        } catch (SQLException e) {
            System.err.println("No se pudo conectar con la base de datos.");
        }
    }


}
