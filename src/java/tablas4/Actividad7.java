/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas4;

/**
 *
 * @author jose luis rosas
 */
public class Actividad7 {
    
     private String id;
    private String  maquinasinsu;
    private String total1;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the maquinasinsu
     */
    public String getMaquinasinsu() {
        return maquinasinsu;
    }

    /**
     * @param maquinasinsu the maquinasinsu to set
     */
    public void setMaquinasinsu(String maquinasinsu) {
        this.maquinasinsu = maquinasinsu;
    }

    /**
     * @return the total1
     */
    public String getTotal1() {
        return total1;
    }

    /**
     * @param total1 the total1 to set
     */
    public void setTotal1(String total1) {
        this.total1 = total1;
    }

    public Actividad7(String id, String maquinasinsu, String total1) {
        this.id = id;
        this.maquinasinsu = maquinasinsu;
        this.total1 = total1;
    }
        
}
