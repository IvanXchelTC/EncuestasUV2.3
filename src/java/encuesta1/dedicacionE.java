
package encuesta1;

public class dedicacionE {
    
    private int id;
    private String tiempo;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public dedicacionE() {
    }

    public dedicacionE(String tiempo, int total) {
        this.tiempo = tiempo;
        this.total = total;
    }

    public dedicacionE(int id, String tiempo, int total) {
        this.id = id;
        this.tiempo = tiempo;
        this.total = total;
    }   
    
}
