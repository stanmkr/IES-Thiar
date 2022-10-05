package EjercicioCreacionCRUD.Paso2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Stanislav Krastev
 * Tema14_BBDD - EjercicioCreacionCRUD.Paso2
 * Date: mayo / 2022
 */
public class DBManager {

    private static DBManager dao = null;
    private static Connection conn = null;

    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "geografia";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";


    //  Configuración tabla country
    private static final String DB_COU = "country";
    private static final String DB_COU_NAME = "name";
    private static final String DB_COU_CODE = "code";

    private static final String DB_COU_SELECT = "SELECT " + DB_COU_NAME + ", " + DB_COU_CODE + " FROM " + DB_COU + " ORDER BY name ASC";


    /**
     * Intenta cargar el JDBC driver.
     *
     * @return true si pudo cargar el driver, false en caso contrario
     */
    public static boolean loadDriver() {
        try {
            System.out.print("Cargando Driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("OK!");
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }


    /**
     * Intenta conectar con la base de datos.
     *
     * @return true si pudo conectarse, false en caso contrario
     */
    public static boolean connect() {
        try {
            System.out.print("Conectando a la base de datos...");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("OK!");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }


    /**
     * Cierra la conexión con la base de datos
     */
    public static void close() {
        try {
            System.out.print("Cerrando la conexión...");
            conn.close();
            System.out.println("OK!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * PreparedStatement que obtiene los nombres de todos los países de la tabla <country> de la base de datos
     *
     * @return una lista de objetos Pais
     * @throws SQLException
     */
    public ArrayList<Pais> getListaPaises() throws SQLException {
        PreparedStatement ps = conn.prepareStatement(DB_COU_SELECT);
        ResultSet rs = ps.executeQuery();
        ArrayList<Pais> paises = new ArrayList<>();

        while (rs.next()) {
            String nombre = rs.getString("name");
            String codigo = rs.getString("code");
            paises.add(new Pais(nombre, codigo));
        }
        rs.close();
        ps.close();
        return paises;
    }


    /**
     * Método qye dado un id, ejecuta una sentencia sql en la base de datos y borrar una ciudad que corresponde con con ese id
     *
     * @param id numero entero que corresponde con el ID (identificador) de una ciudad
     */
    public static void borrarCiudad(int id) {
        try {
            System.out.print("Eliminando ciudad ID: " + id + "... ");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sentencia = "SELECT * FROM city WHERE id=" + id + ";";
            ResultSet rs = st.executeQuery(sentencia);
            rs.first();
            rs.deleteRow();
            rs.close();
            System.out.println("OK!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Método qye dado un nombre, distrito, población y código de país, ejecuta una sentencia sql en la base de datos e inserta una ciudad con esos parámetros en sus correspondientes campos dentro de la tabla
     *
     * @param nombre      el nombre de la ciudad
     * @param distrito    el distrito de la ciudad
     * @param poblacion   la población de la ciudad
     * @param countryCode el código del país de la ciudad
     */
    public static void insertarCiudad(String nombre, String distrito, int poblacion, String countryCode) {
        try {
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sentencia = "INSERT INTO city (name, district, population, countrycode) VALUES ('" + nombre + "','" + distrito + "'," + poblacion + ",'" + countryCode + "');";
            st.executeUpdate(sentencia);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    /**
     * Método qye dado un id, nombre, distrito y población, ejecuta una sentencia sql en la base de datos para actualizar los datos de la ciudad con ese id
     * @param id el id de la ciudad
     * @param nombre el nombre de la ciudad
     * @param distrito el distrito de la ciudad
     * @param poblacion la población de la ciudad
     * @return el número de ciudades (filas) afectadas
     */
    public static int actualizarCiudad(int id, String nombre, String distrito, int poblacion) {
        try {
            System.out.print("Actualizando ciudad ID: " + id + "... ");

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sentencia = "UPDATE city SET name='" + nombre + "'," + "district='" + distrito + "'," + "population=" + poblacion + " WHERE ID=" + id + ";";
            int rs = st.executeUpdate(sentencia);
            System.out.println("OK!");
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * PreparedStatement que obtiene campos (id, name, distcit, population) de todas las ciudades de la tabla <city>
     *
     * @return una lista de objetos Ciudad
     * @throws SQLException
     */
    public ArrayList<Ciudad> getListaCiudades(Pais pais) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT city.ID,city.Name, city.District, city.Population,city.countrycode FROM city, country WHERE city.CountryCode = Country.Code AND Country.Name = ? GROUP BY city.Name");
        ps.setString(1, pais.getNombre());
        ResultSet rs = ps.executeQuery();
        ArrayList<Ciudad> ciudades = new ArrayList<>();

        while (rs.next()) {
            String id = rs.getString("id");
            String nombre = rs.getString("name");
            String distrito = rs.getString("district");
            String poblacion = rs.getString("population");
            String codigo = rs.getString("countrycode");
            ciudades.add(new Ciudad(id, nombre, distrito, poblacion, codigo));
        }
        rs.close();
        ps.close();

        // ordenando la lista de ciudades por nombre
        Collections.sort(ciudades, new Comparator<Ciudad>() {
            @Override
            public int compare(Ciudad o1, Ciudad o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        return ciudades;
    }
}

