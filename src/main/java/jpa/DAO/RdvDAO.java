package jpa.DAO;

import jpa.RdvJPA;

public class RdvDAO extends JPADAO <Long, RdvJPA>{

    public RdvDAO(){
        super(RdvJPA.class);
        //super();
    }
}
