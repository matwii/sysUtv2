/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global fast */
$(document).ready(function(){
   $("#box").mouseover(function() {
        var dWidth = window.innerWidth, 
            dHeight = window.innerHeight,
            nextX = Math.floor(Math.random() * dWidth),
            nextY = Math.floor(Math.random() * dHeight);
        $("#box").stop()
        $("#box").animate({ left: nextX + 'px', top: nextY + 'px' }, 1000, 'linear');
    });
    
    $("#box").click(function(){
       $("#box").stop().fadeOut(500); 
    });
});
