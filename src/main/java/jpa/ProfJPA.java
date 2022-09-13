package jpa;

import jpa.DAO.JPADAO;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries(
        @NamedQuery(name="professeurs",query="select p from ProfJPA as p"))

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

    List< ProfJPA> Professeurs;
    //private EntityManager manager;


    //@NamedQuery(name="utilisateurs",query="select u from Personne as u where u.name=:name")

    /**TypedQuery<ProfJPA> q =.createQuery("select d from ProfJPA d",ProfJPA.class);
    long start = System.currentTimeMillis();
    List<ProfJPA> res = q.getResultList();*/
   // int numOfEmployees = manager.createQuery("Select a From Employee a", Employee.class).getResultList().size();


}
