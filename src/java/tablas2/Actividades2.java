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
public class Actividades2 {
    
    private String id;
   private String Sicuanto;
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
     * @return the Sicuanto
     */
    public String getSicuanto() {
        return Sicuanto;
    }

    /**
     * @param Sicuanto the Sicuanto to set
     */
    public void setSicuanto(String Sicuanto) {
        this.Sicuanto = Sicuanto;
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

    public Actividades2(String id, String Sicuanto, String total1) {
        this.id = id;
        this.Sicuanto = Sicuanto;
        this.total1 = total1;
    }
}
