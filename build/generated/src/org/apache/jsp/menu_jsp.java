package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
 HttpSession objsesion = request.getSession(true);
    String  u = (String)objsesion.getAttribute("user");
    Object user = objsesion.getAttribute("user");    
    if(user == null){
        response.sendRedirect("index.jsp");  
    }

      out.write("\n");
      out.write("<html lang=es_es.utf-8 class=\"no-js\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("\t\t<title>UV: Sistema de Encuestas Vinculación</title>\n");
      out.write("\t\t<meta name=\"description\" content=\"Blueprint: Horizontal Drop-Down Menu\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"horizontal menu, microsoft menu, drop-down menu, mega menu, javascript, jquery, simple menu\" />\n");
      out.write("\t\t<meta name=\"author\" content=\"Codrops\" />\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"../favicon.ico\">\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/default.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\n");
      out.write("                \t<link rel=\"stylesheet\" href=\"css/footer-basic-centered.css\">\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<header class=\"clearfix\">\n");
      out.write("                                <span>Universidad Veracruzana</span>\n");
      out.write("\t\t\t\t<h1>Sistema de Encuestas Vinculación</h1>\n");
      out.write("                           \n");
      out.write("       \t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t<a href=\"NewServlet\" class=\"icon-arrow-left\" data-info=\"Cerrar Sesión\">Cerrar Sesión</a>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>\t\n");
      out.write("\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t<nav id=\"cbp-hrmenu\" class=\"cbp-hrmenu\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Encuestas</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cbp-hrsub\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cbp-hrsub-inner\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Egresados </h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"Encuesta1.jsp\">Encuesta de seguimiento a egresados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"Encuesta4.jsp\">Encuesta de seguimiento a recien egresados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Empleadores</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"Encuesta2.jsp\">Encuesta para empleadores</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Servicio Social</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"Encuesta3.jsp\">Encuesta para Servicio Social</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /cbp-hrsub-inner -->\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /cbp-hrsub -->\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Resultados</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cbp-hrsub\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cbp-hrsub-inner\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Egresados </h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"resultados1.jsp\">Encuesta de seguimiento a egresados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"resultados4.jsp\">Encuesta de seguimiento a recien egresados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Empleadores</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"resultados2.jsp\">Encuesta para empleadores</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Servicio Social</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"resultados3.jsp\">Encuesta para Servicio Social</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /cbp-hrsub-inner -->\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /cbp-hrsub -->\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Gráficas</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cbp-hrsub\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cbp-hrsub-inner\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Egresados </h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"Grafica1.jsp\">Encuesta de seguimiento a egresados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"Grafica4.jsp\">Encuesta de seguimiento a recien egresados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Empleadores</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"Grafica2.jsp\">Encuesta para empleadores</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Servicio Social</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"Grafica3.jsp\">Encuesta para Servicio Social</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /cbp-hrsub-inner -->\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /cbp-hrsub -->\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Descargas</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cbp-hrsub\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cbp-hrsub-inner\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Egresados </h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"https://onedrive.live.com/?id=6659C939614CB285!224&cid=6659C939614CB285\">Encuesta de seguimiento a egresados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"https://onedrive.live.com/?id=6659C939614CB285!224&cid=6659C939614CB285\">Encuesta de seguimiento a recien egresados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Empleadores</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"https://onedrive.live.com/?id=6659C939614CB285!224&cid=6659C939614CB285\">Encuesta para empleadores</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Servicio Social</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"https://onedrive.live.com/?id=6659C939614CB285!224&cid=6659C939614CB285\">Encuesta para Servicio Social</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                    <div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Documentos</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"https://www.uv.mx/latex/filosofia/aviso-de-privacidad/\">Aviso de privacidad</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /cbp-hrsub-inner -->\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /cbp-hrsub -->\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Administración</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cbp-hrsub\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cbp-hrsub-inner\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>Usuarios</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"registro_admins.jsp\">Alta de Usuarios</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                                                <ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"veUsuario.jsp\">Consulta de Usuarios</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t <div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /cbp-hrsub-inner -->\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /cbp-hrsub -->\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/cbpHorizontalMenu.min.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t\tcbpHorizontalMenu.init();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("                <footer class=\"footer-basic-centered\">\n");
      out.write("\n");
      out.write("\t\t\t<p class=\"footer-company-motto\">Facultad de Ingeniería de la Universidad Veracruzana</p>\n");
      out.write("\n");
      out.write("\t\t\t<p class=\"footer-links\">\n");
      out.write("\t\t\t\t<a href=\"#\">Iván Xchel Hernández Gracía</a>\n");
      out.write("\t\t\t\t·\n");
      out.write("\t\t\t\t<a href=\"#\">José Luis Rosas Leal</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t<p class=\"footer-company-name\">Copyright  &copy; 2017</p>\n");
      out.write("\n");
      out.write("\t\t</footer>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
