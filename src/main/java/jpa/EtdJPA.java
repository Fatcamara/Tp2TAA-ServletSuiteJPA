package jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "Etudiants")--> si on choisissait Table-per-classe ds UserJPA
public class EtdJPA extends UserJPA implements Serializable {

     private int anneeScol;

    private String filiere;

    public EtdJPA (){
        super();
    }
    public EtdJPA ( int anneeScol, String filiere) {

        this.anneeScol= anneeScol;
        this.filiere = filiere;
    }

    public int getAnneeScol() {
        return anneeScol;
    }

    public void setAnneeScol(int anneeScol ){
        this.anneeScol = anneeScol;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere ){
        this.filiere = filiere;
    }

    public   List <RdvJPA> rendezvous = new ArrayList<RdvJPA>();

    @OneToMany (mappedBy = "etudiant", cascade = CascadeType.PERSIST)
    public List<RdvJPA> getRendezvous() {
        return rendezvous;
    }
    public void setRendezvous(List<RdvJPA> rendezvous) {
        this.rendezvous = rendezvous;
    }
}
