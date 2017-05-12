
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "tabla0")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tabla0.findAll", query = "SELECT t FROM Tabla0 t"),
    @NamedQuery(name = "Tabla0.findById", query = "SELECT t FROM Tabla0 t WHERE t.id = :id"),
    @NamedQuery(name = "Tabla0.findByNombre", query = "SELECT t FROM Tabla0 t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tabla0.findByCarrera", query = "SELECT t FROM Tabla0 t WHERE t.carrera = :carrera")})
public class Tabla0 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "carrera")
    private String carrera;

    public Tabla0() {
    }

    public Tabla0(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabla0)) {
            return false;
        }
        Tabla0 other = (Tabla0) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Tabla0[ id=" + id + " ]";
    }
    
}
