
package tablas3;


public class Organizacion {
    private String id;
   private String organizacion;
   private String total5;

    public Organizacion(String id, String organizacion, String total5) {
        this.id = id;
        this.organizacion = organizacion;
        this.total5 = total5;
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
     * @return the organizacion
     */
    public String getOrganizacion() {
        return organizacion;
    }

    /**
     * @param organizacion the organizacion to set
     */
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
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
}
