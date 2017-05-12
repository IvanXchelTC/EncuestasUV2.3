/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas4;

import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author jose luis rosas
 */
public class Actividad10 {
     
    private String id;
    private String suficientes;
    private String total1;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the suficientes
     */
    public String getSuficientes() {
        return suficientes;
    }

    /**
     * @param suficientes the suficientes to set
     */
    public void setSuficientes(String suficientes) {
        this.suficientes = suficientes;
    }

    /**
     * @return the total1
     */
    public String getTotal1() {
        return total1;
    }

    /**
     * @param total1 the total1 to set
     */
    public void setTotal1(String total1) {
        this.total1 = total1;
    }

    public Actividad10(String id, String suficientes, String total1) {
        this.id = id;
        this.suficientes = suficientes;
        this.total1 = total1;
    }    
    
}
