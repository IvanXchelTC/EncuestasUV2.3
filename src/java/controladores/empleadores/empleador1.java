package controladores.empleadores;

public class empleador1 {
    private int id;
    private String res;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public empleador1() {
    }

    public empleador1(String res, int total) {
        this.res = res;
        this.total = total;
    }

    public empleador1(int id, String res, int total) {
        this.id = id;
        this.res = res;
        this.total = total;
    }
    
}
