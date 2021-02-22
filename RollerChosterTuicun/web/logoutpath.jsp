<%-- 
    Document   : logoutpath
    Created on : Dec 20, 2020, 11:29:42 PM
    Author     : Usuario
--%>

<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
       HttpSession myses = request.getSession();
       Controladora control = (Controladora) myses.getAttribute("control");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        
        String usuario = request.getParameter("usuario");
        String pw = request.getParameter("contrasena");
                

        control.deleteCliente(nombre,apellido,usuario,pw);
        
        HttpSession ses = request.getSession(false);
        ses.invalidate();
        response.sendRedirect("index.jsp");
        %>
</html>
