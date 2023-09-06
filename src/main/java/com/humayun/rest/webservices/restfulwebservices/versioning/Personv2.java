package com.humayun.rest.webservices.restfulwebservices.versioning;

public class Personv2 {
    private Name name;
    //Constructor
    public Personv2(Name name) {
        super();
        this.name = name;
    }
    //Getter

    public Name getName() {
        return name;
    }
    //To String

    @Override
    public String toString() {
        return "Personv2{" +
                "name=" + name +
                '}';
    }
}
