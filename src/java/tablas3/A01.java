
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import tablas1.Empleo1;


public class A01 {
    
   public static LinkedList<Satisfaccion1> Satisfaccion1()
   {
      
      LinkedList<Satisfaccion1> listaee1=new LinkedList<Satisfaccion1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,gsastifacion,total2 FROM prueba1.tabla1;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Satisfaccion1 e = new Satisfaccion1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee1.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee1;
   }
}
