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
import tablas2.Actividades12;

/**
 *
 * @author jose luis rosas
 */
public class A1 {
    
    public static LinkedList<Actividad1> Actividad1()
   {
    LinkedList<Actividad1> listaa1=new LinkedList<Actividad1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,banos,total1 FROM base2;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Actividad1 e = new Actividad1(rs.getString(1),rs.getString(2),rs.getString(3));
          
            listaa1.add(e);
         }
         rs.close();
         pat.close();
      }
    catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaa1;
   }
    
}
