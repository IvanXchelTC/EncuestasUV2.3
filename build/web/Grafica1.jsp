<%@page import="tablas1.Dificultad1"%>
<%@page import="tablas1.R2"%>
<%@page import="tablas1.R1"%>
<%@page import="tablas1.Empleo1"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
                  <link rel="stylesheet" type="text/css" href="css/tabla2_1.css" />

	<script type="text/javascript" src="dist/jquery-1.12.0.min.js"></script>
	<script type="text/javascript" src="dist/Chart.bundle.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
              var dato=document.getElementById("dato1").value;
              var dato1=document.getElementById("dato2").value;
              var dato2=document.getElementById("dato3").value;
              var dato3=document.getElementById("dato4").value;
              var dato4=document.getElementById("dato5").value;
		var datos = {
			type: "pie",
			data : {
				datasets :[{
					data : [
						dato,
						dato1,
						dato2,
						dato3,
						dato4,
					],
					backgroundColor: [
						"#F7464A",
						"#3b5998",
						"#FDB45C",
						"#949FB1",
                                                "#yellow",
					],
				}],
				labels : [
					"menos de 6 meses",
					"6 a 9 meses",
					"9 a 12 meses",
					"mas de un año",
					"aun sin trabajo",
				],
			},
			options : {
				responsive : true,
			}
		};

		var canvas = document.getElementById('chart').getContext('2d');
		window.pie = new Chart(canvas, datos);
	});
	</script>
        
</head>
<body><header class="clearfix">
				<nav>
					<a href="menu.jsp" class="icon-arrow-left" data-info="Retroceder">Pagina previa</a>
				</nav>
			</header>
    
	<div id="canvas-container" style="width:50%;">
            <a>Tiempo que transcurrio en consieguir el primer empleo</a>
		<canvas id="chart" width="500" height="350"></canvas>
	</div>
        <%
        LinkedList<Empleo1> listae1 = R1.Empleo1();
        int dato11=listae1.size();
       String array[] = new String[10]; 
        for (int i=0;i<listae1.size();i++)
        {      
          array[i]= listae1.get(i).getTotal();
 
        }
        out.println("<input type='hidden' id='dato1' value='"+array[0]+"'>");
        out.println("<input type='hidden' id='dato2' value='"+array[1]+"'>");
        out.println("<input type='hidden' id='dato3' value='"+array[2]+"'>");
        out.println("<input type='hidden' id='dato4' value='"+array[3]+"'>");
        out.println("<input type='hidden' id='dato5' value='"+array[4]+"'>");
        %>
        <%--         FIN DE UNA TABLA          --%>     
        <script type="text/javascript" src="dist/jquery-1.12.0.min.js"></script>
	<script type="text/javascript" src="dist/Chart.bundle.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
              var dato=document.getElementById("dato1").value;
              var dato1=document.getElementById("dato2").value;
              var dato2=document.getElementById("dato3").value;
              var dato3=document.getElementById("dato4").value;
		var datos = {
			type: "pie",
			data : {
				datasets :[{
					data : [
						dato,
						dato1,
						dato2,
						dato3,
						
					],
					backgroundColor: [
						"#F7464A",
						"#3b5998",
						"#FDB45C",
                                                "#yellow",
					],
				}],
				labels : [
					"no esta titulado",
					"no domina el inglés",
					"falta de experiencia",
					"ser egresado de su universidad",
				],
			},
			options : {
				responsive : true,
			}
		};

		var canvas = document.getElementById('chart').getContext('2d');
		window.pie = new Chart(canvas, datos);
	});
	</script>
	<div id="canvas-container" style="width:50%;">
            <a>Tiempo que transcurrio en consieguir el primer empleo</a>
		<canvas id="chart" width="500" height="350"></canvas>
	</div>
        <%
        LinkedList<Dificultad1> listaDificil = R2.Dificultad1();
        int dato12=listae1.size();
        for (int i=0;i<listaDificil.size();i++)
        {
            array[i]=listae1.get(i).getTotal();
        }
         out.println("<input type='hidden' id='dato1' value='"+array[0]+"'>");
        out.println("<input type='hidden' id='dato2' value='"+array[1]+"'>");
        out.println("<input type='hidden' id='dato3' value='"+array[2]+"'>");
        out.println("<input type='hidden' id='dato4' value='"+array[3]+"'>");
        
        %>
        <%--         FIN DE UNA TABLA          --%>    
</body>
</html>