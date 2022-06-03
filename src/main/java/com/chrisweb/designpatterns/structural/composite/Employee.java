package com.chrisweb.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        this.subordinates.add(e);
    }

    public void remove(Employee e) {
        this.subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return this.subordinates;
    }

    public String toString() {
        return ("Employe : [name : " + name + ", dept : " + dept + ", salary : " + salary + "]");
    }
}
