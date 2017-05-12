
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
@Table(name = "encuesta2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Encuesta2.findAll", query = "SELECT e FROM Encuesta2 e"),
    @NamedQuery(name = "Encuesta2.findByIdencuesta2", query = "SELECT e FROM Encuesta2 e WHERE e.idencuesta2 = :idencuesta2"),
    @NamedQuery(name = "Encuesta2.findByNombre", query = "SELECT e FROM Encuesta2 e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Encuesta2.findByMatricula", query = "SELECT e FROM Encuesta2 e WHERE e.matricula = :matricula"),
    @NamedQuery(name = "Encuesta2.findByDireccion", query = "SELECT e FROM Encuesta2 e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Encuesta2.findByCorreo", query = "SELECT e FROM Encuesta2 e WHERE e.correo = :correo"),
    @NamedQuery(name = "Encuesta2.findByTelfono", query = "SELECT e FROM Encuesta2 e WHERE e.telfono = :telfono"),
    @NamedQuery(name = "Encuesta2.findByPrograma", query = "SELECT e FROM Encuesta2 e WHERE e.programa = :programa")})
public class Encuesta2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idencuesta2")
    private Integer idencuesta2;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telfono")
    private String telfono;
    @Column(name = "programa")
    private String programa;

    public Encuesta2() {
    }

    public Encuesta2(Integer idencuesta2) {
        this.idencuesta2 = idencuesta2;
    }

    public Integer getIdencuesta2() {
        return idencuesta2;
    }

    public void setIdencuesta2(Integer idencuesta2) {
        this.idencuesta2 = idencuesta2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelfono() {
        return telfono;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idencuesta2 != null ? idencuesta2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encuesta2)) {
            return false;
        }
        Encuesta2 other = (Encuesta2) object;
        if ((this.idencuesta2 == null && other.idencuesta2 != null) || (this.idencuesta2 != null && !this.idencuesta2.equals(other.idencuesta2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Encuesta2[ idencuesta2=" + idencuesta2 + " ]";
    }
    
}
