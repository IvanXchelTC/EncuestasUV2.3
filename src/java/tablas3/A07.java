
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class A07 {
    
   public static LinkedList<Comportamiento1> Comportamiento1()
   {
      
      LinkedList<Comportamiento1> listaee7=new LinkedList<Comportamiento1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,satisfacion,total2 FROM prueba1.tabla3;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Comportamiento1 e = new Comportamiento1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee7.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee7;
   }
}
