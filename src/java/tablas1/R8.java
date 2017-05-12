/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Ivan_XchelHG
 */
public class R8 {
    public static LinkedList<Formacion1> Formacion1()
   {
       
      LinkedList<Formacion1> listaDificil8=new LinkedList<Formacion1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,frecibida,totalfomacion FROM zona;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Formacion1 contacto = new Formacion1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaDificil8.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaDificil8;
   }
}
