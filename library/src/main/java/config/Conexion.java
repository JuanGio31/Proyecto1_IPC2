package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giovanic
 */
public class Conexion {

    private Connection con;
    private final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private final String USER = "jgioc";
    private final String PASSWORD = "casper";

    public Conexion() {
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
        }
    }

    public String getInfo() {
        if (con!=null) {
            return "Conexion valida";
        } else {
            return "Conexion invalida";
        }        
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
