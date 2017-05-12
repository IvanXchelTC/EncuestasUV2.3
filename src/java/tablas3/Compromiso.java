
package tablas3;


public class Compromiso {
     private String id;
   private String mostro;
   private String total3;

    public Compromiso(String id, String mostro, String total3) {
        this.id = id;
        this.mostro = mostro;
        this.total3 = total3;
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
     * @return the mostro
     */
    public String getMostro() {
        return mostro;
    }

    /**
     * @param mostro the mostro to set
     */
    public void setMostro(String mostro) {
        this.mostro = mostro;
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
}
