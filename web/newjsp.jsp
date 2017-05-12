<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="conexGrafica.lp2"%>
<%@page import="conexGrafica.Dificil"%>
<%@ page language="java" %>
<%@ page import = "java.util.LinkedList"%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" type="text/css" href="css/tablas.css" />

        <title>JSP Page</title>
    </head>
    <body>
   <h1>Consulta a base de datos</h1> <table>
    <div class="wrapper">
    <div class="table">
    <div class="row header green">
       
        <tr>
        <div class="cell">
        Id
      </div>
      <div class="cell">
        Razones
      </div>
      <div class="cell">
        Cantidad
      </div>
    </tr>
            <%
       LinkedList<Dificil> listaDificil = lp2.Dificil();
       for (int i=0;i<listaDificil.size();i++)
       {
          out.println("<tr>");
          out.println("<td>"+listaDificil.get(i).getId()+"</td>");
          out.println("<td>"+listaDificil.get(i).getRazones()+"</td>");
          out.println("<td>"+listaDificil.get(i).getCantidad()+"</td>");
          out.println("</tr>");
       }
       %>
       
    </div>
     </div>
    </div> </table>
    </body>
</html>
