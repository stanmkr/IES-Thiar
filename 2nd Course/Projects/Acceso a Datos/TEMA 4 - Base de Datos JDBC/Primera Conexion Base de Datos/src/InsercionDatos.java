import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Primera Conexion Base de Datos
 * FECHA: Enero / 2023
 */
public class InsercionDatos {
    public static void main(String[] args) throws IOException {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Password: ");
        String pwd = bf.readLine();
        System.out.print("Usuario: ");
        String user = bf.readLine();
        System.out.print("Dirección: ");
        String dir = bf.readLine();
        System.out.print("Teléfono: ");
        String tel = bf.readLine();
        try {
            Connection cn;
            Statement st;
            //1 Cargar Driver *************** ESTO ESTA DEPRECATED
            //   Class.forName("com.mysql.jdbc.Driver");

            //2 Crear conexión
            cn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
            // 3 Crear objeto para la consulta
            st = cn.createStatement();
            String tsql;
            //Diseñamos la consulta
            tsql = "Insert into clientes values(\"" + pwd + "\",\"" + user + "\",\"" + dir + "\",\"" + tel + "\")";
            // tsql="insert into clientes values (\"222\",\"lola\",\"Av. Alemania\",\"111111\")";
            //4 Ejecutar la consulta
            ResultSet resultSet = st.executeQuery("Select * from clientes");
            while (resultSet.next()){
                String nombre = resultSet.getString("usuario");
                String contrasenya = resultSet.getString("password");
                String direccion = resultSet.getString("direccion");
                String telefono = resultSet.getString("telefono");
                System.out.println(nombre + " | " + contrasenya + " | " + direccion + " | " + telefono);
            }
            st.execute(tsql);
            //5 Cerrar la conexión
            cn.close();
        } catch (SQLException e) {
            System.out.println("Estado: " + e.getSQLState());
            System.out.println("código de error: " + e.getErrorCode());
        }
    }
}
