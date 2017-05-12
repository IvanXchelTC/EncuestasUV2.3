
package encuesta1;

public class estatu {
    
    private int id;
    private String estatus;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public estatu() {
    }

    public estatu(String estatus, int total) {
        this.estatus = estatus;
        this.total = total;
    }

    public estatu(int id, String estatus, int total) {
        this.id = id;
        this.estatus = estatus;
        this.total = total;
    }
}
