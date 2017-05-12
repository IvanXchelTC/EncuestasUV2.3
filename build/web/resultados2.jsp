<%@page import="tablas2.T12"%>
<%@page import="tablas2.Actividades12"%>
<%@page import="tablas2.T11"%>
<%@page import="tablas2.Actividades11"%>
<%@page import="tablas2.T10"%>
<%@page import="tablas2.Actividades10"%>
<%@page import="tablas2.T9"%>
<%@page import="tablas2.Actividades9"%>
<%@page import="tablas2.T8"%>
<%@page import="tablas2.Actividades8"%>
<%@page import="tablas2.T7"%>
<%@page import="tablas2.Actividades7"%>
<%@page import="tablas2.T6"%>
<%@page import="tablas2.Actividades6"%>
<%@page import="tablas2.T5"%>
<%@page import="tablas2.Actividades5"%>
<%@page import="tablas2.T4"%>
<%@page import="tablas2.Actividades4"%>
<%@page import="tablas2.T3"%>
<%@page import="tablas2.Actividades3"%>
<%@page import="tablas2.T2"%>
<%@page import="tablas2.Actividades2"%>
<%@page import="tablas2.T1"%>
<%@page import="tablas2.Actividades1"%>
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
    <h1>Resultado de Encuesta de Egresados </h1>
        <div class="table-title">
        <h3>¿Consideras que las actividades que desempeña el egresado estan relacionadas con <br>
           su formación académica</h3>
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
        LinkedList<Actividades1> listaa1 = T1.Actividades1();
        for (int i=0;i<listaa1.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa1.get(i).getId()+"</td>");
           out.println("<td>"+listaa1.get(i).getRelacionact()+"</td>");
           out.println("<td>"+listaa1.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
        <h3>Si la respuesta es sí, ¿En qué porcentaje estima?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Porcentaje estimado</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividades2> listaa2 = T2.Actividades2();
        for (int i=0;i<listaa2.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa2.get(i).getId()+"</td>");
           out.println("<td>"+listaa2.get(i).getSicuanto()+"</td>");
           out.println("<td>"+listaa2.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>Considera que la formación académica que se le proporcionó al egresado<br>
              en la universidad es la adecuada para realizar las funciones que su<br>
              empresa o institución requiere:</h3>
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
        LinkedList<Actividades3> listaa3 = T3.Actividades3();
        for (int i=0;i<listaa3.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa3.get(i).getId()+"</td>");
           out.println("<td>"+listaa3.get(i).getFormaicionade()+"</td>");
           out.println("<td>"+listaa3.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
        <%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>¿Qué porcentaje de sastifación tuvo con el egresado de acuedo a los <br>
            requerimientos de su empresa o institución cuando fue contratado?</h3>
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
        LinkedList<Actividades4> listaa4 = T4.Actividades4();
        for (int i=0;i<listaa4.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa4.get(i).getId()+"</td>");
           out.println("<td>"+listaa4.get(i).getPorcetajesas()+"</td>");
           out.println("<td>"+listaa4.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
         <%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>¿Como evalua el comportamiento del egresado en cuestión de valores?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Nivel</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividades5> listaa5 = T5.Actividades5();
        for (int i=0;i<listaa5.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa5.get(i).getId()+"</td>");
           out.println("<td>"+listaa5.get(i).getValores()+"</td>");
           out.println("<td>"+listaa5.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
         <%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>¿Mostró el egresado dificultades para entablar relaciones con sus compañeros?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opción</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividades6> listaa6 = T6.Actividades6();
        for (int i=0;i<listaa6.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa6.get(i).getId()+"</td>");
           out.println("<td>"+listaa6.get(i).getDificultadesegre()+"</td>");
           out.println("<td>"+listaa6.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
         <%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>¿El egresado tenía la capacidad de comunicarse de manera efectiva a travéz del lenguaje oral<br>
            y escrito con respecto a las tareas asignadas por su empresa?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opción</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividades7> listaa7 = T7.Actividades7();
        for (int i=0;i<listaa7.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa7.get(i).getId()+"</td>");
           out.println("<td>"+listaa7.get(i).getCapacomunicarse()+"</td>");
           out.println("<td>"+listaa7.get(i).getTotal3()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
         <%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3> ¿El desempeño profesional del egresado fue de su agrado?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opción</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividades8> listaa8 = T8.Actividades8();
        for (int i=0;i<listaa8.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa8.get(i).getId()+"</td>");
           out.println("<td>"+listaa8.get(i).getAgradoprofesional()+"</td>");
           out.println("<td>"+listaa8.get(i).getTotal4()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
              <%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>¿El egresado tuvo una alta motivación para investigar y profundizar sus conocimienos??</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opción</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividades9> listaa9 = T9.Actividades9();
        for (int i=0;i<listaa9.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa9.get(i).getId()+"</td>");
           out.println("<td>"+listaa9.get(i).getMotivacionegre()+"</td>");
           out.println("<td>"+listaa9.get(i).getTotal5()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
                  <%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>¿Tomó el egresado alguna capacitación del inicio de sus actividades?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opción</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividades10> listaa10 = T10.Actividades10();
        for (int i=0;i<listaa10.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa10.get(i).getId()+"</td>");
           out.println("<td>"+listaa10.get(i).getCapacitacionegre()+"</td>");
           out.println("<td>"+listaa10.get(i).getTotal6()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
         <%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>Si la respuesta es SI, ¿Cual fue el resultado de la capacitación?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opción</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividades11> listaa11 = T11.Actividades11();
        for (int i=0;i<listaa11.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa11.get(i).getId()+"</td>");
           out.println("<td>"+listaa11.get(i).getSicapa()+"</td>");
           out.println("<td>"+listaa11.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
          <%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>Si la respuesta es SI, ¿Cual fue el resultado de la capacitación?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Opción</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividades12> listaa12 = T12.Actividades12();
        for (int i=0;i<listaa12.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa12.get(i).getId()+"</td>");
           out.println("<td>"+listaa12.get(i).getRenovarcon()+"</td>");
           out.println("<td>"+listaa12.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
    </body>
</html>
