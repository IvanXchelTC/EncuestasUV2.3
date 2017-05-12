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
public class A18 {
    
    public static LinkedList<Actividad18> Actividad18()
   {
    LinkedList<Actividad18> listaa18=new LinkedList<Actividad18>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,metodosevaluacion,total4 FROM base6;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Actividad18 e = new Actividad18(rs.getString(1),rs.getString(2),rs.getString(3));
          
            listaa18.add(e);
         }
         rs.close();
         pat.close();
      }
    catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaa18;
   }
}
