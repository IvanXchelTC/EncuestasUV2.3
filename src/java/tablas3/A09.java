
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class A09 {
    
   public static LinkedList<Compromiso> Compromiso()
   {
      
      LinkedList<Compromiso> listaee9=new LinkedList<Compromiso>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,mostro,total3 FROM prueba1.tabla2;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Compromiso e = new Compromiso(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee9.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee9;
   }
}
