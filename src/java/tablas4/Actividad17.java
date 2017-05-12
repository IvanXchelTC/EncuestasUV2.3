
package tablas4;

/**
 *
 * @author jose luis rosas
 */
public class Actividad17 {
    
    private String id;
    private String utilizacionrecursos;
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
     * @return the utilizacionrecursos
     */
    public String getUtilizacionrecursos() {
        return utilizacionrecursos;
    }

    /**
     * @param utilizacionrecursos the utilizacionrecursos to set
     */
    public void setUtilizacionrecursos(String utilizacionrecursos) {
        this.utilizacionrecursos = utilizacionrecursos;
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

    public Actividad17(String id, String utilizacionrecursos, String total3) {
        this.id = id;
        this.utilizacionrecursos = utilizacionrecursos;
        this.total3 = total3;
    }
 }
