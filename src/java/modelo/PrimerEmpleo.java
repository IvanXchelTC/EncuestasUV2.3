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
@Table(name = "primer_empleo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrimerEmpleo.findAll", query = "SELECT p FROM PrimerEmpleo p"),
    @NamedQuery(name = "PrimerEmpleo.findByIdprimerEmpleo", query = "SELECT p FROM PrimerEmpleo p WHERE p.idprimerEmpleo = :idprimerEmpleo"),
    @NamedQuery(name = "PrimerEmpleo.findByIdencuesta2", query = "SELECT p FROM PrimerEmpleo p WHERE p.idencuesta2 = :idencuesta2"),
    @NamedQuery(name = "PrimerEmpleo.findByMenos6", query = "SELECT p FROM PrimerEmpleo p WHERE p.menos6 = :menos6"),
    @NamedQuery(name = "PrimerEmpleo.findByMeses", query = "SELECT p FROM PrimerEmpleo p WHERE p.meses = :meses"),
    @NamedQuery(name = "PrimerEmpleo.findByA12Meses", query = "SELECT p FROM PrimerEmpleo p WHERE p.a12Meses = :a12Meses"),
    @NamedQuery(name = "PrimerEmpleo.findByMasDeUnA\u00f1o", query = "SELECT p FROM PrimerEmpleo p WHERE p.masDeUnA\u00f1o = :masDeUnA\u00f1o"),
    @NamedQuery(name = "PrimerEmpleo.findBySinempleo", query = "SELECT p FROM PrimerEmpleo p WHERE p.sinempleo = :sinempleo")})
public class PrimerEmpleo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprimer_empleo")
    private Integer idprimerEmpleo;
    @Basic(optional = false)
    @Column(name = "idencuesta2")
    private int idencuesta2;
    @Basic(optional = false)
    @Column(name = "menos6")
    private String menos6;
    @Basic(optional = false)
    @Column(name = "9meses")
    private String meses;
    @Basic(optional = false)
    @Column(name = "9  a 12  meses")
    private String a12Meses;
    @Basic(optional = false)
    @Column(name = "mas de un a\u00f1o")
    private int masDeUnAño;
    @Basic(optional = false)
    @Column(name = "Sin empleo")
    private int sinempleo;

    public PrimerEmpleo() {
    }

    public PrimerEmpleo(Integer idprimerEmpleo) {
        this.idprimerEmpleo = idprimerEmpleo;
    }

    public PrimerEmpleo(Integer idprimerEmpleo, int idencuesta2, String menos6, String meses, String a12Meses, int masDeUnAño, int sinempleo) {
        this.idprimerEmpleo = idprimerEmpleo;
        this.idencuesta2 = idencuesta2;
        this.menos6 = menos6;
        this.meses = meses;
        this.a12Meses = a12Meses;
        this.masDeUnAño = masDeUnAño;
        this.sinempleo = sinempleo;
    }

    public Integer getIdprimerEmpleo() {
        return idprimerEmpleo;
    }

    public void setIdprimerEmpleo(Integer idprimerEmpleo) {
        this.idprimerEmpleo = idprimerEmpleo;
    }

    public int getIdencuesta2() {
        return idencuesta2;
    }

    public void setIdencuesta2(int idencuesta2) {
        this.idencuesta2 = idencuesta2;
    }

    public String getMenos6() {
        return menos6;
    }

    public void setMenos6(String menos6) {
        this.menos6 = menos6;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public String getA12Meses() {
        return a12Meses;
    }

    public void setA12Meses(String a12Meses) {
        this.a12Meses = a12Meses;
    }

    public int getMasDeUnAño() {
        return masDeUnAño;
    }

    public void setMasDeUnAño(int masDeUnAño) {
        this.masDeUnAño = masDeUnAño;
    }

    public int getSinempleo() {
        return sinempleo;
    }

    public void setSinempleo(int sinempleo) {
        this.sinempleo = sinempleo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprimerEmpleo != null ? idprimerEmpleo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrimerEmpleo)) {
            return false;
        }
        PrimerEmpleo other = (PrimerEmpleo) object;
        if ((this.idprimerEmpleo == null && other.idprimerEmpleo != null) || (this.idprimerEmpleo != null && !this.idprimerEmpleo.equals(other.idprimerEmpleo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.PrimerEmpleo[ idprimerEmpleo=" + idprimerEmpleo + " ]";
    }
    
}
