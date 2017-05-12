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
public class Actividad15 {
    
    private String id;
    private String informacionfacil;
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
     * @return the informacionfacil
     */
    public String getInformacionfacil() {
        return informacionfacil;
    }

    /**
     * @param informacionfacil the informacionfacil to set
     */
    public void setInformacionfacil(String informacionfacil) {
        this.informacionfacil = informacionfacil;
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

    public Actividad15(String id, String informacionfacil, String total1) {
        this.id = id;
        this.informacionfacil = informacionfacil;
        this.total1 = total1;
    }
}
