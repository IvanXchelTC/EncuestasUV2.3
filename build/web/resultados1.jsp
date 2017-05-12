<%@page import="tablas1.Titula1"%>
<%@page import="tablas1.R11"%>
<%@page import="tablas1.R10"%>
<%@page import="tablas1.Estatus1"%>
<%@page import="tablas1.R9"%>
<%@page import="tablas1.Clima1"%>
<%@page import="tablas1.R8"%>
<%@page import="tablas1.Formacion1"%>
<%@page import="tablas1.R7"%>
<%@page import="tablas1.Arraigo1"%>
<%@page import="tablas1.R6"%>
<%@page import="tablas1.Salario1"%>
<%@page import="tablas1.R5"%>
<%@page import="tablas1.Desempeño1"%>
<%@page import="tablas1.R4"%>
<%@page import="tablas1.Dedicacion1"%>
<%@page import="tablas1.R3"%>
<%@page import="tablas1.Organismo1"%>
<%@page import="tablas1.R2"%>
<%@page import="tablas1.Dificultad1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="tablas1.Empleo1"%>
<%@page import="tablas1.R1"%>
<%@ page language="java" %>
<%@ page import = "java.util.LinkedList"%> 
<% HttpSession objsesion = request.getSession(true);
    String  u = (String)objsesion.getAttribute("user");
    Object user = objsesion.getAttribute("user");    
    if(user == null){
        response.sendRedirect("index.jsp");  
    }
%>
<html>
<head>
	<meta charset="utf-8" />
	<title>Resultados Encuesta 1</title>
	<meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
              <link rel="stylesheet" type="text/css" href="css/tabla2.css" />
            	<link rel="shortcut icon" href="../favicon.ico">
</head>

<body>
    
    <header class="clearfix">
				<nav>
					<a href="menu.jsp" class="icon-arrow-left" data-info="Retroceder">Pagina previa</a>
				</nav>
			</header>
    <h1>Resultado de Encuesta de Egresados </h1>
        <div class="table-title">
        <h3>Tiempo que transcurrio en consieguir el primer empleo</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Tiempo</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Empleo1> listae1 = R1.Empleo1();
        for (int i=0;i<listae1.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listae1.get(i).getIdempleo1()+"</td>");
           out.println("<td>"+listae1.get(i).getTiempo()+"</td>");
           out.println("<td>"+listae1.get(i).getTotal()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>      
        <div class="table-title">
        <h3>Difilcutades para conseguir empleo</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Razones</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Dificultad1> listaDificil = R2.Dificultad1();
        for (int i=0;i<listaDificil.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil.get(i).getRazones()+"</td>");
           out.println("<td>"+listaDificil.get(i).getCantidad()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  

        <div class="table-title">
        <h3>Tipo de organismos donde trabajan</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Tiempo</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <%
        LinkedList<Organismo1> listaDificil2 = R3.Organismo1();
        for (int i=0;i<listaDificil.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil2.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil2.get(i).getTipo()+"</td>");
           out.println("<td>"+listaDificil2.get(i).getTotal()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
        <div class="table-title">
        <h3>Tiempo de dedicacion de empleo</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Dedicación</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <%
        LinkedList<Dedicacion1> listaDificil3 = R4.Dedicacion1();
        for (int i=0;i<listaDificil3.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil3.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil3.get(i).getDedicacion()+"</td>");
           out.println("<td>"+listaDificil3.get(i).getTotal()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
 <div class="table-title">
        <h3> Tipo de formacion personal en que se desempeña</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Dedicación</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <%
        LinkedList<Desempeño1> listaDificil4 = R5.Desempeño1();
        for (int i=0;i<listaDificil4.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil4.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil4.get(i).getTipo()+"</td>");
           out.println("<td>"+listaDificil4.get(i).getTotal()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
<div class="table-title">
        <h3>Salario profesional</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">salario</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <%
        LinkedList<Salario1> listaDificil5 = R6.Salario1();
        for (int i=0;i<listaDificil5.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil5.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil5.get(i).getSalario()+"</td>");
           out.println("<td>"+listaDificil5.get(i).getTotal()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
<div class="table-title">
        <h3>Arraigo en su zona de influencia o entidad federativa donde estuvo</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <%
        LinkedList<Arraigo1> listaDificil6 = R7.Arraigo1();
        for (int i=0;i<listaDificil6.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil6.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil6.get(i).getIzona()+"</td>");
           out.println("<td>"+listaDificil6.get(i).getTotalzona()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
<div class="table-title">
        <h3>Sastifaccion de la formacion reciida por la universidad</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <%
        LinkedList<Formacion1> listaDificil7 = R8.Formacion1();
        for (int i=0;i<listaDificil7.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil7.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil7.get(i).getFrecibida()+"</td>");
           out.println("<td>"+listaDificil7.get(i).getTotalfomacion()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
<div class="table-title">
        <h3>Opinión en cuanto al clima universitario</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <%
        LinkedList<Clima1> listaDificil8 = R9.Clima1();
        for (int i=0;i<listaDificil8.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil8.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil8.get(i).getCuni()+"</td>");
           out.println("<td>"+listaDificil8.get(i).getTotalclima()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
<div class="table-title">
        <h3>Estatus profesional</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Estatus</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <%
        LinkedList<Estatus1> listaDificil9 = R10.Estatus1();
        for (int i=0;i<listaDificil9.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil9.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil9.get(i).getEstatus()+"</td>");
           out.println("<td>"+listaDificil9.get(i).getTotal()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
<div class="table-title">
        <h3>A partir de tu egreso, tiempo en que tardaste para tramitar el titulo</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Tiempo</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <%
        LinkedList<Titula1> listaDificil10 = R11.Titula1();
        for (int i=0;i<listaDificil10.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaDificil10.get(i).getId()+"</td>");
           out.println("<td>"+listaDificil10.get(i).getTiempo()+"</td>");
           out.println("<td>"+listaDificil10.get(i).getTotal()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
  </body>

</html>
