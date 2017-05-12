package encuesta1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "once", urlPatterns = {"/once"})
public class once extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet once</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet once at " + request.getContextPath() + "</h1>");
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
            codigo= Integer.parseInt(request.getParameter("option11"));
                        
            //se intancia el primer empleo y llenamos
            tramite trami = new tramite();
            trami.setId(codigo);
            
            
            try{
                //se llama al metodo registrar dela calse enlazaencuesta.java
                enlazaencuesta enlaza = new enlazaencuesta();
                enlaza.registrar11(trami);
               
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
