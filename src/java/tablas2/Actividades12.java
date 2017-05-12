/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas2;

/**
 *
 * @author jose luis rosas
 */
public class Actividades12 {
    
    private String id;
   private String renovarcon;
   private String total2;

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
     * @return the renovarcon
     */
    public String getRenovarcon() {
        return renovarcon;
    }

    /**
     * @param renovarcon the renovarcon to set
     */
    public void setRenovarcon(String renovarcon) {
        this.renovarcon = renovarcon;
    }

    /**
     * @return the total2
     */
    public String getTotal2() {
        return total2;
    }

    /**
     * @param total2 the total2 to set
     */
    public void setTotal2(String total2) {
        this.total2 = total2;
    }

    public Actividades12(String id, String renovarcon, String total2) {
        this.id = id;
        this.renovarcon = renovarcon;
        this.total2 = total2;
    }
 
}
