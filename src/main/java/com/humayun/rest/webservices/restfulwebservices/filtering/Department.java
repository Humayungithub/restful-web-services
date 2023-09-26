package com.humayun.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("DepartmentFilter")
public class Department {
    private String department1;
    private String department2;
    //@JsonIgnore
    private String department3;

    //Constructor
    public Department(String department1, String department2, String department3) {
        super();
        this.department1 = department1;
        this.department2 = department2;
        this.department3 = department3;
    }

    //Getters
    public String getDepartment1() {
        return department1;
    }

    public String getDepartment2() {
        return department2;
    }

    public String getDepartment3() {
        return department3;
    }

    //ToString

    @Override
    public String toString() {
        return "Department{" +
                "department1='" + department1 + '\'' +
                ", department2='" + department2 + '\'' +
                ", department3='" + department3 + '\'' +
                '}';
    }
}
