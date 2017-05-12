$ (function(){
$('#Encuesta1').click(function(e){
    e.preventDefault();
    var nombre = $('#nombre').val();
    var correo = $('#correo').val();
    var option1 = $('input:radio[name=option1]:checked').val();
    var option2 = $('input:radio[name=option2]:checked').val();
    var data={
        nombre:nombre,//pregunta nombre
        correo:correo,//pregunta correo
        option1:option1,//pregunta 1
        option2:option2//pregunta 2
    };                 
    alert(nombre + correo + option1 + option2+"h1");//solo para prueba
            $.post("Encuesta1",data,function(res,est,jqXHR){     
                 alert(res);   //respuesta   
        });     
      
});
});