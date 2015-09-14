/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    setInterval(function() {
    var date = new Date();
    var cuttime =  date.getHours() + ":" + date.getMinutes() ;
    $('#clock-wrapper').html(cuttime);
  $(".btnhome").click(function (){
     location.href = "index.html"; 
  });
    
  $(".btntosetalrm").click(function(){
     var alRmTime = $(".getalarmtime").val();  
     if(alRmTime){
     $('.aumkar').html(alRmTime);
     $(".alrm-main").css("display","none");
     $(".when-alrm-ring").css("display","block");
     }
        
     else{
     return false;
     }
     });
          var awesome = $(".aumkar").html();  
        
    if(awesome == cuttime){
    $(".audioDemo").trigger('play');
    }
}, 500);

   