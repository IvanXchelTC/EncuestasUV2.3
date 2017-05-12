
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class R4 {
    public static LinkedList<Dedicacion1> Dedicacion1()
   {
       
      LinkedList<Dedicacion1> listaDificil3=new LinkedList<Dedicacion1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "Select * from dedicacion";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Dedicacion1 contacto = new Dedicacion1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaDificil3.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaDificil3;
   }
}
