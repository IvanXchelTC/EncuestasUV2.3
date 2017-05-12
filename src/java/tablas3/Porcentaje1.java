
package tablas3;


public class Porcentaje1 {
     private String id;
   private String pestimado;
   private String total1;

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
     * @return the pestimado
     */
    public String getPestimado() {
        return pestimado;
    }

    /**
     * @param pestimado the pestimado to set
     */
    public void setPestimado(String pestimado) {
        this.pestimado = pestimado;
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

    public Porcentaje1(String id, String pestimado, String total1) {
        this.id = id;
        this.pestimado = pestimado;
        this.total1 = total1;
    }
    
}
