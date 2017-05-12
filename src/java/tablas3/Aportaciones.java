
package tablas3;


public class Aportaciones {
     private String id;
   private String aportaciones;
   private String total6;

    public Aportaciones(String id, String aportaciones, String total6) {
        this.id = id;
        this.aportaciones = aportaciones;
        this.total6 = total6;
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
     * @return the aportaciones
     */
    public String getAportaciones() {
        return aportaciones;
    }

    /**
     * @param aportaciones the aportaciones to set
     */
    public void setAportaciones(String aportaciones) {
        this.aportaciones = aportaciones;
    }

    /**
     * @return the total6
     */
    public String getTotal6() {
        return total6;
    }

    /**
     * @param total6 the total6 to set
     */
    public void setTotal6(String total6) {
        this.total6 = total6;
    }
}
