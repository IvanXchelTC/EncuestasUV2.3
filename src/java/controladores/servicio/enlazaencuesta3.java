package controladores.servicio;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class enlazaencuesta3 {
    
    public void registrar1(constructor cont)throws SQLException{
        String s = "UPDATE tabla1 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar2(constructor cont)throws SQLException{
        String s = "UPDATE tabla1 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar3(constructor cont)throws SQLException{
        String s = "UPDATE tabla1 SET total3 = total3 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar4(constructor cont)throws SQLException{
        String s = "UPDATE tabla2 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar5(constructor cont)throws SQLException{
        String s = "UPDATE tabla2 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar6(constructor cont)throws SQLException{
        String s = "UPDATE tabla3 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
     public void registrar7(constructor cont)throws SQLException{
        String s = "UPDATE tabla4 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
     
    public void registrar8(constructor cont)throws SQLException{
        String s = "UPDATE tabla3 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar9(constructor cont)throws SQLException{
        String s = "UPDATE tabla5 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar10(constructor cont)throws SQLException{
        String s = "UPDATE tabla5 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar11(constructor cont)throws SQLException{
        String s = "UPDATE tabla2 SET total3 = total3 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar12(constructor cont)throws SQLException{
        String s = "UPDATE tabla2 SET total4 = total4 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar13(constructor cont)throws SQLException{
        String s = "UPDATE tabla2 SET total5 = total5 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar14(constructor cont)throws SQLException{
        String s = "UPDATE tabla2 SET total6 = total6 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar15(constructor cont)throws SQLException{
        String s = "UPDATE tabla2 SET total7 = total7 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar16(constructor cont)throws SQLException{
        String s = "UPDATE tabla5 SET total3 = total3 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar17(constructor cont)throws SQLException{
        String s = "UPDATE tabla4 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cont.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
}
