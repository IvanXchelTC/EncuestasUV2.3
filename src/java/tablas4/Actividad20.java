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
public class Actividad20 {
    
    private String id;
    private String plancompleto;
    private String total6;

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
     * @return the plancompleto
     */
    public String getPlancompleto() {
        return plancompleto;
    }

    /**
     * @param plancompleto the plancompleto to set
     */
    public void setPlancompleto(String plancompleto) {
        this.plancompleto = plancompleto;
    }

    /**
     * @return the total6
     */
    public String getTotal6() {
        return total6;
    }

    /**
     * @param total6 the total6 to set
     */
    public void setTotal6(String total6) {
        this.total6 = total6;
    }

    public Actividad20(String id, String plancompleto, String total6) {
        this.id = id;
        this.plancompleto = plancompleto;
        this.total6 = total6;
    }    
}
