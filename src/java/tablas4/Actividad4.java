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
public class Actividad4 {
    
    private String id;
    private String  salacomputo;
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
     * @return the salacomputo
     */
    public String getSalacomputo() {
        return salacomputo;
    }

    /**
     * @param salacomputo the salacomputo to set
     */
    public void setSalacomputo(String salacomputo) {
        this.salacomputo = salacomputo;
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

    public Actividad4(String id, String salacomputo, String total4) {
        this.id = id;
        this.salacomputo = salacomputo;
        this.total4 = total4;
    }
    
}
