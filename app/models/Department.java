package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department extends Model{
    @Id
    private Long id;

    @Constraints.Required
    private String name;



    private String code;

    public Department() {
    }

    public Department(Long id, String name, String em) {
        this.id = id;
        this.name = name;
        this.code = em;
    }


    public static final Finder<Long, Department> find = new Finder<>(Department.class);
    
    public static final List<Department> findAll() {
        return Department.find.all();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    public String getCode(){
        return this.code;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public void setCode(String e) {
        this.code = e;
    }




}