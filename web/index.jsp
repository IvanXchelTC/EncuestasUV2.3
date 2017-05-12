<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript" src="js/js.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>      
        <link rel="stylesheet" type="text/css" href="css/style.css"/> 
    </head>
    <body>
        <div class="login-page">
            <div class="form">
             <IMG  SRC="imagenes/uv.png"   WIDTH="238" HEIGHT="200"/>
             <form method="post" action="alo" class="login-form">
             <input type="text" placeholder="Usuario" name="user"/>
             <input type="password" placeholder="Contraseña" name="pass"/>
             <button>login</button>
               <%-- <p class="message">No recuerda la contraseña? <a href="repass.jsp">Restablecer</a></p> --%>
            </form>
  </div>
</div>
        
    </body>
</html>

