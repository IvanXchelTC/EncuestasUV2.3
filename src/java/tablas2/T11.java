/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas2;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author jose luis rosas
 */
public class T11 {
        public static LinkedList<Actividades11> Actividades11()
   {
    LinkedList<Actividades11> listaa11=new LinkedList<Actividades11>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,Sicapa,total2 FROM niveles;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Actividades11 e = new Actividades11(rs.getString(1),rs.getString(2), rs.getString(3));
          
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
