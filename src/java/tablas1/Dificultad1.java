
package tablas1;

public class Dificultad1 {
   private String id;
   private String razones;
   private String cantidad;
     Dificultad1() {
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
    
      public Dificultad1(String id, String razones, String cantidad) {
        super();
        this.id = id;
        this.razones = razones;
        this.cantidad = cantidad;
    }
}
