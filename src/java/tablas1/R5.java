
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class R5 {
    public static LinkedList<Desempeño1> Desempeño1()
   {
       
      LinkedList<Desempeño1> listaDificil4=new LinkedList<Desempeño1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "Select * from desempeño";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Desempeño1 contacto = new Desempeño1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaDificil4.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaDificil4;
   }
}
