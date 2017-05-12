
package tablas3;

public class Formacion1 {
     private String id;
   private String formacion;
   private String total1;

    public Formacion1(String id, String formacion, String total1) {
        this.id = id;
        this.formacion = formacion;
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
     * @return the formacion
     */
    public String getFormacion() {
        return formacion;
    }

    /**
     * @param formacion the formacion to set
     */
    public void setFormacion(String formacion) {
        this.formacion = formacion;
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
