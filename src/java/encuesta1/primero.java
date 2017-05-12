/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "primero", urlPatterns = {"/primero"})
public class primero extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet primero</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet primero at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                         
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            PrintWriter out= response.getWriter();   //se imprimer en html
            
            //optenemos el valor del radioboton
            int codigo;
            codigo= Integer.parseInt(request.getParameter("option1"));
                        
            //se intancia el primer empleo y llenamos
            primerempleo primero =new primerempleo();
            primero.setCodigo(codigo);
            
            
            try{
                //se llama al metodo registrar dela calse enlazaencuesta.java
                enlazaencuesta enlaza = new enlazaencuesta();
                enlaza.registrar(primero);                
               
                out.print("se registro la votacion");
                out.print("voto = "+ codigo + "<br>  "); 
                out.print("<a href='Encuesta1.jsp'>Regresar </a>" );
            }catch(Exception e){
                out.println("ERROR DE CONEXION" + e.toString());
            }
            
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
