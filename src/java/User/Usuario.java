/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Ivan_XchelHG
 */
public class Usuario {
     private String Id_Usuario;
   private String Usuario;
   private String Pass;

    public Usuario(String Id_Usuario, String Usuario, String Pass) {
        this.Id_Usuario = Id_Usuario;
        this.Usuario = Usuario;
        this.Pass = Pass;
    }

    /**
     * @return the Id_Usuario
     */
    public String getId_Usuario() {
        return Id_Usuario;
    }

    /**
     * @param Id_Usuario the Id_Usuario to set
     */
    public void setId_Usuario(String Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Pass
     */
    public String getPass() {
        return Pass;
    }

    /**
     * @param Pass the Pass to set
     */
    public void setPass(String Pass) {
        this.Pass = Pass;
    }
}
