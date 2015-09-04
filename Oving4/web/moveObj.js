/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global fast */
$(document).ready(function(){
   $("#box").mouseover(function() {
        var dWidth = $(document).width(), 
            dHeight = $(document).height(),
            nextX = Math.floor(Math.random() * dWidth),
            nextY = Math.floor(Math.random() * dHeight);
        $("#box").animate({ left: nextX + 'px', top: nextY + 'px' }, "fast");
    }); 
});