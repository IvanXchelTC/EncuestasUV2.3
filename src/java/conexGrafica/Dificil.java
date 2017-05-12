
package conexGrafica;

public class Dificil {
   private String id;
   private String razones;
   private String cantidad;
     Dificil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRazones() {
        return razones;
    }

    public void setRazones(String razones) {
        this.razones = razones;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
      public Dificil(String id, String razones, String cantidad) {
        super();
        this.id = id;
        this.razones = razones;
        this.cantidad = cantidad;
    }
}
