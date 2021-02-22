
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Juego implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    int id;
    @Basic
    String nombrejuego;
    int edadmin;
    int cantidad;
    @OneToMany
    List <Empleado> listEmpleado;
    @OneToOne
    Horario unHorario;
    @OneToMany
    List <Entrada> listEntrada;

    public Juego() {
    }

    public Juego(int id, String nombrejuego, int edadmin, int cantidad, List<Empleado> listEmpleado, Horario unHorario, List<Entrada> listEntrada) {
        this.id = id;
        this.nombrejuego = nombrejuego;
        this.edadmin = edadmin;
        this.cantidad = cantidad;
        this.listEmpleado = listEmpleado;
        this.unHorario = unHorario;
        this.listEntrada = listEntrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrejuego() {
        return nombrejuego;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public int getEdadmin() {
        return edadmin;
    }

    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public List<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado(List<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public List<Entrada> getListEntrada() {
        return listEntrada;
    }

    public void setListEntrada(List<Entrada> listEntrada) {
        this.listEntrada = listEntrada;
    }

    
}
