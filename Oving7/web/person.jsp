<%-- 
    Document   : person
    Created on : 13.sep.2015, 20:01:45
    Author     : Matz
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Øving 7</title>
    </head>
    <body>
        <form action="http://localhost:8080/Oving7/spam.jsp" method="post">
            Name: <input type="text"  name="name"><br>
            Family name: <input type="text" name="familyName"><br>
            Age: <input type="text" name="age"><br>
            <input type="radio" name="gender" value="Male">Male
            <input type="radio" name="gender" value="Female">Female<br>
            <input type="submit" value="submit"><br>
            
        </form>
    </body>
</html>
