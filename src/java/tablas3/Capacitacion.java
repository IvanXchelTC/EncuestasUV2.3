
package tablas3;


public class Capacitacion {
     private String id;
   private String capacitacion;
   private String total7;

    public Capacitacion(String id, String capacitacion, String total7) {
        this.id = id;
        this.capacitacion = capacitacion;
        this.total7 = total7;
    }

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
     * @return the capacitacion
     */
    public String getCapacitacion() {
        return capacitacion;
    }

    /**
     * @param capacitacion the capacitacion to set
     */
    public void setCapacitacion(String capacitacion) {
        this.capacitacion = capacitacion;
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
}
