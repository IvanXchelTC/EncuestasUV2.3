
package encuesta1;

public class tramite {
    
    private int id;
    private String tramite;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public tramite() {
    }

    public tramite(String tramite, int total) {
        this.tramite = tramite;
        this.total = total;
    }

    public tramite(int id, String tramite, int total) {
        this.id = id;
        this.tramite = tramite;
        this.total = total;
    }    
}
