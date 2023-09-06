package com.humayun.rest.webservices.restfulwebservices.versioning;

public class Personv1 {
    private String name;
    //Constructor
    public Personv1(String name) {
        super();
        this.name = name;
    }
    //Getters
    public String getName() {
        return name;
    }
    //To String
    @Override
    public String toString() {
        return "Personv1{" +
                "name='" + name + '\'' +
                '}';
    }
}
