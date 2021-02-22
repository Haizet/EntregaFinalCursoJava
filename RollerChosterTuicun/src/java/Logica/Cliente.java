package Logica;


import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    int idCliente;
    @Basic
    boolean perm = false;
    @OneToOne(cascade = CascadeType.PERSIST)
    Usuario unUsuario;
    @OneToMany
    List <Entrada> listEntrada;

    public Cliente(int idCliente, Usuario unUsuario, List<Entrada> listEntrada, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.idCliente = idCliente;
        this.unUsuario = unUsuario;
        this.listEntrada = listEntrada;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public List<Entrada> getListEntrada() {
        return listEntrada;
    }

    public void setListEntrada(List<Entrada> listEntrada) {
        this.listEntrada = listEntrada;
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
