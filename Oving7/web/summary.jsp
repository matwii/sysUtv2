<%-- 
    Document   : summary
    Created on : 13.sep.2015, 20:37:01
    Author     : Matz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <a href="http://localhost:8080/Oving7/spam.jsp">Previous site</a><br>
        <a href="http://localhost:8080/Oving7/person.jsp">First site</a><br>
        
        Name: = <c:out value="${bean.name}" /><br>
        Family Name: = <c:out value="${bean.familyName}" /><br>
        Age: <c:out value="${bean.age}" /><br>
        Gender: <c:out value="${bean.gender}" /><br>
        Spam <c:out value="${bean.spam}" /><br>
    </body>
</html>
