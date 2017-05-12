
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class A02 {
     
   public static LinkedList<Ofrece1> Ofrece1()
   {
      
      LinkedList<Ofrece1> listaee2=new LinkedList<Ofrece1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,recomendo,total1 FROM prueba1.tabla2;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Ofrece1 e = new Ofrece1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee2.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee2;
   }
}
