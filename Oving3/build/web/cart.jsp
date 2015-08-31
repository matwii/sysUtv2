<%-- 
    Document   : cart
    Created on : 21.aug.2015, 10:13:36
    Author     : nilstes
--%>

<%@page import="javax.ejb.Handle"%>
<%@page import="shop.Handlekurv"%>
<%@page import="shop.Vareutvalg"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // todo: Denne skal hentes fra sesjonen
    // Hvis den ikke eksisterer i sesjonen må vi opprette ny og legge i sesjonen
    List<String> handlekurv = (List<String>) session.getAttribute("handleKurv");
    if (handlekurv == null){
        handlekurv = new ArrayList();
    }
    
    if (request.getParameter("item") != null){
        handlekurv.add(request.getParameter("item"));
    }
    
    session.setAttribute("handleKurv", handlekurv);
    // todo: Sjekk om det er parametre i requesten og legg isåfall til varen i handlekurven
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Butikken sin</title>
    </head>
    <body>
        <h1>Butikken sin</h1>
        <a href="confirm.jsp">Til betaling</a>
        <h2>Innhold i handlevogn:</h2>
        <ul>
            <% 
                for(int i=0; i<handlekurv.size(); i++) { 
                    out.print("<li>" + handlekurv.get(i) + "</li>");
                 }   
            %>
        </ul>
        <h2>Legg til ny vare:</h2>
        <form method="POST" action="cart.jsp">
            <select name="item">
                <% 
                    List<String> varer = Vareutvalg.getVareliste();
                    for(int i=0; i<varer.size(); i++) { 
                        out.print("<option>" + varer.get(i) + "</option>");
                    }
                %>
            </select>
            <input type="submit" value="Legg til">
        </form>
    </body>
</html>
