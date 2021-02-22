<%-- 
    Document   : lista
    Created on : Dec 21, 2020, 5:13:44 AM
    Author     : Usuario
--%>

<%@page import="Logica.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
                    HttpSession misession = request.getSession();
        %>
 <table class="table table-bordered" id="dataTable" name="tablita" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>Nombre</th>
                      <th>Apellido</th>
                      <th>Edad</th>
                     </tr>
                  </thead>
                  
                  <tbody>
                    <tr>
                        <%		
		Controladora control = (Controladora) misession.getAttribute("control");
		List<Empleado> listaEmpleado = control.getEmpleados();
                    for (Empleado emp : listaEmpleado) { 
                %>
                      <td><%=emp.getNombre()%></td>
                      <td><%=emp.getApellido()%></td>
                      <td><%=emp.getEdad()%></td>
                      
                    </tr>
                                       
                      <% } %>
                  </tbody>
                </table>
</html>
