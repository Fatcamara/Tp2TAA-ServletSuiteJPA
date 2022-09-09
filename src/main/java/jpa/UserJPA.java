package jpa;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;


import static javax.persistence.InheritanceType.JOINED;

@Entity
@Inheritance
public class UserJPA {

     Long id;

     String name;

     String email;

    public UserJPA() {
    }

    public UserJPA(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;

    }
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}

