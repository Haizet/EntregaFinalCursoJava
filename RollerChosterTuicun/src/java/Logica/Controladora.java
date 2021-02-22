package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void startup(){
            Usuario usu1 = new Usuario();
            usu1.setNombre_usuario("joseperez@gmail.com");
            usu1.setContrasena("123456");
            Usuario usu2 = new Usuario();
            usu2.setNombre_usuario("mariasuarez@gmail.com");
            usu2.setContrasena("123456");
            Usuario usu3 = new Usuario();
            usu3.setNombre_usuario("JuanComas@gmail.com");
            usu3.setContrasena("123456");
            Usuario usu4 = new Usuario();
            usu4.setNombre_usuario("pedropereyra.com");
            usu4.setContrasena("123456");
            Usuario usu5 = new Usuario();
            usu5.setNombre_usuario("eugerivas@gmail.com");
            usu5.setContrasena("123456");
            Usuario usu6 = new Usuario();
            usu6.setNombre_usuario("camilarodriguez@gmail.com");
            usu6.setContrasena("123456");

            Empleado emple1 = new Empleado();
            emple1.setNombre("Jose");
            emple1.setApellido("Perez");
            emple1.setEdad(25);
            emple1.setUnUsuario(usu1);

            Empleado emple2 = new Empleado();
            emple2.setNombre("Maria");
            emple2.setApellido("Suarez");
            emple2.setEdad(28);
            emple2.setUnUsuario(usu2);

            Empleado emple3 = new Empleado();
            emple3.setNombre("Juan");
            emple3.setApellido("Comas");
            emple3.setEdad(34);
            emple3.setUnUsuario(usu3);

            Empleado emple4 = new Empleado();
            emple4.setNombre("Pedro");
            emple4.setApellido("Pereyra");
            emple4.setEdad(31);
            emple4.setUnUsuario(usu4);

            Empleado emple5 = new Empleado();
            emple5.setNombre("Euge");
            emple5.setApellido("Rivas");
            emple5.setEdad(50);
            emple5.setUnUsuario(usu5);

            Empleado emple6 = new Empleado();
            emple6.setNombre("Camila");
            emple6.setApellido("Rodriguez");
            emple6.setEdad(22);
            emple6.setUnUsuario(usu6);
            
            Horario horario1 = new Horario();
            horario1.setHapertura(9);
            horario1.setHclausura(13);
            horario1.setTurno("Manaña");
            
            Horario horario2 = new Horario();
            horario2.setHapertura(14);
            horario2.setHclausura(17);
            horario2.setTurno("Tarde");
            
            Horario horario3 = new Horario();
            horario3.setHapertura(18);
            horario3.setHclausura(22);
            horario3.setTurno("Noche");
          
            Juego jue1 = new Juego();
            jue1.setNombrejuego("Calecita");
            jue1.setEdadmin(1);
            jue1.setCantidad(20);
            jue1.setUnHorario(horario1);

            List<Empleado> listEmple = new ArrayList <Empleado> ();
            listEmple.add(emple1);
            jue1.setListEmpleado(listEmple);

            Juego jue2 = new Juego();
            jue2.setNombrejuego("Zamba");
            jue2.setEdadmin(12);
            jue2.setCantidad(20);
            jue2.setUnHorario(horario2);

            List<Empleado> listEmple2 = new ArrayList <Empleado> ();
            listEmple2.add(emple2);
            listEmple2.add(emple3);
            jue2.setListEmpleado(listEmple2);

            Juego jue3 = new Juego();
            jue3.setNombrejuego("Montaña Truza");
            jue3.setEdadmin(18);
            jue3.setCantidad(10);
            jue3.setUnHorario(horario3);

            List<Empleado> listEmple3 = new ArrayList <Empleado> ();
            listEmple3.add(emple4);
            listEmple3.add(emple5);
            listEmple3.add(emple6);
            jue3.setListEmpleado(listEmple3);
            controlPersis.createEmpleado(emple1);
            controlPersis.createEmpleado(emple2);
            controlPersis.createEmpleado(emple3);
            controlPersis.createEmpleado(emple4);
            controlPersis.createEmpleado(emple5);
            controlPersis.createEmpleado(emple6);
            controlPersis.createHorario(horario1);
            controlPersis.createHorario(horario2);
            controlPersis.createHorario(horario3);
            controlPersis.createJuego(jue1);
            controlPersis.createJuego(jue2);
            controlPersis.createJuego(jue3);
    }
            
        
    public boolean checkIngreso(String usuario, String contra) {
       boolean exist = false;
       List <Usuario> listUsu = new ArrayList <Usuario> ();
       listUsu = controlPersis.getUsuarios();
       
       for (Usuario usu:listUsu){
           if(usu.getNombre_usuario().equals(usuario) && usu.getContrasena().equals(contra)){
               exist = true;
               return exist;
           }
       }
       return exist;
    }


    public void createCliente(String nombre, String apellido, String edad, String email, String pw) {
        Usuario usu = new Usuario();
        usu.setNombre_usuario(email);
        usu.setContrasena(pw);
        Cliente cli = new Cliente();
        cli.setNombre(nombre);
        cli.setApellido(apellido);
        cli.setEdad(Integer.parseInt(edad));
        cli.setUnUsuario(usu);
        cli.setListEntrada(null);
        controlPersis.createCliente(cli);
    }

    public void crearJuego() {
        Juego jue= new Juego(1,"calesita",3,20,null,null,null);
        controlPersis.createJuego(jue);
    }

    public Cliente getInfoCliente(Usuario usu) {
        List <Cliente> listCli = new ArrayList <Cliente> ();
       listCli = controlPersis.getCliente();
        String email = usu.getNombre_usuario();
        String pw = usu.getContrasena();
       
       
       for (Cliente cli:listCli){
           Usuario usu1= cli.getUnUsuario();
           String email1 = usu1.getNombre_usuario();
           String contra = usu1.getContrasena();
           if(email.equals(email1) && pw.equals(contra)){
               return cli;
           }
       }
       return null;
    }

    public Usuario getUsuario(String usuario, String contra) {
       List <Usuario> listUsu = new ArrayList <Usuario> ();
       listUsu = controlPersis.getUsuarios();
       
       
       for (Usuario usu:listUsu){
           if(usu.getNombre_usuario().equals(usuario)){
               return usu;
           }
       }
       return null;
    }
    
    public List <Empleado> getEmpleados(){
        List <Empleado> lista = new ArrayList <Empleado>();
        lista = controlPersis.getEmpleado();
        return lista;
    }

    public void editCliente(String nombre, String apellido, String edad, String email) {
       List <Usuario> listUsu = new ArrayList <Usuario> ();
       listUsu = controlPersis.getUsuarios();
       Usuario usuario = new Usuario();
        System.out.println(email);
       for (Usuario usu:listUsu){
           if(usu.getContrasena().equals(email)){
               usuario=usu;
               System.out.println(usuario);
           }
       }
       List <Cliente> listCli = new ArrayList <Cliente> ();
       listCli = controlPersis.getCliente();
       Cliente cliente = new Cliente();
       for (Cliente cli:listCli){
           if(cli.getUnUsuario().equals(usuario)){
               cliente = cli;
           }
       }
       cliente.setApellido(apellido);
       cliente.setEdad(Integer.parseInt(edad));
       cliente.setNombre(nombre);
       controlPersis.editCliente(cliente,usuario);
    }

    public void deleteCliente(String nombre, String apellido, String usuario, String pw) {
       List <Usuario> listUsu = new ArrayList <Usuario> ();
       listUsu = controlPersis.getUsuarios();
       Usuario usu1 = new Usuario();
        System.out.println(usuario);
       for (Usuario usu:listUsu){
           System.out.println(usu.getNombre_usuario());
           if(usu.getNombre_usuario().equals(usuario)){
               usu1=usu;
           }
       }
        System.out.println(usu1.getNombre_usuario());
       List <Cliente> listCli = new ArrayList <Cliente> ();
       listCli = controlPersis.getCliente();
        System.out.println(listCli);
       Cliente cliente = new Cliente();
       for (Cliente cli:listCli){
           if(cli.getUnUsuario().equals(usu1)){
               cliente = cli;
               System.out.println(cli.getIdCliente());
           }
       }
       int idCli = cliente.getIdCliente();
       int idUsu = usu1.getId_usuario();
        System.out.println(idCli);
        System.out.println(idUsu);
       controlPersis.deleteCliente(idCli, idUsu);
    }

    public Empleado getInfoEmpleado(Usuario usu) {
        List <Empleado> listEmp = new ArrayList <Empleado> ();
       listEmp = controlPersis.getEmpleado();
        String email = usu.getNombre_usuario();
        String pw = usu.getContrasena();
       for (Empleado emp:listEmp){
           Usuario usu1= emp.getUnUsuario();
           String email1 = usu1.getNombre_usuario();
           String contra = usu1.getContrasena();
           if(email.equals(email1) && pw.equals(contra)){
               return emp;
               
           }
       }
       return null;
    }
    public List <Juego> getJuegos(){
         return controlPersis.getJuegos();
        
    }
 
    }


