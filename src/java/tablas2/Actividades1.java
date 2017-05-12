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
public class Actividades1 {
    
    private String id;
   private String relacionact;
   private String total1;

    /**
     * @return the id
     */
   Actividades1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
     * @return the relacionact
     */
    public String getRelacionact() {
        return relacionact;
    }

    /**
     * @param relacionact the relacionact to set
     */
    public void setRelacionact(String relacionact) {
        this.relacionact = relacionact;
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
    
    public Actividades1(String id, String relacionact, String total1) {
        super();
        this.id = id;
        this.relacionact = relacionact;
        this.total1 = total1;
    }

    
}
