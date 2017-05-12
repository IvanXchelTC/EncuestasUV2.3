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
public class Actividad2 {
    
     private String id;
    private String  salamagna;
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
     * @return the salamagna
     */
    public String getSalamagna() {
        return salamagna;
    }

    /**
     * @param salamagna the salamagna to set
     */
    public void setSalamagna(String salamagna) {
        this.salamagna = salamagna;
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

    public Actividad2(String id, String salamagna, String total2) {
        this.id = id;
        this.salamagna = salamagna;
        this.total2 = total2;
    }
    
}
