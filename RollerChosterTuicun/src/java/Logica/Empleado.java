package Logica;


import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Empleado extends Persona {        
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    int idEmpleado;
    @Basic
    boolean perm = true;
    @OneToOne(cascade = CascadeType.PERSIST)
    Usuario unUsuario;

    public Empleado() {
    }

    public Empleado(int idEmpleado, Usuario unUsuario, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.idEmpleado = idEmpleado;
        this.unUsuario = unUsuario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public boolean isPerm() {
        return perm;
    }

    public void setPerm(boolean perm) {
        this.perm = perm;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getApellido() {
        return apellido;
    }
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public int getEdad() {
        return edad;
    }
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
