package Logica;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Entrada implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    int id;
    @Temporal(TemporalType.TIMESTAMP)
    Date fecha;
    @OneToOne
    Horario unHorario;

    public Entrada() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public Entrada(int id, Date fecha, Horario unHorario) {
        this.id = id;
        this.fecha = fecha;
        this.unHorario = unHorario;
    }

 
 
}
