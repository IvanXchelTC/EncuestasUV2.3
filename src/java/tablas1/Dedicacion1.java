
package tablas1;

public class Dedicacion1 {
     private String id;
   private String dedicacion;
   private String total;
    Dedicacion1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the dedicacion
     */
    public String getDedicacion() {
        return dedicacion;
    }

    /**
     * @param dedicacion the dedicacion to set
     */
    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }
    public Dedicacion1(String id, String dedicacion, String total) {
        super();
        this.id = id;
        this.dedicacion = dedicacion;
        this.total = total;
    }
}
