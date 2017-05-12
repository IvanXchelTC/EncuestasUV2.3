
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class R9 {
    public static LinkedList<Clima1> Clima1()
   {
       
      LinkedList<Clima1> listaDificil9=new LinkedList<Clima1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,cuni,totalclima FROM zona;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Clima1 contacto = new Clima1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaDificil9.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaDificil9;
   }
}
