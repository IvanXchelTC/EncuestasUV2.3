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
public class A11 {
    
    public static LinkedList<Actividad11> Actividad11()
   {
    LinkedList<Actividad11> listaa11=new LinkedList<Actividad11>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,espaciosacor,total2 from base4;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Actividad11 e = new Actividad11(rs.getString(1),rs.getString(2),rs.getString(3));
          
            listaa11.add(e);
         }
         rs.close();
         pat.close();
      }
    catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaa11;
   }
    
}
