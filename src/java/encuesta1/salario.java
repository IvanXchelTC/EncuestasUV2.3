/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta1;

public class salario {
    
    private int id;
    private String salario;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public salario() {
    }

    public salario(String salario, int total) {
        this.salario = salario;
        this.total = total;
    }

    public salario(int id, String salario, int total) {
        this.id = id;
        this.salario = salario;
        this.total = total;
    }   
        
}
