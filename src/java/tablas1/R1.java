package tablas1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
public class R1 {
    
   public static LinkedList<Empleo1> Empleo1()
   {
      
      LinkedList<Empleo1> listae1=new LinkedList<Empleo1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "Select * from empleo1";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Empleo1 e = new Empleo1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listae1.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listae1;
   }
}