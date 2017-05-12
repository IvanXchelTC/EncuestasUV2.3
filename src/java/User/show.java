/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Ivan_XchelHG
 */
public class show {
    public static LinkedList<Usuario> Usuario()
   {
       
      LinkedList<Usuario> l=new LinkedList<Usuario>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT * FROM prueba1.usuarios;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Usuario contacto = new Usuario(rs.getString(1),rs.getString(2), rs.getString(3));
          
            l.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return l;
   }
}
