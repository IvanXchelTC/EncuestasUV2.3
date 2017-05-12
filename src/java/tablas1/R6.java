
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class R6 {
    public static LinkedList<Salario1> Salario1()
   {
       
      LinkedList<Salario1> listaDificil5=new LinkedList<Salario1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "Select * from salario";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Salario1 contacto = new Salario1(rs.getString(1),rs.getString(2), rs.getString(3));
          
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
