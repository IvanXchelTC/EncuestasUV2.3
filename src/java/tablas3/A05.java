
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class A05 {
    
   public static LinkedList<Contratar> Contratar()
   {
      
      LinkedList<Contratar> listaee020=new LinkedList<Contratar>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,contratar,total2 FROM prueba1.tabla4;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Contratar e = new Contratar(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee020.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee020;
   }
}
