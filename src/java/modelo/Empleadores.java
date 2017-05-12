/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author jose luis rosas
 */
@Entity
@Table(name = "empleadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleadores.findAll", query = "SELECT e FROM Empleadores e"),
    @NamedQuery(name = "Empleadores.findByIdEmpleador", query = "SELECT e FROM Empleadores e WHERE e.idEmpleador = :idEmpleador"),
    @NamedQuery(name = "Empleadores.findByNombre", query = "SELECT e FROM Empleadores e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleadores.findByCarrera", query = "SELECT e FROM Empleadores e WHERE e.carrera = :carrera"),
    @NamedQuery(name = "Empleadores.findByEmpresa", query = "SELECT e FROM Empleadores e WHERE e.empresa = :empresa"),
    @NamedQuery(name = "Empleadores.findByDomicilioE", query = "SELECT e FROM Empleadores e WHERE e.domicilioE = :domicilioE"),
    @NamedQuery(name = "Empleadores.findByPuestoD", query = "SELECT e FROM Empleadores e WHERE e.puestoD = :puestoD")})
public class Empleadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empleador")
    private Integer idEmpleador;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "carrera")
    private String carrera;
    @Basic(optional = false)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    @Column(name = "domicilioE")
    private String domicilioE;
    @Basic(optional = false)
    @Column(name = "puestoD")
    private String puestoD;

    public Empleadores() {
    }

    public Empleadores(Integer idEmpleador) {
        this.idEmpleador = idEmpleador;
    }

    public Empleadores(Integer idEmpleador, String nombre, String carrera, String empresa, String domicilioE, String puestoD) {
        this.idEmpleador = idEmpleador;
        this.nombre = nombre;
        this.carrera = carrera;
        this.empresa = empresa;
        this.domicilioE = domicilioE;
        this.puestoD = puestoD;
    }

    public Integer getIdEmpleador() {
        return idEmpleador;
    }

    public void setIdEmpleador(Integer idEmpleador) {
        this.idEmpleador = idEmpleador;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDomicilioE() {
        return domicilioE;
    }

    public void setDomicilioE(String domicilioE) {
        this.domicilioE = domicilioE;
    }

    public String getPuestoD() {
        return puestoD;
    }

    public void setPuestoD(String puestoD) {
        this.puestoD = puestoD;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleador != null ? idEmpleador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleadores)) {
            return false;
        }
        Empleadores other = (Empleadores) object;
        if ((this.idEmpleador == null && other.idEmpleador != null) || (this.idEmpleador != null && !this.idEmpleador.equals(other.idEmpleador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Empleadores[ idEmpleador=" + idEmpleador + " ]";
    }
    
}
