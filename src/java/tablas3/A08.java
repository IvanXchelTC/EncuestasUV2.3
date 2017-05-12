
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class A08 {
    
   public static LinkedList<Equipo> Equipo()
   {
      
      LinkedList<Equipo> listaee8=new LinkedList<Equipo>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,servicios,total2 FROM prueba1.tabla5;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Equipo e = new Equipo(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee8.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee8;
   }
}
