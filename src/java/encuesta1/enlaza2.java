/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta1;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class enlaza2 {
    
    public void registrar2(empleodificil emp)throws SQLException{
        String s = "UPDATE dificil SET cantidad = cantidad +1 WHERE id=?";
        //String s = "UPDATE `prueba1`.`dificil` SET `cantidad`='cantidad' +'1' WHERE `id`=?;";
        
        conexion conex = new conexion();
        PreparedStatement ps = conex.con.prepareStatement(s);
        //PreparedStatement ps= conex.con.prepareStatement(s);
        
        ps.setInt(1,emp.getId());
        ps.executeUpdate();
        conex.con.close();
        ps.close();
        
    }
    
}
