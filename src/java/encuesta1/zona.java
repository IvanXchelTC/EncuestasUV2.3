
package encuesta1;

public class zona {
    private int id;
    private String zona;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public zona() {
    }

    public zona(String zona, int total) {
        this.zona = zona;
        this.total = total;
    }

    public zona(int id, String zona, int total) {
        this.id = id;
        this.zona = zona;
        this.total = total;
    }    
}
