/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas1;

/**
 *
 * @author Ivan_XchelHG
 */
public class Formacion1 {
    private String id;
   private String frecibida;
   private String totalfomacion;

   Formacion1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
     * @return the frecibida
     */
    public String getFrecibida() {
        return frecibida;
    }

    /**
     * @param frecibida the frecibida to set
     */
    public void setFrecibida(String frecibida) {
        this.frecibida = frecibida;
    }

    /**
     * @return the totalfomacion
     */
    public String getTotalfomacion() {
        return totalfomacion;
    }

    /**
     * @param totalfomacion the totalfomacion to set
     */
    public void setTotalfomacion(String totalfomacion) {
        this.totalfomacion = totalfomacion;
    }
    public Formacion1(String id, String frecibida, String totalfomacion) {
        super();
        this.id = id;
        this.frecibida = frecibida;
        this.totalfomacion = totalfomacion;
    }
}
