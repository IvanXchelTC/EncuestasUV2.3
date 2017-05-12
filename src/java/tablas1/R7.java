
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class R7 {
    public static LinkedList<Arraigo1> Arraigo1()
   {
       
      LinkedList<Arraigo1> listaDificil5=new LinkedList<Arraigo1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,izona,totalzona FROM zona;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Arraigo1 contacto = new Arraigo1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaDificil5.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaDificil5;
   }
}
