/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas4;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author jose luis rosas
 */
public class A19 {
    
    public static LinkedList<Actividad19> Actividad19()
   {
    LinkedList<Actividad19> listaa19=new LinkedList<Actividad19>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,contenidosutiles,total5 FROM base6;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Actividad19 e = new Actividad19(rs.getString(1),rs.getString(2),rs.getString(3));
          
            listaa19.add(e);
         }
         rs.close();
         pat.close();
      }
    catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaa19;
   }
    
}
