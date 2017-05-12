<%@page import="tablas4.A22"%>
<%@page import="tablas4.Actividad22"%>
<%@page import="tablas4.Actividad22"%>
<%@page import="tablas4.A21"%>
<%@page import="tablas4.Actividad21"%>
<%@page import="tablas4.A20"%>
<%@page import="tablas4.Actividad20"%>
<%@page import="tablas4.A19"%>
<%@page import="tablas4.Actividad19"%>
<%@page import="tablas4.A18"%>
<%@page import="tablas4.Actividad18"%>
<%@page import="tablas4.A17"%>
<%@page import="tablas4.Actividad17"%>
<%@page import="tablas4.A16"%>
<%@page import="tablas4.Acividad16"%>
<%@page import="tablas4.A15"%>
<%@page import="tablas4.Actividad15"%>
<%@page import="tablas4.A14"%>
<%@page import="tablas4.Actividad14"%>
<%@page import="tablas4.A13"%>
<%@page import="tablas4.Actividad13"%>
<%@page import="tablas4.A12"%>
<%@page import="tablas4.Actividad12"%>
<%@page import="tablas4.A11"%>
<%@page import="tablas4.Actividad11"%>
<%@page import="tablas4.A10"%>
<%@page import="tablas4.Actividad10"%>
<%@page import="tablas4.A9"%>
<%@page import="tablas4.Actividad9"%>
<%@page import="tablas4.A8"%>
<%@page import="tablas4.Actividad8"%>
<%@page import="tablas4.A7"%>
<%@page import="tablas4.Actividad7"%>
<%@page import="tablas4.A6"%>
<%@page import="tablas4.Actividad6"%>
<%@page import="tablas4.A5"%>
<%@page import="tablas4.Actividad5"%>
<%@page import="tablas4.A4"%>
<%@page import="tablas4.Actividad4"%>
<%@page import="tablas4.A3"%>
<%@page import="tablas4.Actividad3"%>
<%@page import="tablas4.A2"%>
<%@page import="tablas4.Actividad2"%>
<%@page import="tablas4.A1"%>
<%@page import="tablas4.Actividad1"%>
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
    <h1>FORMATO PARA EL SEGUIMIENTO DE RECIEN EGRESADO</h1>
    
 
        <div class="table-title">
            <h3> ¿cuál es es su agrado de satisfacción respecto a las siguientes instalaciones del  campus?</h3><BR>
        <h3>BAÑOS</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad1> listaa1 = A1.Actividad1();
        for (int i=0;i<listaa1.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa1.get(i).getId()+"</td>");
           out.println("<td>"+listaa1.get(i).getBanio()+"</td>");
           out.println("<td>"+listaa1.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
        
<%--         FIN DE UNA TABLA          --%>

    <div class="table-title">
        <h3>AULA MAGNA</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad2> listaa2 = A2.Actividad2();
        for (int i=0;i<listaa2.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa2.get(i).getId()+"</td>");
           out.println("<td>"+listaa2.get(i).getSalamagna()+"</td>");
           out.println("<td>"+listaa2.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

  <div class="table-title">
        <h3>SALA DE USOS MULTIPLES</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad3> listaa3 = A3.Actividad3();
        for (int i=0;i<listaa3.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa3.get(i).getId()+"</td>");
           out.println("<td>"+listaa3.get(i).getSalamultiples()+"</td>");
           out.println("<td>"+listaa3.get(i).getTotal3()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

<div class="table-title">
        <h3>SALA DE USOS MULTIPLES</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad4> listaa4 = A4.Actividad4();
        for (int i=0;i<listaa4.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa4.get(i).getId()+"</td>");
           out.println("<td>"+listaa4.get(i).getSalacomputo()+"</td>");
           out.println("<td>"+listaa4.get(i).getTotal4()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

<div class="table-title">
        <h3>LABORATORIOS</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad5> listaa5 = A5.Actividad5();
        for (int i=0;i<listaa5.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa5.get(i).getId()+"</td>");
           out.println("<td>"+listaa5.get(i).getLaboratorios()+"</td>");
           out.println("<td>"+listaa5.get(i).getTotal5()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

<div class="table-title">
        <h3>EQUIPAMETO ( TALLERES)</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad6> listaa6 = A6.Actividad6();
        for (int i=0;i<listaa6.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa6.get(i).getId()+"</td>");
           out.println("<td>"+listaa6.get(i).getEspaciosexpe()+"</td>");
           out.println("<td>"+listaa6.get(i).getTotal6()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

<div class="table-title">
        <h3>¿Las maquinas de computo eran suficuinetes para el alumnado?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad7> listaa7 = A7.Actividad7();
        for (int i=0;i<listaa7.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa7.get(i).getId()+"</td>");
           out.println("<td>"+listaa7.get(i).getMaquinasinsu()+"</td>");
           out.println("<td>"+listaa7.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

<div class="table-title">
        <h3>¿El espacio de la sala era el adecuado para alumnos?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad8> listaa8 = A8.Actividad8();
        for (int i=0;i<listaa7.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa8.get(i).getId()+"</td>");
           out.println("<td>"+listaa8.get(i).getSalasadecu()+"</td>");
           out.println("<td>"+listaa8.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

<div class="table-title">
        <h3>¿Los equipos se encontraban en buenestado?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad9> listaa9 = A9.Actividad9();
        for (int i=0;i<listaa7.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa9.get(i).getId()+"</td>");
           out.println("<td>"+listaa9.get(i).getBuenestado()+"</td>");
           out.println("<td>"+listaa9.get(i).getTotal3()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
            <h3>AULAS<BR></h3>
        <h3>¿Eran suficientes aulas para los alumnos ?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad10> listaa10 = A10.Actividad10();
        for (int i=0;i<listaa10.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa10.get(i).getId()+"</td>");
           out.println("<td>"+listaa10.get(i).getSuficientes()+"</td>");
           out.println("<td>"+listaa10.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
            
        <h3>¿El espacio era acorde para la cantidad de alumnos?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad11> listaa11 = A11.Actividad11();
        for (int i=0;i<listaa11.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa11.get(i).getId()+"</td>");
           out.println("<td>"+listaa11.get(i).getEspaciosacor()+"</td>");
           out.println("<td>"+listaa11.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>
        
        <div class="table-title">
            
        <h3>¿El inmobiliario (mesas,sillas,pizarron) se encontraban en  buen estado?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad12> listaa12 = A12.Actividad12();
        for (int i=0;i<listaa12.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa12.get(i).getId()+"</td>");
           out.println("<td>"+listaa12.get(i).getInmobiliariobueno()+"</td>");
           out.println("<td>"+listaa12.get(i).getTotal3()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
            <h3>EQUIPAMIENTO ( TALLERES)<BR></h3>
        <h3>¿El equipo brindado por la institucion fue el suficiente en su trayectoria escolar?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad13> listaa13 = A13.Actividad13();
        for (int i=0;i<listaa13.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa13.get(i).getId()+"</td>");
           out.println("<td>"+listaa13.get(i).getEquipobrin()+"</td>");
           out.println("<td>"+listaa13.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
            
        <h3>¿El equipo se encontraba en buenas condiciones para su uso??</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad14> listaa14 = A14.Actividad14();
        for (int i=0;i<listaa14.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa14.get(i).getId()+"</td>");
           out.println("<td>"+listaa14.get(i).getEquipobueno()+"</td>");
           out.println("<td>"+listaa14.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
        <h3>FORMACIÓN ACADÉMICA<BR></h3>
        <h3>¿La informacion proporcionada por parte del profesorado<BR>
            sobre la actividad docente me resulto facil de (objetivos,actividades,bibliografias,criterios y sistemas de evaluacio)<BR>
             me resultaron de facil acceso y utilidad ?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad15> listaa15 = A15.Actividad15();
        for (int i=0;i<listaa15.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa15.get(i).getId()+"</td>");
           out.println("<td>"+listaa15.get(i).getInformacionfacil()+"</td>");
           out.println("<td>"+listaa15.get(i).getTotal1()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
       
        <h3>¿El profesorado consiguio despertar intereses por <br>
            los diferentes temas que se trataron en el desarrollo de la actividad docente?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Acividad16> listaa16 = A16.Acividad16();
        for (int i=0;i<listaa16.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa16.get(i).getId()+"</td>");
           out.println("<td>"+listaa16.get(i).getInteresprofesor()+"</td>");
           out.println("<td>"+listaa16.get(i).getTotal2()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
       
        <h3>¿Se utilizo adecuadamente los recursos didacticos  <br>
            (audiovisuales, del laboratorio, de campo etc) para facilitar el aprendizaje?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad17> listaa17 = A17.Actividad17();
        for (int i=0;i<listaa17.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa17.get(i).getId()+"</td>");
           out.println("<td>"+listaa17.get(i).getUtilizacionrecursos()+"</td>");
           out.println("<td>"+listaa17.get(i).getTotal3()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
       
        <h3>¿El metodo de evaluacion fue acorde a los criterios <br>
            que se establecieron al iniciar cada periodo ?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad18> listaa18 = A18.Actividad18();
        for (int i=0;i<listaa18.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa18.get(i).getId()+"</td>");
           out.println("<td>"+listaa18.get(i).getMetodosevaluacion()+"</td>");
           out.println("<td>"+listaa18.get(i).getTotal4()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
       
        <h3>¿Los contenidos explicados en cada experiencia fueron utiles o  acordes para mi preparacion?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad19> listaa19 = A19.Actividad19();
        for (int i=0;i<listaa19.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa19.get(i).getId()+"</td>");
           out.println("<td>"+listaa19.get(i).getContenidosutiles()+"</td>");
           out.println("<td>"+listaa19.get(i).getTotal5()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
       
        <h3>¿Los contenidos explicados en cada experiencia fueron utiles o  acordes para mi preparacion?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad20> listaa20 = A20.Actividad20();
        for (int i=0;i<listaa20.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa20.get(i).getId()+"</td>");
           out.println("<td>"+listaa20.get(i).getPlancompleto()+"</td>");
           out.println("<td>"+listaa20.get(i).getTotal6()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
       
        <h3>¿El profesor era puntual al impartir clases?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad21> listaa21 = A21.Actividad21();
        for (int i=0;i<listaa21.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa21.get(i).getId()+"</td>");
           out.println("<td>"+listaa21.get(i).getProfesorpuntual()+"</td>");
           out.println("<td>"+listaa21.get(i).getTotal7()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>

        <div class="table-title">
       
        <h3>¿El docente motivaba la participacion en clases?</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Calidad</th>
        <th class="text-left">Total</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Actividad22> listaa22 = A22.Actividad22();
        for (int i=0;i<listaa22.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listaa22.get(i).getId()+"</td>");
           out.println("<td>"+listaa22.get(i).getMotivaciondocente()+"</td>");
           out.println("<td>"+listaa22.get(i).getTotal8()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>



</body>
</html>