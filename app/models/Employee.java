package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {

    // Properties
    @Id
    public Long id;
    @Constraints.Required
    public String name;
    @ManyToOne()
    @JoinColumn(name = "did")
    public int dep;

    @ManyToMany(cascade =CascadeType.ALL, mappedBy = "employees")
    public List<Project> projects;
    @Constraints.Required
    public String address;
    @Constraints.Required
    public String startdate;
    @Constraints.Required
    public double salary;

    public List<Long> catSelect = new ArrayList<Long>();

    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);


    public static final List<Employee> findAll() {

        return Employee.find.all();
    }
    // Default Constructor
    public Employee() {
    }

    // Constructor to initialise object
    public Employee(Long id, String name, String address, String startdate, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.startdate = startdate;
        this.salary = salary;
    }

    // Accessor methods
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDep(int dep) {
        this.dep = dep;
    }
    public int getDep() {
        return dep;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String  getStartdate() {
        return startdate;
    }
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public List<Long> getCatSelect(){
        return catSelect;
    }

}
    