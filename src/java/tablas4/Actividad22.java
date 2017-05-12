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
public class Actividad22 {
    
    private String id;
    private String motivaciondocente;
    private String total8;

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
     * @return the motivaciondocente
     */
    public String getMotivaciondocente() {
        return motivaciondocente;
    }

    /**
     * @param motivaciondocente the motivaciondocente to set
     */
    public void setMotivaciondocente(String motivaciondocente) {
        this.motivaciondocente = motivaciondocente;
    }

    /**
     * @return the total8
     */
    public String getTotal8() {
        return total8;
    }

    /**
     * @param total8 the total8 to set
     */
    public void setTotal8(String total8) {
        this.total8 = total8;
    }

    public Actividad22(String id, String motivaciondocente, String total8) {
        this.id = id;
        this.motivaciondocente = motivaciondocente;
        this.total8 = total8;
    }
}
