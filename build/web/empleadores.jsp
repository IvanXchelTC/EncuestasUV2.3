<%-- 
    Document   : empleadores
    Created on : 12/06/2016, 10:16:01 PM
    Author     : jose luis rosas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleadores</title>
    </head>
    <body>
       <h1>Encuesta para empleadores<br>Departamento de vinvulacion<br>seguimiento de egresados FIUV<br></h1>
        
       <form action="DATOS" method="post">
           Nombre:<input type="text" name="nombre"><br/>
           Carrera de la que egreso:<input type="text" name="carrera"><br/>
           Nombre de la empresa o institucion de la que labora:<input type="text" name="empresa"><br/>
           Domicilio de la empresa:<input type="text" name="domicilioE"><br/>
           Puesto que desempeña el egresado dentro de la empresa o institucion:
            <input type="text" name="puesto"><br/>
            <input type="submit" value="Terminar"> 
            </form>
       
       
        <form action="primera" method="post">
           
           ¿Consideras que las actividades que desempeña el egresado estan relacionadas con <br>
           su formación académica<br>
           <input type="radio" name="option" value="1" id="radio1"checked/>
            <label for="radio1">SI</label><br /><br />
            
            <input type="radio" name="option" value="2" id="radio2"checked/>
            <label for="radio2">NO</label><br /><br />
            <input type="submit" value="Terminar"> 
       </form>
       
       <form action="segundos" method="post">
           Si la respuesta es sí, ¿En qué porcentaje estima?<br>
            
            <input type="radio" name="option1" value="1" id="radio3"checked/>
            <label for="radio4">a) 100%</label><br /><br />
            
            <input type="radio" name="option1" value="2" id="radio4"checked/>
            <label for="radio4">B) 75%</label><br /><br />
            
            <input type="radio" name="option1" value="3" id="radio5"checked/>
            <label for="radio5">C) 50%</label><br /><br />
                
            <input type="radio" name="option1" value="4" id="radio6"checked/>
            <label for="radio6">D) 25% </label><br /><br />
            
            <input type="radio" name="option1" value="5" id="radio7"checked/>
            <label for="radio7">E) 0%</label><br /><br />
            <input type="submit" value="Terminar"> 
        </form>
       
       <form action="tercera" method="post">   
            Considera que la formación académica que se le proporcionó al egresado<br>
              en la universidad es la adecuada para realizar las funciones que su<br>
              empresa o institución requiere:<br>
            
            <input type="radio" name="option2" value="1" id="radio8"checked/>
            <label for="radio9">totalmente de acuerso</label><br /><br />
            
            <input type="radio" name="option2" value="2" id="radio9"checked/>
            <label for="radio9">de acuerdo</label><br /><br />
            
            <input type="radio" name="option2" value="3" id="radio10"checked/>
            <label for="radio10">neutral</label><br /><br />
            
            <input type="radio" name="option2" value="4" id="radio11"checked/>
            <label for="radio11">en desacuerdo</label><br /><br />
            
            <input type="radio" name="option2" value="5" id="radio12"checked/>
            <label for="radio12">totalmente en desacuerdo</label><br /><br />
            <input type="submit" value="Terminar"> 
        </form>
       
       <form action="cuarta" method="post">  
            ¿Qué porcentaje de sastifación tuvo con el egresado de acuedo a los <br>
            requerimientos de su empresa o institución cuando fue contratado?<br>
               
            <input type="radio" name="option3" value="1" id="radio13"checked/>
            <label for="radio13">a) 100%</label><br /><br />
            
            <input type="radio" name="option3" value="2" id="radio14"checked/>
            <label for="radio14">B) 75%</label><br /><br />
            
            <input type="radio" name="option3" value="3" id="radio15"checked/>
            <label for="radio15">C) 50%</label><br /><br />
                
            <input type="radio" name="option3" value="4" id="radio16"checked/>
            <label for="radio16">D) 25% </label><br /><br />
            
            <input type="radio" name="option3" value="5" id="radio17"checked/>
            <label for="radio17">E) 0%</label><br /><br />
            <input type="submit" value="Terminar"> 
        </form>
       
        <form action="quinto" method="post">
            ¿Como evalua el comportamiento del egresado en cuestión de valores?<br>
                       
            <input type="radio" name="option4" value="1" id="radio18"checked/>
            <label for="radio18">a) alto</label><br /><br />
            
            <input type="radio" name="option4" value="2" id="radio19"checked/>
            <label for="radio19">B) regular</label><br /><br />
            
            <input type="radio" name="option4" value="3" id="radio20"checked/>
            <label for="radio20">C) bajo</label><br /><br />
                
            <input type="radio" name="option4" value="4" id="radio21"checked/>
            <label for="radio21">D) muy bajo </label><br /><br />
            <input type="submit" value="Terminar"> 
            </form>
       
        <form action="sexto" method="post">
            ¿Mostró el egresado dificultades para entablar relaciones con sus compañeros?<br>
            
            <input type="radio" name="option5" value="1" id="radio22"checked/>
            <label for="radio22">E) si</label><br /><br />
            
            <input type="radio" name="option5" value="2" id="radio23"checked/>
            <label for="radio23">a) no</label><br /><br />
            
            <input type="radio" name="option5" value="3" id="radio24"checked/>
            <label for="radio24">B) a veces</label><br /><br />
                            
            <input type="radio" name="option5" value="4" id="radio25"checked/>
            <label for="radio25">D) nunca</label><br /><br />
            <input type="submit" value="Terminar"> 
        </form>
       
        <form action="sectimo" method="post">    
            ¿El egresado tenía la capacidad de comunicarse de manera efectiva a travéz del lenguaje oral<br>
            y escrito con respecto a las tareas asignadas por su empresa?<br>
            
            <input type="radio" name="option6" value="1" id="radio26"checked/>
            <label for="radio26">E) si</label><br /><br />
            
            <input type="radio" name="option6" value="2" id="radio27"checked/>
            <label for="radio27">a) no</label><br /><br />
            
            <input type="radio" name="option6" value="3" id="radio28"checked/>
            <label for="radio28">B) a veces</label><br /><br />
                            
            <input type="radio" name="option6" value="4" id="radio29"checked/>
            <label for="radio29">D) nunca</label><br /><br />
            <input type="submit" value="Terminar"> 
            
        </form>
       
        <form action="octava" method="post">   
            ¿El desempeño profesional del egresado fue de su agrado?<br>
            
            <input type="radio" name="option7" value="1" id="radio30"checked/>
            <label for="radio30">E) si</label><br /><br />
            
            <input type="radio" name="option7" value="2" id="radio31"checked/>
            <label for="radio31">a) no</label><br /><br />
            
            <input type="radio" name="option7" value="3" id="radio32"checked/>
            <label for="radio32">B) a veces</label><br /><br />
                            
            <input type="radio" name="option7" value="4" id="radio33"checked/>
            <label for="radio33">D) nunca</label><br /><br />
            <input type="submit" value="Terminar"> 
            
        </form>
       
        <form action="novena" method="post">   
            ¿El egresado tuvo una alta motivación para investigar y profundizar sus conocimienos?<br>
            
            <input type="radio" name="option8" value="1" id="radio34"checked/>
            <label for="radio34">E) si</label><br /><br />
            
            <input type="radio" name="option8" value="2" id="radio35"checked/>
            <label for="radio35">a) no</label><br /><br />
            
            <input type="radio" name="option8" value="3" id="radio36"checked/>
            <label for="radio36">B) a veces</label><br /><br />
                            
            <input type="radio" name="option8" value="4" id="radio37"checked/>
            <label for="radio37">D) nunca</label><br /><br />
            <input type="submit" value="Terminar"> 
        </form>
       
        <form action="decima" method="post">    
            ¿Tomó el egresado alguna capacitación del inicio de sus actividades?<br>
            
            <input type="radio" name="option9" value="1" id="radio38"checked/>
            <label for="radio38">E) si</label><br /><br />
            
            <input type="radio" name="option9" value="2" id="radio39"checked/>
            <label for="radio39">a) no</label><br /><br />
            <input type="submit" value="Terminar"> 
        </form>
            
        <form action="onces" method="post">      
            Si la respuesta es SI, ¿Cual fue el resultado de la capacitación?<br>
            
            <input type="radio" name="option10" value="1" id="radio40"checked/>
            <label for="radio40">a) alto</label><br /><br />
            
            <input type="radio" name="option10" value="2" id="radio41"checked/>
            <label for="radio41">B) regular</label><br /><br />
            
            <input type="radio" name="option10" value="3" id="radio42"checked/>
            <label for="radio42">C) bajo</label><br /><br />
                
            <input type="radio" name="option10" value="4" id="radio43"checked/>
            <label for="radio43">D) muy bajo </label><br /><br />
            <input type="submit" value="Terminar"> 
        </form>
       
        <form action="doce" method="post">  
            ¿Contrataría usted nuevamente a un egresado de nuestra facultad de ingeiería <br>
            en caso de requerirlo?<br>
            
            <input type="radio" name="option11" value="1" id="radio44"checked/>
            <label for="radio44">totalmente de acuerso</label><br /><br />
            
            <input type="radio" name="option11" value="2" id="radio45"checked/>
            <label for="radio45">de acuerdo</label><br /><br />
            
            <input type="radio" name="option11" value="3" id="radio46"checked/>
            <label for="radio46">neutral</label><br /><br />
            
            <input type="radio" name="option11" value="4" id="radio47"checked/>
            <label for="radio47">en desacuerdo</label><br /><br />
            
            <input type="radio" name="option11" value="5" id="radio48"checked/>
            <label for="radio48">totalmente en desacuerdo</label><br /><br />
            
            <input type="submit" value="Terminar"> 
       </form>
              
    </body>
</html>
