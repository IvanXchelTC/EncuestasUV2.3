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
public class Actividades4 {
    
  private String id;
   private String porcetajesas;
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
     * @return the porcetajesas
     */
    public String getPorcetajesas() {
        return porcetajesas;
    }

    /**
     * @param porcetajesas the porcetajesas to set
     */
    public void setPorcetajesas(String porcetajesas) {
        this.porcetajesas = porcetajesas;
    }

    /**
     * @return the total1
     */
    public String getTotal2() {
        return total2;
    }

    /**
     * @param total2 the total1 to set
     */
    public void setTotal1(String total2) {
        this.total2 = total2;
    }

    public Actividades4(String id, String porcetajesas, String total2) {
        this.id = id;
        this.porcetajesas = porcetajesas;
        this.total2 = total2;
    }

   
}
