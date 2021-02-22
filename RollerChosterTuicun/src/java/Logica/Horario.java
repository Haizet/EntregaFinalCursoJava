package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario implements Serializable {
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  int id;
  @Basic
  int hapertura;
  int hclausura;
  String turno;

    public Horario(int id, int hapertura, int hclausura, String turno) {
        this.id = id;
        this.hapertura = hapertura;
        this.hclausura = hclausura;
        this.turno = turno;
    }

    public Horario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHapertura() {
        return hapertura;
    }

    public void setHapertura(int hapertura) {
        this.hapertura = hapertura;
    }

    public int getHclausura() {
        return hclausura;
    }

    public void setHclausura(int hclausura) {
        this.hclausura = hclausura;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

  
         
}
