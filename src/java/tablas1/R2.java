
package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class R2 {
    public static LinkedList<Dificultad1> Dificultad1()
   {
       
      LinkedList<Dificultad1> listaDificil=new LinkedList<Dificultad1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "Select * from dificil";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);

         while (rs.next())
         {
            Dificultad1 contacto = new Dificultad1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaDificil.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaDificil;
   }
    
}
