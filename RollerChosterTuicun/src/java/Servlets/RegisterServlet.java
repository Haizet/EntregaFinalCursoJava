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

@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

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
        String email = request.getParameter("email");
        String pw = request.getParameter("contrasena");
        
        Controladora control = new Controladora();
        boolean exist = false;
        exist = control.checkIngreso(email,pw);
        
        if (exist == false){
            control.createCliente(nombre, apellido, edad, email, pw);
            response.sendRedirect("index.jsp");
            HttpSession myses = request.getSession(true);
            myses.setAttribute("usuario", email);
            myses.setAttribute("contrasena", pw);
            myses.setAttribute("nombre",nombre);
            myses.setAttribute("apellido",apellido);
            myses.setAttribute("edad",edad);
        }
        else
            response.sendRedirect("registererror.jsp");
            
        }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
