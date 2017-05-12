
package controladores.seguimiento_egresados;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class enlazaencuesta4 {
    
    public void registrar1(construye cons)throws SQLException{
        String s = "UPDATE base1 SET total = total +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar2(construye cons)throws SQLException{
        String s = "UPDATE base2 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar3(construye cons)throws SQLException{
        String s = "UPDATE base2 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar4(construye cons)throws SQLException{
        String s = "UPDATE base2 SET total3 = total3 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar5(construye cons)throws SQLException{
        String s = "UPDATE base3 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar6(construye cons)throws SQLException{
        String s = "UPDATE base3 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar7(construye cons)throws SQLException{
        String s = "UPDATE base3 SET total3 = total3 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar8(construye cons)throws SQLException{
        String s = "UPDATE base4 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar9(construye cons)throws SQLException{
        String s = "UPDATE base4 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar10(construye cons)throws SQLException{
        String s = "UPDATE base4 SET total3 = total3 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar11(construye cons)throws SQLException{
        String s = "UPDATE base2 SET total5 = total5 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar12(construye cons)throws SQLException{
        String s = "UPDATE base2 SET total6 = total6 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar13(construye cons)throws SQLException{
        String s = "UPDATE base5 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
     public void registrar14(construye cons)throws SQLException{
        String s = "UPDATE base5 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
     
    public void registrar15(construye cons)throws SQLException{
        String s = "UPDATE base6 SET total1 = total1 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar16(construye cons)throws SQLException{
        String s = "UPDATE base6 SET total2 = total2 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar17(construye cons)throws SQLException{
        String s = "UPDATE base6 SET total3 = total3 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar18(construye cons)throws SQLException{
        String s = "UPDATE base6 SET total4 = total4 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar19(construye cons)throws SQLException{
        String s = "UPDATE base6 SET total5 = total5 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar20(construye cons)throws SQLException{
        String s = "UPDATE base6 SET total6 = total6 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar21(construye cons)throws SQLException{
        String s = "UPDATE base6 SET total7 = total7 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
    
    public void registrar22(construye cons)throws SQLException{
        String s = "UPDATE base6 SET total8 = total8 +1 WHERE id=?";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        
        //se hace la actualizacion
        ps.setInt(1,cons.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();        
    }
}
