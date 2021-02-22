<%-- 
    Document   : loader
    Created on : Dec 20, 2020, 10:18:47 PM
    Author     : Usuario
--%>

<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        Controladora control = new Controladora();
        control.startup();
        response.sendRedirect("index.jsp");
        %>
</html>
