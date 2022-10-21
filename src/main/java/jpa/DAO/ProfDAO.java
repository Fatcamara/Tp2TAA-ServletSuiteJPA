package jpa.DAO;

import jpa.ProfJPA;

import java.util.List;

public class ProfDAO extends JPADAO <Long, ProfJPA>{
    public ProfDAO(){
        super(ProfJPA.class);

    }

    public List<ProfJPA> getallProf (){
       return this.entityManager.createNamedQuery("professeurs",ProfJPA.class).getResultList();
    }

}





