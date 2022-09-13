package jpa.DAO;

import jpa.UserJPA;

import java.util.List;

public class UserDAO extends JPADAO  <Long, UserJPA> {

    public UserDAO(){
            super(UserJPA.class);
            //super();
        }

        public List <UserJPA> getUserWithOwnership (){
        String query = "select distinct k.name from ProfJPA as k ";
            return this.entityManager.createQuery( query).getResultList();

    }



}

