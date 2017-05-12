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
@Table(name = "base0")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Base0.findAll", query = "SELECT b FROM Base0 b"),
    @NamedQuery(name = "Base0.findById", query = "SELECT b FROM Base0 b WHERE b.id = :id"),
    @NamedQuery(name = "Base0.findByNombre", query = "SELECT b FROM Base0 b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "Base0.findByDireccion", query = "SELECT b FROM Base0 b WHERE b.direccion = :direccion"),
    @NamedQuery(name = "Base0.findByCorreo", query = "SELECT b FROM Base0 b WHERE b.correo = :correo"),
    @NamedQuery(name = "Base0.findByNumero", query = "SELECT b FROM Base0 b WHERE b.numero = :numero"),
    @NamedQuery(name = "Base0.findByCarrera", query = "SELECT b FROM Base0 b WHERE b.carrera = :carrera"),
    @NamedQuery(name = "Base0.findByEgreso", query = "SELECT b FROM Base0 b WHERE b.egreso = :egreso")})
public class Base0 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "numero")
    private String numero;
    @Column(name = "carrera")
    private String carrera;
    @Column(name = "egreso")
    private String egreso;

    public Base0() {
    }

    public Base0(Integer id) {
        this.id = id;
    }

    public Base0(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEgreso() {
        return egreso;
    }

    public void setEgreso(String egreso) {
        this.egreso = egreso;
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
        if (!(object instanceof Base0)) {
            return false;
        }
        Base0 other = (Base0) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Base0[ id=" + id + " ]";
    }
    
}
