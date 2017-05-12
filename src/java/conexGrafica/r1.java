package conexGrafica;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author trdni
 */
public class r1 {
    
   public static LinkedList<Dificil> Dificil()
   {
       
      LinkedList<Dificil> listaDificil=new LinkedList<Dificil>();
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
            Dificil contacto = new Dificil(rs.getString(1),rs.getString(2), rs.getString(3));
          
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
  
   

