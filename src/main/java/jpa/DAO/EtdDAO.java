package jpa.DAO;

import jpa.EtdJPA;
import java.io.Serializable;

public class EtdDAO extends JPADAO <Long, EtdJPA> {

    public EtdDAO(){
        //super(EtdJPA.class);--> don't work,why???
        super();
    }
}


