
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class A03 {
    
   public static LinkedList<Necesidades1> Necesidades1()
   {
      
      LinkedList<Necesidades1> listaee3=new LinkedList<Necesidades1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,necesidades,total2 FROM prueba1.tabla2;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Necesidades1 e = new Necesidades1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee3.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee3;
   }
}
