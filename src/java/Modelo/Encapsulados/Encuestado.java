/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Encapsulados;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ivanxcheltc
 */
@MappedSuperclass
@Table(name = "encuestado")
@XmlRootElement
public class Encuestado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idencuestado")
    private Integer idencuestado;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "ProgramaE")
    private String programaE;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "labora")
    private String labora;
    @Column(name = "pregunta1")
    private String pregunta1;
    @Column(name = "pregunta2")
    private String pregunta2;
    @Column(name = "pregunta3")
    private String pregunta3;
    @Column(name = "ciudadT")
    private String ciudadT;
    @Column(name = "Trabajoactual")
    private String trabajoactual;
    @Column(name = "sector")
    private String sector;
    @Column(name = "pregunta41")
    private String pregunta41;
    @Column(name = "pregunta42")
    private String pregunta42;
    @Column(name = "pregunta43")
    private String pregunta43;
    @Column(name = "pregunta44")
    private String pregunta44;
    @Column(name = "pregunta51")
    private String pregunta51;
    @Column(name = "pregunta52")
    private String pregunta52;
    @Column(name = "pregunta53")
    private String pregunta53;
    @Column(name = "pregunta54")
    private String pregunta54;
    @Column(name = "pregunta 61")
    private String pregunta61;
    @Column(name = "pregunta 62")
    private String pregunta62;
    @Column(name = "pregunta 63")
    private String pregunta63;
    @Column(name = "pregunta 64")
    private String pregunta64;
    @Column(name = "pregunta 65")
    private String pregunta65;
    @Column(name = "pregunta 66")
    private String pregunta66;
    @Column(name = "pregunta 67")
    private String pregunta67;
    @Column(name = "pregunta 68")
    private String pregunta68;
    @Column(name = "pregunta 69")
    private String pregunta69;
    @Column(name = "pregunta 71")
    private String pregunta71;
    @Column(name = "pregunta 72")
    private String pregunta72;
    @Column(name = "pregunta 73")
    private String pregunta73;
    @Column(name = "pregunta 74")
    private String pregunta74;
    @Column(name = "pregunta 75")
    private String pregunta75;
    @Column(name = "pregunta 76")
    private String pregunta76;
    @Column(name = "pregunta 77")
    private String pregunta77;
    @Column(name = "pregunta 78")
    private String pregunta78;
    @Column(name = "pregunta 79")
    private String pregunta79;
    @Column(name = "pregunta 8")
    private String pregunta8;
    @Column(name = "pregunta 9")
    private String pregunta9;

    public Encuestado(){
    }
    public Encuestado(Integer idencuestado,String direccion, String nombre, String programaE, String fecha, String labora, String pregunta1, String pregunta2, String pregunta3, String ciudadT, String trabajoactual,String sector, String pregunta41, String pregunta42, String pregunta43, String pregunta44, String pregunta51, String pregunta52, String pregunta53, String pregunta54,String pregunta61, String pregunta62, String pregunta63, String pregunta64, String pregunta65, String pregunta66, String pregunta67, String pregunta68, String pregunta69, String pregunta71, String pregunta72, String pregunta73, String pregunta74, String pregunta75, String pregunta76, String pregunta77, String pregunta78, String pregunta79, String pregunta8, String pregunta9) {
        this.idencuestado=idencuestado;
        this.direccion=direccion;
        this.nombre=nombre;
        this.programaE=programaE;
        this.fecha=fecha;
        this.labora=labora;
        this.pregunta1=pregunta1;
        this.pregunta2=pregunta2;
        this.pregunta3=pregunta3;
        this.ciudadT=ciudadT;
        this.trabajoactual=trabajoactual;
        this.sector=sector;
        this.pregunta41=pregunta41;
        this.pregunta42=pregunta42;
        this.pregunta43=pregunta43;
        this.pregunta44=pregunta44;
        this.pregunta51=pregunta51;
        this.pregunta52=pregunta52;
        this.pregunta53=pregunta53;
        this.pregunta54=pregunta54;
        this.pregunta61=pregunta61;
        this.pregunta62=pregunta62;
        this.pregunta63=pregunta63;
        this.pregunta64=pregunta64;
        this.pregunta65=pregunta65;
        this.pregunta66=pregunta66;
        this.pregunta67=pregunta67;
        this.pregunta68=pregunta68;
        this.pregunta69=pregunta69;
        this.pregunta71=pregunta71;
        this.pregunta72=pregunta72;
        this.pregunta73=pregunta73;
        this.pregunta74=pregunta74;
        this.pregunta75=pregunta75;
        this.pregunta76=pregunta76;
        this.pregunta77=pregunta77;
        this.pregunta78=pregunta78;
        this.pregunta79=pregunta79;
        this.pregunta8=pregunta8;
        this.pregunta9=pregunta9;
        
    }

    public Encuestado(Integer idencuestado) {
        this.idencuestado = idencuestado;
    }

    public Integer getIdencuestado() {
        return idencuestado;
    }

    public void setIdencuestado(Integer idencuestado) {
        this.idencuestado = idencuestado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProgramaE() {
        return programaE;
    }

    public void setProgramaE(String programaE) {
        this.programaE = programaE;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLabora() {
        return labora;
    }

    public void setLabora(String labora) {
        this.labora = labora;
    }

    public String getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public String getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public String getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public String getCiudadT() {
        return ciudadT;
    }

    public void setCiudadT(String ciudadT) {
        this.ciudadT = ciudadT;
    }

    public String getTrabajoactual() {
        return trabajoactual;
    }

    public void setTrabajoactual(String trabajoactual) {
        this.trabajoactual = trabajoactual;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPregunta41() {
        return pregunta41;
    }

    public void setPregunta41(String pregunta41) {
        this.pregunta41 = pregunta41;
    }

    public String getPregunta42() {
        return pregunta42;
    }

    public void setPregunta42(String pregunta42) {
        this.pregunta42 = pregunta42;
    }

    public String getPregunta43() {
        return pregunta43;
    }

    public void setPregunta43(String pregunta43) {
        this.pregunta43 = pregunta43;
    }

    public String getPregunta44() {
        return pregunta44;
    }

    public void setPregunta44(String pregunta44) {
        this.pregunta44 = pregunta44;
    }

    public String getPregunta51() {
        return pregunta51;
    }

    public void setPregunta51(String pregunta51) {
        this.pregunta51 = pregunta51;
    }

    public String getPregunta52() {
        return pregunta52;
    }

    public void setPregunta52(String pregunta52) {
        this.pregunta52 = pregunta52;
    }

    public String getPregunta53() {
        return pregunta53;
    }

    public void setPregunta53(String pregunta53) {
        this.pregunta53 = pregunta53;
    }

    public String getPregunta54() {
        return pregunta54;
    }

    public void setPregunta54(String pregunta54) {
        this.pregunta54 = pregunta54;
    }

    public String getPregunta61() {
        return pregunta61;
    }

    public void setPregunta61(String pregunta61) {
        this.pregunta61 = pregunta61;
    }

    public String getPregunta62() {
        return pregunta62;
    }

    public void setPregunta62(String pregunta62) {
        this.pregunta62 = pregunta62;
    }

    public String getPregunta63() {
        return pregunta63;
    }

    public void setPregunta63(String pregunta63) {
        this.pregunta63 = pregunta63;
    }

    public String getPregunta64() {
        return pregunta64;
    }

    public void setPregunta64(String pregunta64) {
        this.pregunta64 = pregunta64;
    }

    public String getPregunta65() {
        return pregunta65;
    }

    public void setPregunta65(String pregunta65) {
        this.pregunta65 = pregunta65;
    }

    public String getPregunta66() {
        return pregunta66;
    }

    public void setPregunta66(String pregunta66) {
        this.pregunta66 = pregunta66;
    }

    public String getPregunta67() {
        return pregunta67;
    }

    public void setPregunta67(String pregunta67) {
        this.pregunta67 = pregunta67;
    }

    public String getPregunta68() {
        return pregunta68;
    }

    public void setPregunta68(String pregunta68) {
        this.pregunta68 = pregunta68;
    }

    public String getPregunta69() {
        return pregunta69;
    }

    public void setPregunta69(String pregunta69) {
        this.pregunta69 = pregunta69;
    }

    public String getPregunta71() {
        return pregunta71;
    }

    public void setPregunta71(String pregunta71) {
        this.pregunta71 = pregunta71;
    }

    public String getPregunta72() {
        return pregunta72;
    }

    public void setPregunta72(String pregunta72) {
        this.pregunta72 = pregunta72;
    }

    public String getPregunta73() {
        return pregunta73;
    }

    public void setPregunta73(String pregunta73) {
        this.pregunta73 = pregunta73;
    }

    public String getPregunta74() {
        return pregunta74;
    }

    public void setPregunta74(String pregunta74) {
        this.pregunta74 = pregunta74;
    }

    public String getPregunta75() {
        return pregunta75;
    }

    public void setPregunta75(String pregunta75) {
        this.pregunta75 = pregunta75;
    }

    public String getPregunta76() {
        return pregunta76;
    }

    public void setPregunta76(String pregunta76) {
        this.pregunta76 = pregunta76;
    }

    public String getPregunta77() {
        return pregunta77;
    }

    public void setPregunta77(String pregunta77) {
        this.pregunta77 = pregunta77;
    }

    public String getPregunta78() {
        return pregunta78;
    }

    public void setPregunta78(String pregunta78) {
        this.pregunta78 = pregunta78;
    }

    public String getPregunta79() {
        return pregunta79;
    }

    public void setPregunta79(String pregunta79) {
        this.pregunta79 = pregunta79;
    }

    public String getPregunta8() {
        return pregunta8;
    }

    public void setPregunta8(String pregunta8) {
        this.pregunta8 = pregunta8;
    }

    public String getPregunta9() {
        return pregunta9;
    }

    public void setPregunta9(String pregunta9) {
        this.pregunta9 = pregunta9;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idencuestado != null ? idencuestado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encuestado)) {
            return false;
        }
        Encuestado other = (Encuestado) object;
        if ((this.idencuestado == null && other.idencuestado != null) || (this.idencuestado != null && !this.idencuestado.equals(other.idencuestado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Encapsulados.Encuestado[ idencuestado=" + idencuestado + " ]";
    }
    
}
