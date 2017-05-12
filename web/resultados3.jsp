<%@page import="tablas3.A05"%>
<%@page import="tablas3.Contratar"%>
<%@page import="tablas3.A004"%>
<%@page import="tablas3.Capacitacion2"%>
<%@page import="tablas3.A003"%>
<%@page import="tablas3.Capacitacion"%>
<%@page import="tablas3.A002"%>
<%@page import="tablas3.Aportaciones"%>
<%@page import="tablas3.A001"%>
<%@page import="tablas3.Organizacion"%>
<%@page import="tablas3.A00"%>
<%@page import="tablas3.atencion"%>
<%@page import="tablas3.A09"%>
<%@page import="tablas3.Compromiso"%>
<%@page import="tablas3.A08"%>
<%@page import="tablas3.Equipo"%>
<%@page import="tablas3.A07"%>
<%@page import="tablas3.Comportamiento1"%>
<%@page import="tablas3.A06"%>
<%@page import="tablas3.Satisfaccion2"%>
<%@page import="tablas3.A5"%>
<%@page import="tablas3.Formacion1"%>
<%@page import="tablas3.A04"%>
<%@page import="tablas3.Porcentaje1"%>
<%@page import="tablas3.A03"%>
<%@page import="tablas3.Necesidades1"%>
<%@page import="tablas3.A02"%>
<%@page import="tablas3.Ofrece1"%>
<%@page import="tablas3.A01"%>
<%@page import="tablas3.Satisfaccion1"%>
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
    
</head>

<body>    <header class="clearfix">
				<nav>
					<a href="menu.jsp" class="icon-arrow-left" data-info="Retroceder">Pagina previa</a>
				</nav>
			</header>
    <h1>Resultado de Encuesta de Servicio Social</h1>
        <div class="table-title">
        <h3>Cual es su grado de sastifación general</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Satisfacción</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Satisfaccion1> listaee1 = A01.Satisfaccion1();
        for (int i=0;i<listaee1.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaee1.get(i).getId()+"</td>");
           out.println("<td>"+listaee1.get(i).getGsastifacion()+"</td>");
           out.println("<td>"+listaee1.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    
<div class="table-title">
        <h3>facultad de ingeniería de la universidad veracruzana ofrece servicios</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opinión</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Ofrece1> listaee2 = A02.Ofrece1();
        for (int i=0;i<listaee2.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaee2.get(i).getId()+"</td>");
           out.println("<td>"+listaee2.get(i).getScompetitivos()+"</td>");
           out.println("<td>"+listaee2.get(i).getTotal3()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    
<div class="table-title">
        <h3> ¿Ha recomendado usted la Facultad de Ingeniería?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opinión</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Ofrece1> listaee3 = A02.Ofrece1();
        for (int i=0;i<listaee3.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaee3.get(i).getId()+"</td>");
           out.println("<td>"+listaee3.get(i).getScompetitivos()+"</td>");
           out.println("<td>"+listaee3.get(i).getTotal3()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    
   
<div class="table-title">
        <h3> necesidades requeridas por su empresa</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opinión</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Necesidades1> listaee4 = A03.Necesidades1();
        for (int i=0;i<listaee4.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaee4.get(i).getId()+"</td>");
           out.println("<td>"+listaee4.get(i).getNecesidades()+"</td>");
           out.println("<td>"+listaee4.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    
  
<div class="table-title">
        <h3>Si la respuesta es Si, ¿En que porcentaje estima?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Porcentaje</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Porcentaje1> listaee5 = A04.Porcentaje1();
        for (int i=0;i<listaee5.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaee5.get(i).getId()+"</td>");
           out.println("<td>"+listaee5.get(i).getPestimado()+"</td>");
           out.println("<td>"+listaee5.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    

<div class="table-title">
        <h3>formación académica</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Formacion</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Formacion1> listaee6 = A5.Formacion1();
        for (int i=0;i<listaee6.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaee6.get(i).getId()+"</td>");
           out.println("<td>"+listaee6.get(i).getFormacion()+"</td>");
           out.println("<td>"+listaee6.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    

<div class="table-title">
        <h3>Satisfacción de estudiante</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Porcentaje</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Satisfaccion2> lista6 = A06.Satisfaccion2();
        for (int i=0;i<lista6.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+lista6.get(i).getId()+"</td>");
           out.println("<td>"+lista6.get(i).getSatisfacion()+"</td>");
           out.println("<td>"+lista6.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    

<div class="table-title">
        <h3> comportamiento del estudiante</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Porcentaje</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Comportamiento1> lista7 = A07.Comportamiento1();
        for (int i=0;i<lista7.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+lista7.get(i).getId()+"</td>");
           out.println("<td>"+lista7.get(i).getComportamiento()+"</td>");
           out.println("<td>"+lista7.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    

<div class="table-title">
        <h3> Capacidad para trabajar en equipo</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Capacidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Equipo> lista8 = A08.Equipo();
        for (int i=0;i<lista8.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+lista8.get(i).getId()+"</td>");
           out.println("<td>"+lista8.get(i).getServicios()+"</td>");
           out.println("<td>"+lista8.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    

<div class="table-title">
        <h3> Mostro compromiso, dedicacion, y esfuerzo</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Capacidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Compromiso> lista9 = A09.Compromiso();
        for (int i=0;i<lista9.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+lista9.get(i).getId()+"</td>");
           out.println("<td>"+lista9.get(i).getMostro()+"</td>");
           out.println("<td>"+lista9.get(i).getTotal3()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    

<div class="table-title">
        <h3>  La puntualidad es muy importante</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Respuestas</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<atencion> listas = A00.atencion();
        for (int i=0;i<listas.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listas.get(i).getId()+"</td>");
           out.println("<td>"+listas.get(i).getAtencion()+"</td>");
           out.println("<td>"+listas.get(i).getTotal4()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    

<div class="table-title">
        <h3>  organizacion y planificacion</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Respuestas</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Organizacion> listaas = A001.Organizacion();
        for (int i=0;i<listaas.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaas.get(i).getId()+"</td>");
           out.println("<td>"+listaas.get(i).getOrganizacion()+"</td>");
           out.println("<td>"+listaas.get(i).getTotal5()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  

<div class="table-title">
        <h3> aportaciones significativas</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Respuestas</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Aportaciones> lists = A002.Aportaciones();
        for (int i=0;i<lists.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+lists.get(i).getId()+"</td>");
           out.println("<td>"+lists.get(i).getAportaciones()+"</td>");
           out.println("<td>"+lists.get(i).getTotal6()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    

<div class="table-title">
        <h3> Capacitación</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Respuestas</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Capacitacion> list = A003.Capacitacion();
        for (int i=0;i<list.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+list.get(i).getId()+"</td>");
           out.println("<td>"+list.get(i).getCapacitacion()+"</td>");
           out.println("<td>"+list.get(i).getTotal7()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>    

<div class="table-title">
        <h3> Resultado de la capacitación</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Respuestas</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Capacitacion2> lis = A004.Capacitacion2();
        for (int i=0;i<lis.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+lis.get(i).getId()+"</td>");
           out.println("<td>"+lis.get(i).getCapacitacion()+"</td>");
           out.println("<td>"+lis.get(i).getTotal3()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  

<div class="table-title">
        <h3> ¿Contrataría usted a un egresado?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Respuestas</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Contratar> li = A05.Contratar();
        for (int i=0;i<li.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+li.get(i).getId()+"</td>");
           out.println("<td>"+li.get(i).getContratar()+"</td>");
           out.println("<td>"+li.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>  
  </body>

</html>
