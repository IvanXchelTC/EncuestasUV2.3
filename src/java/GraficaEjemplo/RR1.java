package GraficaEjemplo;

import tablas1.*;
import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
public class RR1 {
    
   public static LinkedList<EEmpleo1> EEmpleo1()
   {
      
      LinkedList<EEmpleo1> listae1=new LinkedList<EEmpleo1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT * FROM prueba1.empleo1 WHERE idempleo1=1;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
                     EEmpleo1 e = new EEmpleo1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listae1.add(e);
         
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