/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jose luis rosas
 */
@WebServlet(name = "guardado1", urlPatterns = {"/guardado"})
public class guardado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           String nombre = request.getParameter("nombre");
           String matricula =request.getParameter("matricula");
           String direccion = request.getParameter("direccion");
           String correo = request.getParameter("correo");
           String telfono = request.getParameter("lelfono");
           String programa =request.getParameter("programa");
           String menos6 = request.getParameter("manos6");
           
           modelo.Encuesta2 encuesta= new modelo.Encuesta2();
           modelo.PrimerEmpleo empleo1=new modelo.PrimerEmpleo();
           
           encuesta.setNombre(nombre);
           encuesta.setMatricula(matricula);
           encuesta.setDireccion(direccion);
           encuesta.setCorreo(correo);
           encuesta.setTelfono(telfono);
           encuesta.setPrograma(programa);
           empleo1.setMenos6(menos6);
           //empleo1.setMenosDe6Meses(menos6);
          
          // empleo1.setMenosDe6Meses(menos6);
           //empleo1.setA9Meses(0);
           
           EntityManager en;
           EntityManager en1;
           EntityManagerFactory enc;
           EntityManagerFactory enc1;
           enc = Persistence.createEntityManagerFactory("EncuestasUVPU");
           enc1 = Persistence.createEntityManagerFactory("EncuestasUVPU");
           en = enc.createEntityManager(); 
           en1 = enc1.createEntityManager(); 
           en.getTransaction().begin();
           en1.getTransaction().begin();  //tabla 1
           en.persist(encuesta);
           en1.persist(empleo1);  //tabla 1
           en.flush();
           //en1.flush(); //tabla 1 error
           en.getTransaction().commit(); 
           //en1.getTransaction().commit();  //tabla 1
           response.sendRedirect("Atras.jsp");
           
                  
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
