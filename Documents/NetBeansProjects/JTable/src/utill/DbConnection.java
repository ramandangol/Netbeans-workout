/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bladestorm
 */
public class DbConnection {
    public Connection cn=null;
    public DbConnection(){
        try {
         Class.forName("com.mysql.jdbc.Driver");
       cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
         
        } catch (Exception e) {
        }
    }
    
}
