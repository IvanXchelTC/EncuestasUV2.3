
package tablas3;


public class Ofrece1 {
    private String id;
   private String scompetitivos;
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
     * @return the scompetitivos
     */
    public String getScompetitivos() {
        return scompetitivos;
    }

    /**
     * @param scompetitivos the scompetitivos to set
     */
    public void setScompetitivos(String scompetitivos) {
        this.scompetitivos = scompetitivos;
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

    public Ofrece1(String id, String scompetitivos, String total3) {
        this.id = id;
        this.scompetitivos = scompetitivos;
        this.total3 = total3;
    }
    
}
