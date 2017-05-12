
package controladores.empleadores;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class enlazaencuesta2 {
    
    public void registrar1(empleador1 emp)throws SQLException{
        String s = "UPDATE empleador1 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar2(empleador1 emp)throws SQLException{
        String s = "UPDATE procentajes SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar3(empleador1 emp)throws SQLException{
        String s = "UPDATE formacion SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar4(empleador1 emp)throws SQLException{
        String s = "UPDATE procentajes SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar5(empleador1 emp)throws SQLException{
        String s = "UPDATE niveles SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar6(empleador1 emp)throws SQLException{
        String s = "UPDATE empleador1 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar7(empleador1 emp)throws SQLException{
        String s = "UPDATE empleador1 SET total3 = total3 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar8(empleador1 emp)throws SQLException{
        String s = "UPDATE empleador1 SET total4 = total4 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar9(empleador1 emp)throws SQLException{
        String s = "UPDATE empleador1 SET total5 = total5 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar10(empleador1 emp)throws SQLException{
        String s = "UPDATE empleador1 SET total6 = total6 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar11(empleador1 emp)throws SQLException{
        String s = "UPDATE niveles SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar12(empleador1 emp)throws SQLException{
        String s = "UPDATE formacion SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
}
