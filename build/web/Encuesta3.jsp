<%-- 
    Document   : error
    Created on : 17/05/2016, 05:31:59 PM
    Author     : Ivan_XchelHG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html">
  <title>PRESTADOR DE SERVICIO SOCIAL</title>
  <meta name="author" content="Ivan & Jose Luis">
  <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
  <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
  <link rel="stylesheet" type="text/css" media="all" href="css/styles.css">
  <link rel="stylesheet" type="text/css" media="all" href="css/switchery.min.css">
  <link rel="stylesheet" type="text/css" href="css/default.css" />
  <script type="text/javascript" src="js/switchery.min.js"></script>
</head>

<body><header class="clearfix">
				<nav>
					<a href="menu.jsp" class="icon-arrow-left" data-info="Retroceder">Pagina previa</a>
				</nav>
			</header>
  <div id="wrapper">
  
  <h1>PRESTADOR DE SERVICIO SOCIAL</h1>
  
  <form action="datos" method="post">
      <div class="col-2">
            <label>
           Nombre del prestador de servicio social:
                <input type="text" name="nombre"><br/>
                
            Programa educativo:
                <input type="text" name="programa"><br/>           
            <input type="submit" value="Terminar"> 
            </label>
            </div>
        </form>
        
        <form action="uno" method="post">
           <div class="col-2">
            <label>
           ¿Cuanto tiempo lleva requiriendo a nuestro estudiantes como prestadores<br>
           servicio social y/o práticas profesionales?<br><br>
           <div class="estilo2">
           <input type="radio" name="option" value="1" id="radio1"checked/>
            <label for="radio1">Entre 6 meses y 1 año</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option" value="2" id="radio2"checked/>
            <label for="radio2">Entre 1 año y 3 años</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option" value="3" id="radio3"checked/>
            <label for="radio3">Mas de 3 años</label><br /><br />      </div>      
            <input type="submit" value="Terminar"> 
            </label>
            </div>
       </form>
        
       <form action="dos" method="post">
           <div class="col-2">
            <label>
           Cual es su grado de sastifación general con la facultad de ingeniería<br>
           de la universidad veracruzana, respecto a sus prestadores de servicio social<br><br>
            <div class="estilo2">
            <input type="radio" name="option1" value="1" id="radio4"checked/>
            <label for="radio4">a) completamente satisfecho</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option1" value="2" id="radio5"checked/>
            <label for="radio5">B) satisfecho</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option1" value="3" id="radio6"checked/>
            <label for="radio6">C) insastifecjo</label><br /><br /></div>
              <div class="estilo2">
            <input type="submit" value="Terminar"> </div>
            </label>
            </div>
        </form>
       
       <form action="tres" method="post">   
           <div class="col-2">
            <label>
            ¿La facultad de ingeniería de la universidad veracruzana ofrece servicios esto<br>
            hablando de los estudiantes prestadores de servicio social<br>            
                      <div class="estilo2">
            <input type="radio" name="option2" value="1" id="radio7"checked/>
            <label for="radio7">de acuerdo</label><br /><br />    </div>        
            <div class="estilo2">
            <input type="radio" name="option2" value="2" id="radio8"checked/>
            <label for="radio8">en desacuerdo</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option2" value="3" id="radio9"checked/>
            <label for="radio9">no aplica</label><br /><br /></div>
            
            <input type="submit" value="Terminar"> 
            </label>
            </div>
        </form>
        
       <form action="cuatro" method="post">  
           <div class="col-2">
            <label>
           ¿Ha recomendado usted la Facultad de Ingeniería de la Universidad Veracruzana<br>
             a otras empresas, para solicitar a prestadores de servicio social?<br>
               <div class="estilo2">
            <input type="radio" name="option3" value="1" id="radio10"checked/>
            <label for="radio10">a) si</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option3" value="2" id="radio11"checked/>
            <label for="radio11">B) no</label><br /><br /></div>
            
            <input type="submit" value="Terminar"> 
            </label>
            </div>
        </form>
      
        <form action="cinco" method="post">
            <div class="col-2">
            <label>
            ¿Con nuestros prestadores de servicio social se cubren de manera general<br>
            las necesidades requeridas por su empresa<br>
                       <div class="estilo2">
            <input type="radio" name="option4" value="1" id="radio12"checked/>
            <label for="radio12">C) si</label><br /><br /></div>
                <div class="estilo2">
            <input type="radio" name="option4" value="2" id="radio13"checked/>
            <label for="radio13">D) no </label><br /><br /></div>
            
            <input type="submit" value="Terminar"> 
            </label>
            </div>
            </form>        
       
        <form action="seis" method="post">
            <div class="col-2">
            <label>
            Si la respuesta es Si, ¿En que porcentaje estima?<br>
            <div class="estilo2">
            <input type="radio" name="option5" value="1" id="radio14"checked/>
            <label for="radio14">E) 100%</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option5" value="2" id="radio15"checked/>
            <label for="radio15">a) 75%</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option5" value="3" id="radio16"checked/>
            <label for="radio16">B) 50%</label><br /><br /></div>
                            <div class="estilo2">
            <input type="radio" name="option5" value="4" id="radio17"checked/>
            <label for="radio17">D) 25%</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option5" value="5" id="radio18"checked/>
            <label for="radio18">D) 0%</label><br /><br /></div>
            <input type="submit" value="Terminar"> 
            </label>
            </div>
        </form>        
        
        <form action="siete" method="post">    
            <div class="col-2">
            <label>
            ¿Considera que la formación académica que se le proporcionó al estudiante<br>
            en la Universidad es la adecuada para realizar las funciones que su<br>
            empresa o institución requiere<br>
            <div class="estilo2">
            <input type="radio" name="option6" value="1" id="radio19"checked/>
            <label for="radio19">E) totalmente deacuerdo</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option6" value="2" id="radio20"checked/>
            <label for="radio20">a) deacuerdo</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option6" value="3" id="radio21"checked/>
            <label for="radio21">B) neutral</label><br /><br /></div>
                            <div class="estilo2">
            <input type="radio" name="option6" value="4" id="radio22"checked/>
            <label for="radio22">D) en desacuerdo</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option6" value="5" id="radio23"checked/>
            <label for="radio23">D)totalmente en desacuerdo</label><br /><br /></div>
            <input type="submit" value="Terminar"> 
            </label>
            </div>
            
        </form>
       
        <form action="ocho" method="post">   
            <div class="col-2">
            <label>
            ¿Que porcentaje de de sastifaccion tuvo con el estudiantes de acuerdo<br>
            a los requerimientos de su empresa o institucion cuando fue contratado<br>
            <div class="estilo2">
            <input type="radio" name="option7" value="1" id="radio24"checked/>
            <label for="radio24">a) 100%</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option7" value="2" id="radio25"checked/>
            <label for="radio25">b) 75%</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option7" value="3" id="radio26"checked/>
            <label for="radio26">c) 50%</label><br /><br /></div>
                            <div class="estilo2">
            <input type="radio" name="option7" value="4" id="radio27"checked/>
            <label for="radio27">d) 25%</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option7" value="5" id="radio28"checked/>
            <label for="radio28">e) 0%</label><br /><br /></div>
            <input type="submit" value="Terminar"> 
            </label>
            </div>
            
        </form>
       
        <form action="nueve" method="post">   
            <div class="col-2">
            <label>
            ¿Como evalua el comportamiento del estudiante en cuestion de valores?<br>
            <div class="estilo2">
            <input type="radio" name="option8" value="1" id="radio29"checked/>
            <label for="radio29">a) alto</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option8" value="2" id="radio30"checked/>
            <label for="radio30">b) regular</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option8" value="3" id="radio31"checked/>
            <label for="radio31">c) bajo</label><br /><br /></div>
                            <div class="estilo2">
            <input type="radio" name="option8" value="4" id="radio32"checked/>
            <label for="radio32">d) muy bajo</label><br /><br /></div>
            <input type="submit" value="Terminar"> 
            </label>
            </div>
        </form>
    
        <form action="diez" method="post">    
    <div class="col-2">
            <label>
            La capacidad del prestador del servicio social para trabajar en equipo:<br>
            <div class="estilo2">
            <input type="radio" name="option9" value="1" id="radio33"checked/>
            <label for="radio33">a) exelente</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option9" value="2" id="radio34"checked/>
            <label for="radio34">b) buena</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option9" value="3" id="radio35"checked/>
            <label for="radio35">c) regular</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option9" value="4" id="radio36"checked/>
            <label for="radio36">d) insastifactoria</label><br /><br /></div>
            <input type="submit" value="Terminar"> 
            </label>
            </div>
        </form>
           
          
        <form action="once1" method="post">      
            <div class="col-2">
            <label>
            Mostro compromiso, dedicacion, y esfuerzo al realizar el servicio social<br>
            que se le pedia<br>
            <div class="estilo2">
            <input type="radio" name="option10" value="1" id="radio37"checked/>
            <label for="radio37">a) si</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option10" value="2" id="radio38"checked/>
            <label for="radio38">B) no</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option10" value="3" id="radio39"checked/>
            <label for="radio39">C) a veces</label><br /><br /></div>
                <div class="estilo2">
            <input type="radio" name="option10" value="4" id="radio40"checked/>
            <label for="radio40">D) nunca </label><br /><br /></div>
            <input type="submit" value="Terminar"> 
            </label>
            </div>
        </form>
       
        
        <form action="doce2" method="post">  
            <div class="col-2">
            <label>
            La puntualidad es muy importante, ¿Usted tuvo la necesidad de llamar<br>
            la atencion al estudinte respecto a este tema?
            <div class="estilo2">
            <input type="radio" name="option11" value="1" id="radio41"checked/>
            <label for="radio41">a) si</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option11" value="2" id="radio42"checked/>
            <label for="radio42">b) no</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option11" value="3" id="radio43"checked/>
            <label for="radio43">c) a veces</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option11" value="4" id="radio44"checked/>
            <label for="radio44">d) nunca</label><br /><br />    </div>       
            
            <input type="submit" value="Terminar"> 
            </label>
            </div>
       </form> 
        
        <form action="trece3" method="post">  
            <div class="col-2">
            <label>
            ¿Notó organizacion y planificacion en las tareas asignadas al prestador <br>
            del servicio social<br>            
            <div class="estilo2">
            <input type="radio" name="option12" value="1" id="radio45"checked/>
            <label for="radio45">a) si</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option12" value="2" id="radio46"checked/>
            <label for="radio46">b) no</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option12" value="3" id="radio47"checked/>
            <label for="radio47">c) a veces</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option12" value="4" id="radio48"checked/>
            <label for="radio48">d) nunca</label><br /><br />    </div>       
            
            <input type="submit" value="Terminar"> 
            </label>
            </div>
       </form> 
        
        <form action="catorce4" method="post">  
            <div class="col-2">
            <label>
            ¿El estudiante hizo aportaciones significativas en el lapso que estuvo<br>   
            en la empresa<br>
            <div class="estilo2">
            <input type="radio" name="option13" value="1" id="radio49"checked/>
            <label for="radio49">a) si</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option13" value="2" id="radio50"checked/>
            <label for="radio50">b) no</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option13" value="3" id="radio51"checked/>
            <label for="radio51">c) a veces</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option13" value="4" id="radio52"checked/>
            <label for="radio52">d) nunca</label><br /><br />   </div>        
            
            <input type="submit" value="Terminar"> 
            </label>
            </div>
       </form> 
        
       <form action="quince5" method="post">  
           <div class="col-2">
            <label>
            ¿Tomo el estudiante alguna capacitacion al inicio de sus atividades <br>
            <div class="estilo2">
            <input type="radio" name="option14" value="1" id="radio53"checked/>
            <label for="radio53">a) si</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option14" value="2" id="radio54"checked/>
            <label for="radio54">b) no</label><br /><br />    </div>        
                    
            <input type="submit" value="Terminar"> 
            </label>
            </div>
       </form>  
        
        <form action="diesi6" method="post">   
            <div class="col-2">
            <label>
            Si la respuesta es SI, ¿Cual fue el resultado de la capacitacion?<br>
            <div class="estilo2">
            <input type="radio" name="option15" value="1" id="radio55"checked/>
            <label for="radio55">a) alto</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option15" value="2" id="radio56"checked/>
            <label for="radio56">b) regular</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option15" value="3" id="radio57"checked/>
            <label for="radio57">c) bajo</label><br /><br /></div>
                           <div class="estilo2"> 
            <input type="radio" name="option15" value="4" id="radio58"checked/>
            <label for="radio58">d) muy bajo</label><br /><br /></div>
            <input type="submit" value="Terminar"> 
            </label>
            </div>
        </form>
        
        <form action="diesi7" method="post">   
            <div class="col-2">
            <label>
            ¿Contrataria usted a un egresado de nuestra facultad de ingenieria en<br>
            caso de requerirlo?
            <div class="estilo2">
            <input type="radio" name="option16" value="1" id="radio59"checked/>
            <label for="radio59">a) Totalmente de acuerdo</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option16" value="2" id="radio60"checked/>
            <label for="radio60">b) de acuerdo</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option16" value="3" id="radio61"checked/>
            <label for="radio61">c) neutral</label><br /><br /></div>
                            <div class="estilo2">
            <input type="radio" name="option16" value="4" id="radio62"checked/>
            <label for="radio62">d) en desacuerdo</label><br /><br /></div>
            <div class="estilo2">
            <input type="radio" name="option16" value="5" id="radio63"checked/>
            <label for="radio63">d)Totalmente en desacuerdo</label><br /><br /></div>
            <input type="submit" value="Terminar"> 
            </label>
            </div>
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
