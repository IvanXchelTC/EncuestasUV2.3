
package encuesta1;

public class desempeño {
    private int id;
    private String tipo;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public desempeño() {
    }

    public desempeño(String tipo, int total) {
        this.tipo = tipo;
        this.total = total;
    }

    public desempeño(int id, String tipo, int total) {
        this.id = id;
        this.tipo = tipo;
        this.total = total;
    }        
    
}
