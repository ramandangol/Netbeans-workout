/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utills;

/**
 *
 * @author Bladestorm
 */
import java.sql.*;

public class DbConnection {
    public Connection cn= null;
    
    public DbConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
        } catch (Exception e) {
        }
    }
    
}
