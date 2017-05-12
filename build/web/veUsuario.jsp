<%@page import="User.show"%>
<%@page import="User.Usuario"%>
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
	<title>Usuarios</title>
	<meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
              <link rel="stylesheet" type="text/css" href="css/tabla2.css" />
            
</head>

<body><header class="clearfix">
				<nav>
					<a href="menu.jsp" class="icon-arrow-left" data-info="Retroceder">Pagina previa</a>
				</nav>
			</header>
    <h1>Usuarios </h1>
    
         
        <div class="table-title">
        <h3>tabla de usuarios registrados</h3>
        </div>
        <table class="table-fill">
        <thead>
        <tr>
        <th class="text-left">Id</th>
        <th class="text-left">Usuario</th>
        <th class="text-left">Contraseña</th>
        </tr>
        </thead>
        <tbody class="table-hover">
                <%
        LinkedList<Usuario> listae1 = show.Usuario();
        for (int i=0;i<listae1.size();i++)
        {
           out.println("<tr>");
           out.println("<td>"+listae1.get(i).getId_Usuario()+"</td>");
           out.println("<td>"+listae1.get(i).getUsuario()+"</td>");
           out.println("<td>"+listae1.get(i).getPass()+"</td>");
           out.println("</tr>");
        }
        %>
        </tbody>
        </table>
<%--         FIN DE UNA TABLA          --%>   
 </body>

</html>