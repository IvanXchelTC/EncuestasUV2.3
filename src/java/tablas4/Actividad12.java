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
public class Actividad12 {
    
    private String id;
    private String inmobiliariobueno;
    private String total3;

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
     * @return the inmobiliariobueno
     */
    public String getInmobiliariobueno() {
        return inmobiliariobueno;
    }

    /**
     * @param inmobiliariobueno the inmobiliariobueno to set
     */
    public void setInmobiliariobueno(String inmobiliariobueno) {
        this.inmobiliariobueno = inmobiliariobueno;
    }

    /**
     * @return the total3
     */
    public String getTotal3() {
        return total3;
    }

    /**
     * @param total3 the total3 to set
     */
    public void setTotal3(String total3) {
        this.total3 = total3;
    }

    public Actividad12(String id, String inmobiliariobueno, String total3) {
        this.id = id;
        this.inmobiliariobueno = inmobiliariobueno;
        this.total3 = total3;
    }
}
