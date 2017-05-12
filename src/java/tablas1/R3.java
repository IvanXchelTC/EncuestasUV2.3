
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class R3 {
     public static LinkedList<Organismo1> Organismo1()
   {
      
      LinkedList<Organismo1> listae2=new LinkedList<Organismo1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "Select * from empleo1";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Organismo1 e = new Organismo1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listae2.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listae2;
   }
}
