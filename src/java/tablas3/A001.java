
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class A001 {
    
   public static LinkedList<Organizacion> Organizacion()
   {
      
      LinkedList<Organizacion> listaee00=new LinkedList<Organizacion>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,organizacion,total5 FROM prueba1.tabla2;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Organizacion e = new Organizacion(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee00.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee00;
   }
}
