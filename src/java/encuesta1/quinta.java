
package encuesta1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "quinta", urlPatterns = {"/quinta"})
public class quinta extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet quinta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet quinta at " + request.getContextPath() + "</h1>");
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
            
             //optenemos el valor del radioboton
            int codigo;
            codigo= Integer.parseInt(request.getParameter("option5"));
            
            desempeño dese = new desempeño();
            dese.setId(codigo);
            
            try{
                enlazaencuesta enlaza = new enlazaencuesta();
                enlaza.registrar5(dese);
                
                
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
