
package tablas3;

public class Necesidades1 {
    private String id;
   private String necesidades;
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
     * @return the necesidades
     */
    public String getNecesidades() {
        return necesidades;
    }

    /**
     * @param necesidades the necesidades to set
     */
    public void setNecesidades(String necesidades) {
        this.necesidades = necesidades;
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

    public Necesidades1(String id, String necesidades, String total2) {
        this.id = id;
        this.necesidades = necesidades;
        this.total2 = total2;
    }
    
}
