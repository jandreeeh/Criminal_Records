
package fordalog_in;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {
    static public Connection conn;
    DatabaseConnection()
    {
        String url = "jdbc:mysql://127.0.0.1:3306/dcpd_db";
        String user = "root";
        String pass = "reygian@destroyer";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Database Connected");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
}
