
package tablas1;


public class Arraigo1 {
       private String id;
   private String izona;
   private String totalzona;

    Arraigo1() {
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
     * @return the izona
     */
    public String getIzona() {
        return izona;
    }

    /**
     * @param izona the izona to set
     */
    public void setIzona(String izona) {
        this.izona = izona;
    }

    /**
     * @return the totalzona
     */
    public String getTotalzona() {
        return totalzona;
    }

    /**
     * @param totalzona the totalzona to set
     */
    public void setTotalzona(String totalzona) {
        this.totalzona = totalzona;
    }
     public Arraigo1(String id, String izona, String totalzona) {
        super();
        this.id = id;
        this.izona = izona;
        this.totalzona = totalzona;
    }

    
}
