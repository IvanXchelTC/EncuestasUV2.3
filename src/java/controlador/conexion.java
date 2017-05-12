/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ivan_XchelHG
 */
public class conexion {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "prueba1";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://"+ HOST +":"+PORT+"/"+DATABASE;
    
     public java.sql.Connection con;
     
       public conexion() {
        try {
                Class.forName(CLASSNAME);
                con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } 
        catch (ClassNotFoundException e) {
               System.out.println("Error");
            } 
        catch (SQLException e) {
               System.out.println("Error");
            }
        }
       public Connection getConexion(){
           return (Connection) con;
       }
}
