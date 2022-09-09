package jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EtdJPA extends UserJPA {

     //Long id;

     //String name;

     //String email;

      int anneeScol;

     String filiere;

    public EtdJPA (){
        super();
    }
    public EtdJPA ( int anneeScol, String filiere) {
        //this.id = idEtd;
        //this.name = nameEtd;
        //this.email = emailEtd;
        this.anneeScol= anneeScol;
        this.filiere = filiere;
    }

    /**public Long getId() {
        return id;
    }

    public void set(Long idEtd) {
        this.id = idEtd;
    }

    public String getName() {
        return name;
    }

    public void setNameEtd(String nameEtd) {
        this.name = nameEtd;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String emailEtd) {
        this.email = emailEtd;
    }*/

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
