
package Vista;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    



 private static Connection con;
 
 public static Connection getConexion(){
 try {
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcitas","root","");
 } catch (Exception e) {
 System.out.println(e.toString());
 con= null;
 }
 return con;
 }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


 

