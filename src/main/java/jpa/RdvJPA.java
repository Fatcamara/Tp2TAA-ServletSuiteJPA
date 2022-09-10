package jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Entity
public class RdvJPA implements Serializable {

    private Long idRdv;

    private Date date;

   private Time time;

     ProfJPA prof = new ProfJPA();

     EtdJPA etudiant = new EtdJPA();

    public RdvJPA (){
    }
    public RdvJPA (Long idRdv, String name, String email ) {
        this.idRdv = idRdv;
        this.date= date;
        this.time= time;
    }
    @Id
    @GeneratedValue
    public Long getIdRdv() {
        return idRdv;
    }

    public void setIdRdv(Long id) {
        this.idRdv = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Time getTime() {
        return time;
    }

    public void setTime(Time name) {
        this.time = time;
    }

    @ManyToOne
       ProfJPA getProf() {
        return prof;
    }
    public void setProf(ProfJPA prof) {
        this.prof = prof;
    }

    @ManyToOne
    public EtdJPA getEtudiant() {
        return etudiant;
    }
    public void setEtudiant(EtdJPA etudiant) {
        this.etudiant = etudiant;
    }

}
