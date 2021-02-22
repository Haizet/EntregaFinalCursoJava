package Persistencia;

import Logica.Cliente;
import Logica.Empleado;
import Logica.Entrada;
import Logica.Horario;
import Logica.Juego;
import Logica.Persona;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    ClienteJpaController cliJPA = new ClienteJpaController();
    EmpleadoJpaController empleJPA = new EmpleadoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    HorarioJpaController horJPA = new HorarioJpaController();
    EntradaJpaController entJPA = new EntradaJpaController();
    JuegoJpaController jueJPA = new JuegoJpaController();
    
    

    public List<Usuario> getUsuarios() {
        return usuJPA.findUsuarioEntities();
    }


    public void createCliente(Cliente cli) {
        cliJPA.create(cli);
        
    }
    public List<Cliente> getCliente() {
        return cliJPA.findClienteEntities();
    }

    public void createJuego(Juego jue) {
        jueJPA.create(jue);
    }

    public void editCliente(Cliente cliente, Usuario usuario) {
        try {
            cliJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            usuJPA.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteCliente(int cliente, int usuario) {
        try {
            cliJPA.destroy(cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            usuJPA.destroy(usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createEmpleado(Empleado emple) {
        empleJPA.create(emple);
    }

    public void createHorario(Horario horario) {
        horJPA.create(horario);
    }

    public List<Empleado> getEmpleado() {
        return empleJPA.findEmpleadoEntities();
    }

    public List<Juego> getJuegos() {
        return jueJPA.findJuegoEntities();
    }
    
   
}
