
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class A003 {
    
   public static LinkedList<Capacitacion> Capacitacion()
   {
      
      LinkedList<Capacitacion> list=new LinkedList<Capacitacion>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,capacitacion,total7 FROM prueba1.tabla2;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Capacitacion e = new Capacitacion(rs.getString(1),rs.getString(2), rs.getString(3));
          
            list.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return list;
   }
}
