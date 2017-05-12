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
public class Actividad3 {
    
    private String id;
    private String  salamultiples;
    private String total3;

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
     * @return the salamultiples
     */
    public String getSalamultiples() {
        return salamultiples;
    }

    /**
     * @param salamultiples the salamultiples to set
     */
    public void setSalamultiples(String salamultiples) {
        this.salamultiples = salamultiples;
    }

    /**
     * @return the total3
     */
    public String getTotal3() {
        return total3;
    }

    /**
     * @param total3 the total3 to set
     */
    public void setTotal3(String total3) {
        this.total3 = total3;
    }

    public Actividad3(String id, String salamultiples, String total3) {
        this.id = id;
        this.salamultiples = salamultiples;
        this.total3 = total3;
    }
        
}
