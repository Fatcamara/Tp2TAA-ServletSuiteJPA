package jpa.DAO;

import jpa.EntityManagerHelper;
import jpa.ProfJPA;

import javax.persistence.EntityManager;
import java.util.List;

public class ProfDAO extends JPADAO <Long, ProfJPA>{
    public ProfDAO(){
        super(ProfJPA.class);
        //super();
    }

    public List<ProfJPA> getallProf (){
       return this.entityManager.createNamedQuery("professeurs",ProfJPA.class).getResultList();
    }

}





