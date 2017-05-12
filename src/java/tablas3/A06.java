
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class A06 {
    
   public static LinkedList<Satisfaccion2> Satisfaccion2()
   {
      
      LinkedList<Satisfaccion2> listaee6=new LinkedList<Satisfaccion2>();
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
            Satisfaccion2 e = new Satisfaccion2(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee6.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee6;
   }
}
