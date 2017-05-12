<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<% HttpSession objsesion = request.getSession(true);
    String  u = (String)objsesion.getAttribute("user");
    Object user = objsesion.getAttribute("user");    
    if(user == null){
        response.sendRedirect("index.jsp");  
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta de Usuarios </title>
        <link rel="stylesheet" type="text/css" href="css/css.css"/> 
    </head>
    <body>
        <div class="login-page">
            <div class="form">
             <p class="message2"> Alta de Usuarios </p>
             <IMG  SRC="imagenes/uv.png"   WIDTH="238" HEIGHT="200"/>
             <form method="post" action="almacenar" class="login-form">
             <input type="text" placeholder="Usuario" name="usuario"/>
             <input type="password" placeholder="Contraseña" name="pass"/>
             <button>Crear</button>
               <p class="message">Ya tiene usuario? <a href="menu.jsp">Regresar</a></p>
            </form>
  </div>
</div>
        
    </body>
</html>
