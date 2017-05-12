/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.seguimiento_egresados;

/**
 *
 * @author jose luis rosas
 */
public class construye {
    
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

    public construye() {
    }

    public construye(String pregunta, int total) {
        this.pregunta = pregunta;
        this.total = total;
    }

    public construye(int id, String pregunta, int total) {
        this.id = id;
        this.pregunta = pregunta;
        this.total = total;
    }    
}
