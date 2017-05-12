
package tablas3;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class A5 {
    
   public static LinkedList<Formacion1> Formacion1()
   {
      
      LinkedList<Formacion1> listaee5=new LinkedList<Formacion1>();
      try
      {
         conexion c = new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "SELECT id,formacion,total1 FROM prueba1.tabla4;";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
         
         while (rs.next())
         {
            Formacion1 e = new Formacion1(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaee5.add(e);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaee5;
   }
}
