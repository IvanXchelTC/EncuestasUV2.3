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
public class Acividad16 {
    
    private String id;
    private String interesprofesor;
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
     * @return the interesprofesor
     */
    public String getInteresprofesor() {
        return interesprofesor;
    }

    /**
     * @param interesprofesor the interesprofesor to set
     */
    public void setInteresprofesor(String interesprofesor) {
        this.interesprofesor = interesprofesor;
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

    public Acividad16(String id, String interesprofesor, String total2) {
        this.id = id;
        this.interesprofesor = interesprofesor;
        this.total2 = total2;
    }
}
