package jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProfJPA extends UserJPA implements Serializable {

   private String matiere;

    public ProfJPA (){
        super();
    }
    public ProfJPA (String matiere) {

        this.matiere = matiere;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public List <RdvJPA> rendezvous = new ArrayList<RdvJPA>();

    @OneToMany (mappedBy = "prof", cascade = CascadeType.PERSIST)
    public List<RdvJPA> getRendezvous() {
        return rendezvous;
    }
    public void setRendezvous(List<RdvJPA> rendezvous) {
        this.rendezvous = rendezvous;
    }

}
