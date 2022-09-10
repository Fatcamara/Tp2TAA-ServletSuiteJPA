package jpa.DAO;

import jpa.ProfJPA;

public class ProfDAO extends JPADAO <Long, ProfJPA>{
    public ProfDAO(){
        //super(PofJPA.class);--> don't work,why???
        super();
    }
}
