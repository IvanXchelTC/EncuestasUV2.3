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
public class A4 {
    
    public static LinkedList<Actividad4> Actividad4()
   {
    LinkedList<Actividad4> listaa4=new LinkedList<Actividad4>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,salacomputo,total4 FROM base2;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Actividad4 e = new Actividad4(rs.getString(1),rs.getString(2),rs.getString(3));
          
            listaa4.add(e);
         }
         rs.close();
         pat.close();
      }
    catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaa4;
   }
    
}
