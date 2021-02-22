package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "EditUsuario", urlPatterns = {"/EditUsuario"})
public class EditUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");
        String usuario = request.getParameter("usuario");
        System.out.println(usuario);
        Controladora control = new Controladora();
        control.editCliente(nombre,apellido,edad,usuario);
        
            HttpSession myses = request.getSession(true);
        response.sendRedirect("index.jsp");
        myses.setAttribute("contrasena", pw);
        myses.setAttribute("nombre",nombre);
        myses.setAttribute("apellido",apellido);
        myses.setAttribute("edad",edad);
        myses.setAttribute("usuario", usuario);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
