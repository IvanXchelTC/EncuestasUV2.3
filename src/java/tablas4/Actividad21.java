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
public class Actividad21 {
    
    private String id;
    private String profesorpuntual;
    private String total7;

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
     * @return the profesorpuntual
     */
    public String getProfesorpuntual() {
        return profesorpuntual;
    }

    /**
     * @param profesorpuntual the profesorpuntual to set
     */
    public void setProfesorpuntual(String profesorpuntual) {
        this.profesorpuntual = profesorpuntual;
    }

    /**
     * @return the total7
     */
    public String getTotal7() {
        return total7;
    }

    /**
     * @param total7 the total7 to set
     */
    public void setTotal7(String total7) {
        this.total7 = total7;
    }

    public Actividad21(String id, String profesorpuntual, String total7) {
        this.id = id;
        this.profesorpuntual = profesorpuntual;
        this.total7 = total7;
    }    
}
