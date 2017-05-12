
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class A002 {
    
   public static LinkedList<Aportaciones> Aportaciones()
   {
      
      LinkedList<Aportaciones> listaee90=new LinkedList<Aportaciones>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,aportaciones,total6 FROM prueba1.tabla2;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Aportaciones e = new Aportaciones(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee90.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee90;
   }
}
