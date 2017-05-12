
package tablas3;

public class Comportamiento1 {
     private String id;
   private String comportamiento;
   private String total1;

    public Comportamiento1(String id, String comportamiento, String total1) {
        this.id = id;
        this.comportamiento = comportamiento;
        this.total1 = total1;
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
     * @return the comportamiento
     */
    public String getComportamiento() {
        return comportamiento;
    }

    /**
     * @param comportamiento the comportamiento to set
     */
    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    /**
     * @return the total1
     */
    public String getTotal1() {
        return total1;
    }

    /**
     * @param total1 the total1 to set
     */
    public void setTotal1(String total1) {
        this.total1 = total1;
    }
}
