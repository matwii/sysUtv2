/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
                // Bind opp tabellen mot rest-ressursen '/kunder'
                $('#myTable').DataTable( {
                    ajax: {
                        url: 'rest/kunder',
                        dataSrc: ''
                    },                  
                    columns: [
                        { data: 'id' },
                        { data: 'navn' }
                    ]
                });
                
                // Slett rest-ressursen '/kunder/kundeId'
                $("#delete").click(function () {
                    $.ajax({
                        url: 'rest/kunder/' + $("#deleteId").val(),
                        type: 'DELETE',
                        success: function(result) {
                            $('#myTable').DataTable().ajax.reload();
                        }
                    });
                });
                
                // Lag ny rest-ressursen under '/kunder/'
                $("#create").click(function () {
                    $.ajax({
                        url: 'rest/kunder',
                        type: 'POST',
                        data: JSON.stringify({
                            id: $("#newId").val(),
                            navn: $("#newName").val(),
                        }),
                        contentType: 'application/json; charset=utf-8',
                        dataType: 'json',
                        success: function(result) {
                            $('#myTable').DataTable().ajax.reload();
                        }
                    });
                });
                
                //Oppdater rest-ressurs
                $("#update").click(function(){
                    $.ajax({
                        url: 'rest/kunder',
                        type: 'PUT',
                        data: JSON.stringify({
                            id: $("#updateId").val(),
                            navn: $("#updateNavn").val(),
                        }),
                        contentType: 'application/json; charset=utf-8',
                        dataType: 'json',
                        success: function(result) {
                            $('#myTable').DataTable().ajax.reload();
                        }
                    });
                });
            });
