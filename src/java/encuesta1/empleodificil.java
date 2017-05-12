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
public class empleodificil {
    private int id;
    private String razones;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazones() {
        return razones;
    }

    public void setRazones(String razones) {
        this.razones = razones;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public empleodificil() {
    }

    public empleodificil(String razones, int total) {
        this.razones = razones;
        this.total = total;
    }

    public empleodificil(int id, String razones, int total) {
        this.id = id;
        this.razones = razones;
        this.total = total;
    }
    
    
    
}
