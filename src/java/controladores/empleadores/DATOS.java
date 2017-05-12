package controladores.empleadores;

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
@WebServlet(name = "DATOSL", urlPatterns = {"/DATOS"})
public class DATOS extends HttpServlet {

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
        String carrera = request.getParameter("carrera");
        String empresa = request.getParameter("empresa");
        String domicilio = request.getParameter("domicilioE");
        String puesto = request.getParameter("puestoD");
        
        modelo.Empleadores empleador = new modelo.Empleadores();
        
        empleador.setIdEmpleador(0);
        empleador.setNombre(nombre);
        empleador.setCarrera(carrera);
        empleador.setEmpresa(empresa);
        empleador.setPuestoD(puesto);
        
        EntityManager en;
        EntityManagerFactory enc;
        enc= Persistence.createEntityManagerFactory("EncuestasUVPU");
        en = enc.createEntityManager();
        en.getTransaction().begin();
        en.persist(empleador);
        en.flush();
        en.getTransaction().commit();
        response.sendRedirect("registrado1.jsp");        
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
