<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="conexGrafica.lp2"%>
<%@page import="conexGrafica.Dificil"%>
<%@ page language="java" %>
<%@ page import = "java.util.LinkedList"%> 
<html>
<body>
<h1>Consulta a base de datos</h1>
<table border="1">
<tr>
<td>id</td>
<td>razones</td>
<td>cantidad</td>
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
</table>
</body>
</html>