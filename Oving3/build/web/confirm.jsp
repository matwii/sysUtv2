<%-- 
    Document   : payment
    Created on : 21.aug.2015, 10:17:45
    Author     : nilstes
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    List<String> handlekurv = (List<String>) session.getAttribute("handleKurv");
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Betaling</title>
        <style type="text/css">
    .container {
        width: 500px;
        clear: both;
    }
    .container input {
        width: 100%;
        clear: both;
    }

    </style>
    </head>
    <body>
        <h1>Butikken sin</h1>
        <h2>Handlekurv</h2>
        <ul>
            <% 
                for(int i=0; i<handlekurv.size(); i++) { 
                    out.print("<li>" + handlekurv.get(i) + "</li>");
                 }   
            %>
        </ul>   
        <h2>Bekreft kjøp</h2>
        <div class="container">
        <form method="POST" action="receipt.jsp">
            Fornavn: <input type ="text" name="fornavn"><br>
            Etternavn: <input type="text" name="etternavn"><br>
            Adresse: <input type="text" name="adresse"><br>
            postnr: <input type="text" name="postNr"><br>
            <input type="submit" value="Bekreft Kjøp">
        </form>
        </div>    
    </body>
</html>
