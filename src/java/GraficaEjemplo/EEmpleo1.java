
package GraficaEjemplo;

public class EEmpleo1 {
    private String idempleo1;
    private String tiempo;
    private String total;

    public EEmpleo1() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      public String getIdempleo1() {
        return idempleo1;
    }

    public void setIdempleo1(String idempleo1) {
        this.idempleo1 = idempleo1;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
     public EEmpleo1(String idempleo1, String tiempo, String total){
        super();
        this.idempleo1 = idempleo1;
        this.tiempo = tiempo;
        this.total = total;
    }
    
}