package jpa.DAO;

import jpa.EtdJPA;

public class EtdDAO extends JPADAO <Long, EtdJPA> {

    public EtdDAO(){
        super(EtdJPA.class);
        //super();
    }
}


