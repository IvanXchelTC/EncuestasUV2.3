
package encuesta1;

public class conocimiento {
    
    private int id;
    private String conocimeinto;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConocimeinto() {
        return conocimeinto;
    }

    public void setConocimeinto(String conocimeinto) {
        this.conocimeinto = conocimeinto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public conocimiento() {
    }

    public conocimiento(String conocimeinto, int total) {
        this.conocimeinto = conocimeinto;
        this.total = total;
    }

    public conocimiento(int id, String conocimeinto, int total) {
        this.id = id;
        this.conocimeinto = conocimeinto;
        this.total = total;
    }    
    
}
