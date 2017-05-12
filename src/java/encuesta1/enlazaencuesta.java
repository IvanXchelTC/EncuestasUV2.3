/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jose luis rosas
 */
public class enlazaencuesta {
    
    public void registrar(primerempleo primer) throws SQLException{
        String s = "UPDATE empleo1 SET total = total +1 WHERE idempleo1=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,primer.getCodigo());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
        
    }
    
   public void registrar3(sector sec) throws SQLException{
        String s = "UPDATE organismo SET total = total +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,sec.getCodigo());
        ps.executeUpdate();
        conex.con.close();
        ps.close();
        
   }
   
   public void registrar4(dedicacionE dedi) throws SQLException{
        String s = "UPDATE dedicacion SET total = total +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,dedi.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
   }
   
   public void registrar5(desempeño des)throws SQLException{
        String s = "UPDATE desempeño SET total = total +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,des.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();                 
   }
   
    public void registrar6(salario sal)throws SQLException{
        String s = "UPDATE salario SET total = total +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,sal.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();                 
   }
    
   public void registrar7(zona zon)throws SQLException{
        String s = "UPDATE zona SET totalzona = totalzona +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,zon.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();                 
   } 
   
   public void registrar8(conocimiento cono)throws SQLException{
        String s = "UPDATE zona SET totalfomacion = totalfomacion +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cono.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();                 
   } 
   
   public void registrar9(climaU cli)throws SQLException{
        String s = "UPDATE zona SET totalclima = totalclima +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cli.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();                 
   } 
   
   public void registrar10(estatu est)throws SQLException{
        String s = "UPDATE estatus SET total = total +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,est.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();                 
   } 
   
   public void registrar11(tramite tra)throws SQLException{
        String s = "UPDATE tramite SET total = total +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,tra.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();                 
   } 
    
}
