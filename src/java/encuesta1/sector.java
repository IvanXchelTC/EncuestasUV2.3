
package encuesta1;

public class sector {
    
    private int codigo;
    private String tipos;
    private int total;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public sector() {
    }

    public sector(String tipos, int total) {
        this.tipos = tipos;
        this.total = total;
    }

    public sector(int codigo, String tipos, int total) {
        this.codigo = codigo;
        this.tipos = tipos;
        this.total = total;
    }
        
}
