/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function(){
    $('#Encuesta1').click(function(e){
        e.preventDefault();
        
        var option1=$('#option1').val();
        var data={option1:option1};
        $.post("primero",data,function(res,est,jqXHR){
            alert(res);
        });
        /**/
     
         var option2=$('#option2').val();
        var data={option2:option2};
        $.post("segundo",data,function(res,est,jqXHR){
            alert(res);
        });
    });
});
