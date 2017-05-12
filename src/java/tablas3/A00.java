
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class A00 {
    
   public static LinkedList<atencion> atencion()
   {
      
      LinkedList<atencion> listaee0=new LinkedList<atencion>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,atencion,total4 FROM prueba1.tabla2;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            atencion e = new atencion(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee0.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee0;
   }
}
