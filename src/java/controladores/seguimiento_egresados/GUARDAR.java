package controladores.seguimiento_egresados;

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

@WebServlet(name = "GUARDARl", urlPatterns = {"/GUARDAR"})
public class GUARDAR extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        
        String nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String numero = request.getParameter("numero");
        String carrera = request.getParameter("carrera");
        String egrese = request.getParameter("egreso");
        
        modelo.Base0 base = new modelo.Base0();
        
        base.setId(0);
        base.setNombre(nombre);
        base.setDireccion(direccion);
        base.setCorreo(correo);
        base.setNumero(numero);
        base.setCarrera(carrera);
        
        EntityManager en;
        EntityManagerFactory enc;
        enc= Persistence.createEntityManagerFactory("EncuestasUVPU");
        en = enc.createEntityManager();
        en.getTransaction().begin();
        en.persist(base);
        en.flush();
        en.getTransaction().commit();
        response.sendRedirect("registrado.jsp");
        
        
    
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
