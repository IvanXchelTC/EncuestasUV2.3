package tablas2;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import tablas1.Empleo1;

/**
 *
 * @author jose luis rosas
 */
public class T1 {
    public static LinkedList<Actividades1> Actividades1()
   {
    LinkedList<Actividades1> listaa1=new LinkedList<Actividades1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,relacionact,total1 FROM empleador1;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Actividades1 e = new Actividades1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaa1.add(e);
         }
         rs.close();
         pat.close();
      }
    catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaa1;
   }
}
