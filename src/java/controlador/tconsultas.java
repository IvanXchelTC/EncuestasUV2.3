package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import modelo.Usuarios;


public class tconsultas {
    
   public static LinkedList<Usuarios> getUsuarios(String op,String user,String pass)
   {
       
      LinkedList<Usuarios> listaUsuarios=new LinkedList<Usuarios>();
      try
      {
         conexion c= new conexion();
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        if(op.equals("uno"))
       {
         Consulta = "Select * from usuarios";
       
         pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
       }
       if(op.equals("dos"))
       {
          Consulta = "Select * from usuarios where Usuario = '"+user+"'";
          pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
       }
        if(op.equals("tres"))
       {
          Consulta = "Select * from usuarios where pass = '"+pass+"' ";
          pat = c.getConexion().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
       }  
          
         while (rs.next())
         {
            Usuarios contacto = new Usuarios(rs.getInt(0),rs.getString(1), rs.getString(2));
          
            listaUsuarios.add(contacto);
         }
         rs.close();
         pat.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaUsuarios;
   }
}