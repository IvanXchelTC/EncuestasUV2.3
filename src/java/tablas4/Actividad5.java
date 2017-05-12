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
public class Actividad5 {
    
    private String id;
    private String  laboratorios;
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
     * @return the laboratorios
     */
    public String getLaboratorios() {
        return laboratorios;
    }

    /**
     * @param laboratorios the laboratorios to set
     */
    public void setLaboratorios(String laboratorios) {
        this.laboratorios = laboratorios;
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

    public Actividad5(String id, String laboratorios, String total5) {
        this.id = id;
        this.laboratorios = laboratorios;
        this.total5 = total5;
    }
        
}
