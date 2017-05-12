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
public class Actividades3 {
    
    private String id;
   private String formaicionade;
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
     * @return the formaicionade
     */
    public String getFormaicionade() {
        return formaicionade;
    }

    /**
     * @param formaicionade the formaicionade to set
     */
    public void setFormaicionade(String formaicionade) {
        this.formaicionade = formaicionade;
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

    public Actividades3(String id, String formaicionade, String total1) {
        this.id = id;
        this.formaicionade = formaicionade;
        this.total1 = total1;
    }
    
    
}
