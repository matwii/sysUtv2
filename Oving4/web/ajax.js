/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
    jQuery("#button").click(function (){
       var msg = $("#melding").val();
       jQuery.post("http://localhost:8080/Oving4/service.jsp", { input : msg});
    });
    
    var interval = setInterval(function (){
       $.get("http://localhost:8080/Oving4/service.jsp", function (data){
          $("#retrieve").html(data); 
       }); 
    }, 3000);
});     