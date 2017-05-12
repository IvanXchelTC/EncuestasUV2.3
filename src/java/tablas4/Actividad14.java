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
public class Actividad14 {
    
     private String id;
    private String equipobueno;
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
     * @return the equipobueno
     */
    public String getEquipobueno() {
        return equipobueno;
    }

    /**
     * @param equipobueno the equipobueno to set
     */
    public void setEquipobueno(String equipobueno) {
        this.equipobueno = equipobueno;
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

    public Actividad14(String id, String equipobueno, String total2) {
        this.id = id;
        this.equipobueno = equipobueno;
        this.total2 = total2;
    }
        
}
