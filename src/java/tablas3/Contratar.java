
package tablas3;

public class Contratar {
     private String id;
   private String contratar;
   private String total2;

    public Contratar(String id, String contratar, String total2) {
        this.id = id;
        this.contratar = contratar;
        this.total2 = total2;
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
     * @return the contratar
     */
    public String getContratar() {
        return contratar;
    }

    /**
     * @param contratar the contratar to set
     */
    public void setContratar(String contratar) {
        this.contratar = contratar;
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
}
