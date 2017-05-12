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
public class Actividad13 {
    
     private String id;
    private String equipobrin;
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
     * @return the equipobrin
     */
    public String getEquipobrin() {
        return equipobrin;
    }

    /**
     * @param equipobrin the equipobrin to set
     */
    public void setEquipobrin(String equipobrin) {
        this.equipobrin = equipobrin;
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

    public Actividad13(String id, String equipobrin, String total1) {
        this.id = id;
        this.equipobrin = equipobrin;
        this.total1 = total1;
    }    
}
