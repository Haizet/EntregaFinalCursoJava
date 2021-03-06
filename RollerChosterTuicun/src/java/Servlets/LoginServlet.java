
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String usuario = request.getParameter("email") ;
        String contra = request.getParameter("contrasena");
        Controladora control = new Controladora();
        
        
        
        boolean exist = false;
        exist = control.checkIngreso(usuario,contra);
        
        
        if (exist){
            Usuario usu = new Usuario();
            usu = control.getUsuario(usuario, contra);
            Cliente cliente = new Cliente();
            cliente = control.getInfoCliente(usu);            
            response.sendRedirect("index.jsp");
            HttpSession myses = request.getSession(true);
            myses.setAttribute("usuario", usuario);
            myses.setAttribute("contrasena", contra);
            myses.setAttribute("nombre", cliente.getNombre());
            myses.setAttribute("apellido", cliente.getApellido());
            myses.setAttribute("edad", cliente.getEdad());
            
        }
        else
            response.sendRedirect("loginerror.jsp");
            
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
