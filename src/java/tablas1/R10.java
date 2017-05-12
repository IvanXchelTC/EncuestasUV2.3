
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class R10 {
     public static LinkedList<Estatus1> Estatus1()
   {
       
      LinkedList<Estatus1> listaDificil10=new LinkedList<Estatus1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT * FROM prueba1.estatus;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Estatus1 contacto = new Estatus1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaDificil10.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaDificil10;
   }
}
