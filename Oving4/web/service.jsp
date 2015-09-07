<%-- 
    Document   : service
    Created on : 04.sep.2015, 18:49:18
    Author     : Matz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" language="java">
        <title>JSP Page</title>
        <%!
             String message = "Hey!";
        %>
        
        <%
             String test = request.getMethod();
             if (test.equals("GET")){
                 response.setContentType("text/plain");
                 out.println(message);
             } else if (test.equals("POST")){
                 response.setContentType("text/plain");
                 message = request.getParameter("input");
             } else {
                 response.setStatus(400);
             }
        %>
    </head>
    <body></body>
</html>
        