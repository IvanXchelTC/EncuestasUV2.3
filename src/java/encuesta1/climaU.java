
package encuesta1;

public class climaU {
    private int id;
    private String clima;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public climaU() {
    }

    public climaU(String clima, int total) {
        this.clima = clima;
        this.total = total;
    }

    public climaU(int id, String clima, int total) {
        this.id = id;
        this.clima = clima;
        this.total = total;
    }
    
}
