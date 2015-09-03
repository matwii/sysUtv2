<%-- 
    Document   : newjsp
    Created on : 19.aug.2015, 10:55:11
    Author     : nilstes
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%  
        List<String> handlekurv = (List<String>) session.getAttribute("handleKurv");
        session.setAttribute("firstName", request.getParameter("fornavn"));
        session.setAttribute("lastName", request.getParameter("etternavn"));
        session.setAttribute("adress", request.getParameter("adresse"));
        session.setAttribute("postNr", request.getParameter("postNr"));
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kvittering</title>
    </head>
    <body>
        <h1>Butikken sin</h1>
        <h2>Kvittering på kjøpet</h2>
        <h3>kjøpte varer</h3>
            <% 
                for(int i=0; i<handlekurv.size(); i++) { 
                    out.print(handlekurv.get(i) + "<br>");
                 }   
            %>
            <h3>personopplysninger</h3>
            Fornavn: <% out.println(session.getAttribute("firstName"));%> <br>
            Etternavn: <% out.println(session.getAttribute("lastName"));%> <br>
            Adresse: <% out.println(session.getAttribute("adress"));%> <br>
            Postnummer: <% out.println(session.getAttribute("postNr"));%> <br>
    </body>
</html>
