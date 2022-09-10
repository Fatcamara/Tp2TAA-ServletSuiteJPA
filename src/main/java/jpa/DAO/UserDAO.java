package jpa.DAO;

import jpa.UserJPA;

public class UserDAO extends JPADAO  <Long, UserJPA> {

    public UserDAO(){
            //super(UserJPA.class);--> don't work,why???
            super();
        }
}
