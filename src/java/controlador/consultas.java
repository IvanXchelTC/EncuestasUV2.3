
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ivan_XchelHG
 */
public class consultas extends conexion{
 public boolean Autenticacion(String user,String pass)
    {
        PreparedStatement pat = null;
        try{
        String Consulta = "Select * from Usuarios where Usuario = '" + user+"' AND Pass = '"+pass+"'";
        pat = getConexion().prepareStatement(Consulta);    
        ResultSet rs=null;
        rs=pat.executeQuery(Consulta);
        
        while(rs.next())
        {
            
                return true;      
        }
        rs.close();
        pat.close();
        }catch(Exception e){
            
        }
      
        return false;
    }    
}