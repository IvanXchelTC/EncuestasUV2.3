
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html">
  <title>Encuesta Egresados </title>
  <meta name="author" content="Ivan & Jose Luis">
  <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
  <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
  <link rel="stylesheet" type="text/css" media="all" href="css/styles.css">
  <link rel="stylesheet" type="text/css" media="all" href="css/switchery.min.css">
  <link rel="stylesheet" type="text/css" href="css/default.css" />
    <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
  <script type="text/javascript" src="js/switchery.min.js"></script>
    <script type="text/javascript" src="js/send.js"></script>

</head>

<body>
    <header class="clearfix">
				<nav>
					<a href="menu.jsp" class="icon-arrow-left" data-info="Retroceder">Pagina previa</a>
				</nav>
			</header>
  <div id="wrapper">
  
  <h1>Encuesta Egresados</h1>
  
  
  <form action="guardado" method="post">
      <!Nombre del encuestado>
      <div class="col-2">
            <label>
                 Nombre
            <input placeholder="Inserte su nombre" type="text" name="nombre"><br/>
             </label>
            </div>
      <!correo del encuestado>
      <div class="col-2">
            <label>
                Correo electrico 
            <input  placeholder="ejemplo@ejemplo.com" type="text" name="correo"><br/> 
            </label>
            </div>
       <div class="col-2">
            <label>
            Tiempo que transcurrio en consieguir el primer empleo:<br>
            <!--<div class="estilo2">-->
           
            <div class="estilo2">
                <input type="radio" name="option1" value="1" id="option1" checked/>
                <label for="radio3">menos de 6 meses</label><br /><br />
             </div>
            <div class="estilo2">
                <input type="radio" name="option1" value="2" id="option1" />
                <label for="radio4">De 6 a 9 meses</label><br />
            </div>
            <div class="estilo2">
                <input type="radio" name="option1" value="3" id="option1" />
                <label for="radio5">De 9 a 12 meses</label><br />
            </div>
            <div class="estilo2">
                <input type="radio" name="option1" value="4" id="option1" />
                <label for="radio6">Mas de 1 año</label><br />
            </div>
            <div class="estilo2">
                <input type="radio" name="option1" value="5" id="option1" />
                <label for="radio7">A un no has conseguido empleo</label><br />
                
               
            </div>
            </label>
            </div>  
           
                <div class="col-2">
            <label>
            Difilcutades para conseguir empleo:<br>
            <div class="estilo2">
                <input type="radio" name="option2" value="1" id="option2" checked/>
                <label for="radio8">No estar titulado</label><br /><br />
             </div>
            <div class="estilo2">
                <input type="radio" name="option2" value="2" id="option2" />
                <label for="radio9">No dominar el ingles</label><br />
            </div>
            <div class="estilo2">
                <input type="radio" name="option2" value="3" id="option2" />
                <label for="radio10">Falta de experiencia laboral</label><br />
            </div>
            <div class="estilo2">
                <input type="radio" name="option2" value="4" id="option2" />
                <label for="radio11">Ser egresado de su universidad</label><br />
            </div>
                <div class="estilo2">
                <input type="radio" name="option2" value="5" id="option2" />
                <label for="radio12">A un no has conseguido empleo</label><br /><br>
                <a id="Encuesta1" href='#'>enviar</a>
            </div>
            </label>
            </div>  
             </form>
            
            </form>
  </div>
<script type="text/javascript">
var elems = Array.prototype.slice.call(document.querySelectorAll('.js-switch'));

elems.forEach(function(html) {
  var switchery = new Switchery(html);
});
</script>
</body>
</html>
