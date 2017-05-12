/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta1;

/**
 *
 * @author jose luis rosas
 */
public class primerempleo {
    private int codigo;
    private String pregunta;
    private int total;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public primerempleo() {
    }

    public primerempleo(String pregunta, int total) {
        this.pregunta = pregunta;
        this.total = total;
    }

    public primerempleo(int codigo, String pregunta, int total) {
        this.codigo = codigo;
        this.pregunta = pregunta;
        this.total = total;
    }

       
    
    
}
