
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class A004 {
    
   public static LinkedList<Capacitacion2> Capacitacion2()
   {
      
      LinkedList<Capacitacion2> listaee010=new LinkedList<Capacitacion2>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,capacitacion,total3 FROM prueba1.tabla5;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Capacitacion2 e = new Capacitacion2(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee010.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee010;
   }
}
