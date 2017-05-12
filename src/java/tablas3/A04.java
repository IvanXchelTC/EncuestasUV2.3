
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class A04 {
    
   public static LinkedList<Porcentaje1> Porcentaje1()
   {
      
      LinkedList<Porcentaje1> listaee4=new LinkedList<Porcentaje1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,pestimado,total1 FROM prueba1.tabla3;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Porcentaje1 e = new Porcentaje1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee4.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee4;
   }
}
