
package tablas3;


public class atencion {
    private String id;
   private String atencion;
   private String total4;

    public atencion(String id, String atencion, String total4) {
        this.id = id;
        this.atencion = atencion;
        this.total4 = total4;
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
     * @return the atencion
     */
    public String getAtencion() {
        return atencion;
    }

    /**
     * @param atencion the atencion to set
     */
    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    /**
     * @return the total4
     */
    public String getTotal4() {
        return total4;
    }

    /**
     * @param total4 the total4 to set
     */
    public void setTotal4(String total4) {
        this.total4 = total4;
    }
}
