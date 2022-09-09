package jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProfJPA extends UserJPA{

     //Long id;
     //String name;
    //String email;
    String matiere;

    public ProfJPA (){
        super();
    }
    public ProfJPA (  String matiere) {
        //this.name = nameProf;
       // this.email = emailProf;
        this.matiere = matiere;

    }

    /**public Long getId() {
        return id;
    }

    public void setId(Long idProf) {
        this.id= idProf;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameProf) {
        this.name = nameProf;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String emailProf) {
        this.email = emailProf;
    }*/

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
