
package tablas3;

public class Satisfaccion1 {
     private String id;
   private String gsastifacion;
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
     * @return the gsastifacion
     */
    public String getGsastifacion() {
        return gsastifacion;
    }

    /**
     * @param gsastifacion the gsastifacion to set
     */
    public void setGsastifacion(String gsastifacion) {
        this.gsastifacion = gsastifacion;
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

    public Satisfaccion1(String id, String gsastifacion, String total2) {
        this.id = id;
        this.gsastifacion = gsastifacion;
        this.total2 = total2;
    }
    
}
