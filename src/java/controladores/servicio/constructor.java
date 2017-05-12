package controladores.servicio;

public class constructor {
    private int id;
    private String pregunta;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public constructor() {
    }

    public constructor(String pregunta, int total) {
        this.pregunta = pregunta;
        this.total = total;
    }

    public constructor(int id, String pregunta, int total) {
        this.id = id;
        this.pregunta = pregunta;
        this.total = total;
    }
    
}
