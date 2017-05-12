<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% HttpSession objsesion = request.getSession(true);
    String  u = (String)objsesion.getAttribute("user");
    Object user = objsesion.getAttribute("user");    
    if(user == null){
        response.sendRedirect("index.jsp");  
    }
%>
<html lang=es_es.utf-8 class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>UV: Sistema de Encuestas Vinculación</title>
		<meta name="description" content="Blueprint: Horizontal Drop-Down Menu" />
		<meta name="keywords" content="horizontal menu, microsoft menu, drop-down menu, mega menu, javascript, jquery, simple menu" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/default.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
                	<link rel="stylesheet" href="css/footer-basic-centered.css">

		<script src="js/modernizr.custom.js"></script>
	</head>
	<body>
		<div class="container">
			<header class="clearfix">
                                <span>Universidad Veracruzana</span>
				<h1>Sistema de Encuestas Vinculación</h1>
                           
       				<nav>
					<a href="NewServlet" class="icon-arrow-left" data-info="Cerrar Sesión">Cerrar Sesión</a>
				</nav>
			</header>	
			<div class="main">
				<nav id="cbp-hrmenu" class="cbp-hrmenu">
					<ul>
						<li>
							<a href="#">Encuestas</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>Egresados </h4>
										<ul>
											<li><a href="Encuesta1.jsp">Encuesta de seguimiento a egresados</a></li>
											<li><a href="Encuesta4.jsp">Encuesta de seguimiento a recien egresados</a></li>
										</ul>
									</div>
									<div>
										<h4>Empleadores</h4>
										<ul>
											<li><a href="Encuesta2.jsp">Encuesta para empleadores</a></li>
											
										</ul>
									</div>
									<div>
										<h4>Servicio Social</h4>
										<ul>
											<li><a href="Encuesta3.jsp">Encuesta para Servicio Social</a></li>
											
										</ul>				
									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">Resultados</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>Egresados </h4>
										<ul>
											<li><a href="resultados1.jsp">Encuesta de seguimiento a egresados</a></li>
											<li><a href="resultados4.jsp">Encuesta de seguimiento a recien egresados</a></li>
										</ul>
									</div>
									<div>
										<h4>Empleadores</h4>
										<ul>
											<li><a href="resultados2.jsp">Encuesta para empleadores</a></li>
											
										</ul>
									</div>
									<div>
										<h4>Servicio Social</h4>
										<ul>
											<li><a href="resultados3.jsp">Encuesta para Servicio Social</a></li>
											
										</ul>				
									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">Gráficas</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>Egresados </h4>
										<ul>
											<li><a href="Grafica1.jsp">Encuesta de seguimiento a egresados</a></li>
											<li><a href="Grafica4.jsp">Encuesta de seguimiento a recien egresados</a></li>
										</ul>
									</div>
									<div>
										<h4>Empleadores</h4>
										<ul>
											<li><a href="Grafica2.jsp">Encuesta para empleadores</a></li>
											
										</ul>
									</div>
									<div>
										<h4>Servicio Social</h4>
										<ul>
											<li><a href="Grafica3.jsp">Encuesta para Servicio Social</a></li>
											
										</ul>				
									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">Descargas</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>Egresados </h4>
										<ul>
											<li><a href="https://onedrive.live.com/?id=6659C939614CB285!224&cid=6659C939614CB285">Encuesta de seguimiento a egresados</a></li>
											<li><a href="https://onedrive.live.com/?id=6659C939614CB285!224&cid=6659C939614CB285">Encuesta de seguimiento a recien egresados</a></li>
										</ul>
									</div>
									<div>
										<h4>Empleadores</h4>
										<ul>
											<li><a href="https://onedrive.live.com/?id=6659C939614CB285!224&cid=6659C939614CB285">Encuesta para empleadores</a></li>
											
										</ul>
									</div>
									<div>
										<h4>Servicio Social</h4>
										<ul>
											<li><a href="https://onedrive.live.com/?id=6659C939614CB285!224&cid=6659C939614CB285">Encuesta para Servicio Social</a></li>
											
										</ul>				
									</div>
                                                                    <div>
										<h4>Documentos</h4>
										<ul>
											<li><a href="https://www.uv.mx/latex/filosofia/aviso-de-privacidad/">Aviso de privacidad</a></li>
											
										</ul>				
									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">Administración</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>Usuarios</h4>
										<ul>
											<li><a href="registro_admins.jsp">Alta de Usuarios</a></li>
										</ul>
                                                                                <ul>
											<li><a href="veUsuario.jsp">Consulta de Usuarios</a></li>
										</ul>
									</div>
									 <div>
										
										
									</div> 
									
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
					</ul>
				</nav>
			</div>
		</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script src="js/cbpHorizontalMenu.min.js"></script>
		<script>
			$(function() {
				cbpHorizontalMenu.init();
			});
		</script>
                <footer class="footer-basic-centered">

			<p class="footer-company-motto">Facultad de Ingeniería de la Universidad Veracruzana</p>

			<p class="footer-links">
				<a href="#">Iván Xchel Hernández Gracía</a>
				·
				<a href="#">José Luis Rosas Leal</a>
			</p>

			<p class="footer-company-name">Copyright  &copy; 2017</p>

		</footer>
	</body>
</html>
