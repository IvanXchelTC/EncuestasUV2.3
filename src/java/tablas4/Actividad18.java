/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas4;

/**
 *
 * @author jose luis rosas
 */
public class Actividad18 {
    
    private String id;
    private String metodosevaluacion;
    private String total4;

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
     * @return the metodosevaluacion
     */
    public String getMetodosevaluacion() {
        return metodosevaluacion;
    }

    /**
     * @param metodosevaluacion the metodosevaluacion to set
     */
    public void setMetodosevaluacion(String metodosevaluacion) {
        this.metodosevaluacion = metodosevaluacion;
    }

    /**
     * @return the total4
     */
    public String getTotal4() {
        return total4;
    }

    /**
     * @param total4 the total4 to set
     */
    public void setTotal4(String total4) {
        this.total4 = total4;
    }

    public Actividad18(String id, String metodosevaluacion, String total4) {
        this.id = id;
        this.metodosevaluacion = metodosevaluacion;
        this.total4 = total4;
    }
    
}
