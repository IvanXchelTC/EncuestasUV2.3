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
public class Actividad9 {
    
    private String id;
    private String buenestado;
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
     * @return the buenestado
     */
    public String getBuenestado() {
        return buenestado;
    }

    /**
     * @param buenestado the buenestado to set
     */
    public void setBuenestado(String buenestado) {
        this.buenestado = buenestado;
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

    public Actividad9(String id, String buenestado, String total3) {
        this.id = id;
        this.buenestado = buenestado;
        this.total3 = total3;
    }

}
