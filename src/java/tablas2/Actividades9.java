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
public class Actividades9 {
     
    private String id;
   private String motivacionegre;
   private String total5;

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
     * @return the motivacionegre
     */
    public String getMotivacionegre() {
        return motivacionegre;
    }

    /**
     * @param motivacionegre the motivacionegre to set
     */
    public void setMotivacionegre(String motivacionegre) {
        this.motivacionegre = motivacionegre;
    }

    /**
     * @return the total5
     */
    public String getTotal5() {
        return total5;
    }

    /**
     * @param total5 the total5 to set
     */
    public void setTotal5(String total5) {
        this.total5 = total5;
    }

    public Actividades9(String id, String motivacionegre, String total5) {
        this.id = id;
        this.motivacionegre = motivacionegre;
        this.total5 = total5;
    }
}
