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
public class Actividad1 {
    
    private String id;
    private String  banio;
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
     * @return the banio
     */
    public String getBanio() {
        return banio;
    }

    /**
     * @param banio the banio to set
     */
    public void setBanio(String banio) {
        this.banio = banio;
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

    public Actividad1(String id, String banio, String total1) {
        this.id = id;
        this.banio = banio;
        this.total1 = total1;
    }
    
    

}