<%-- 
    Document   : spam
    Created on : 13.sep.2015, 20:17:17
    Author     : Matz
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="bean" class="beans.Bean" scope="session"/>
<jsp:setProperty name="bean" property="*"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oving7</title>
    </head>
    <body>
        <a href="http://localhost:8080/Oving7/person.jsp">return to previous site</a><br>
        <form action="http://localhost:8080/Oving7/summary.jsp" method="get">
            Recieve spam?<input type="checkbox" id="chck" name="spam" value="true"><br>
            <input type="hidden" value="false" name="spam"/>
            <input type="submit" value="submit">
                
        </form>
    </body>
</html>
