
package tablas1;

public class Clima1 {
    private String id;
   private String cuni;
   private String totalclima;
Clima1() {
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
     * @return the cuni
     */
    public String getCuni() {
        return cuni;
    }

    /**
     * @param cuni the cuni to set
     */
    public void setCuni(String cuni) {
        this.cuni = cuni;
    }

    /**
     * @return the totalclima
     */
    public String getTotalclima() {
        return totalclima;
    }

    /**
     * @param totalclima the totalclima to set
     */
    public void setTotalclima(String totalclima) {
        this.totalclima = totalclima;
    }
     public Clima1(String id, String cuni, String totalclima) {
        super();
        this.id = id;
        this.cuni = cuni;
        this.totalclima = totalclima;
    }
}
