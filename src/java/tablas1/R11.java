
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class R11 {
    public static LinkedList<Titula1> Titula1()
   {
       
      LinkedList<Titula1> listaDificil11=new LinkedList<Titula1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT * FROM prueba1.tramite;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Titula1 contacto = new Titula1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaDificil11.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaDificil11;
   }
}
