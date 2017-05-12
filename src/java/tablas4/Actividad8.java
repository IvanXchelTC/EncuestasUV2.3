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
public class Actividad8 {
    
     private String id;
    private String  salasadecu;
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
     * @return the salasadecu
     */
    public String getSalasadecu() {
        return salasadecu;
    }

    /**
     * @param salasadecu the salasadecu to set
     */
    public void setSalasadecu(String salasadecu) {
        this.salasadecu = salasadecu;
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

    public Actividad8(String id, String salasadecu, String total2) {
        this.id = id;
        this.salasadecu = salasadecu;
        this.total2 = total2;
    }
        
}
