package conexGrafica;

import controlador.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class listaDificil {
    
   public static LinkedList<Dificil> getDificil()
   {
       
      LinkedList<Dificil> listaDificil=new LinkedList<Dificil>();
      try
      {
         conexion c= new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
       
         Consulta = "SELECT * FROM dificil";
     
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
       
           int cont = 0;
         while (rs.next())
         {
            Dificil difi = new Dificil(rs.getString(1),rs.getString(2), rs.getString(3));
          
            listaDificil.add(difi);
            cont ++;
         }
            System.out.println(cont);

         rs.close();
         pat.close();
      }catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaDificil;
   }
}