package DATOS;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Cconexion {

    public static Connection ObtenerConexion() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "venta", "root", "root");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "no se realizó la conexión");
        }
        return cn;
    }
}
