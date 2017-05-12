package controladores.empleadores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet(name = "segundos", urlPatterns = {"/segundos"})
public class segundos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet segundos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet segundos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            PrintWriter out= response.getWriter();   //se imprimer en html
            
            int codigo;
            codigo= Integer.parseInt(request.getParameter("option1"));
            
            empleador1 emp = new empleador1();
            emp.setId(codigo);
            
            try{
                enlazaencuesta2 enla = new enlazaencuesta2();
                enla.registrar2(emp);
         
                JOptionPane.showMessageDialog(null,"Se registro la votación"); 
                out.print("se registro la votacion");
                out.print("voto = "+ codigo + "<br>  ");                 
                out.print("<a href='Encuesta2.jsp'>Regresar </a>" );
            }catch(Exception e){
                out.println("ERROR DE CONEXION" + e.toString());
            }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
