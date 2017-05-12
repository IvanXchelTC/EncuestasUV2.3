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
public class Actividad19 {
    
    private String id;
    private String contenidosutiles;
    private String total5;

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
     * @return the contenidosutiles
     */
    public String getContenidosutiles() {
        return contenidosutiles;
    }

    /**
     * @param contenidosutiles the contenidosutiles to set
     */
    public void setContenidosutiles(String contenidosutiles) {
        this.contenidosutiles = contenidosutiles;
    }

    /**
     * @return the total5
     */
    public String getTotal5() {
        return total5;
    }

    /**
     * @param total5 the total5 to set
     */
    public void setTotal5(String total5) {
        this.total5 = total5;
    }

    public Actividad19(String id, String contenidosutiles, String total5) {
        this.id = id;
        this.contenidosutiles = contenidosutiles;
        this.total5 = total5;
    }    
}
