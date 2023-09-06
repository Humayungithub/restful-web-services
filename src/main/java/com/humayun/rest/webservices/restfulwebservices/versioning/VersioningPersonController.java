package com.humayun.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    //URL Versioning | /v1/person
    @GetMapping("/v1/person")
    public Personv1 getFirstVersionOfPerson(){
        return new Personv1("Humayun Ahmed");
    }
    //URL Versioning | /v2/person
    @GetMapping("/v2/person")
    public Personv2 getSecondVersionOfPerson(){
        return new Personv2(new Name("Humayun", "Ahmed"));
    }
    //Request Parameter Versioning | /person?version=1
    @GetMapping(path ="/person", params = "version=1")
    public Personv1 getFirstVersionOfPersonRequestParameter(){
        return new Personv1("Humayun Ahmed");
    }

    //Request Parameter Versioning | /person?version=2
    @GetMapping(path ="/person", params = "version=2")
    public Personv2 getSecondVersionOfPersonRequestParameter(){
        return new Personv2(new Name("Humayun", "Ahmed"));
    }
    //Custom Header Versioning | /person/header
    @GetMapping(path ="/person/header", headers = "X-API-VERSION=1")
    public Personv1 getFirstVersionOfPersonRequestHeader(){
        return new Personv1("Humayun Ahmed");
    }

    //Custom Header Versioning | /person/header
    @GetMapping(path ="/person/header", headers = "X-API-VERSION=2")
    public Personv2 getSecondVersionOfPersonRequestHeader(){
        return new Personv2(new Name("Humayun", "Ahmed"));
    }
    //Custom Header Versioning | /person/header
    @GetMapping(path ="/person/accept", produces = "application/vnd.company.app-v1+json")
    public Personv1 getFirstVersionOfPersonAcceptHeader(){
        return new Personv1("Humayun Ahmed");
    }

    //Custom Header Versioning | /person/header
    @GetMapping(path ="/person/accept", produces = "application/vnd.company.app-v2+json")
    public Personv2 getSecondVersionOfPersonAcceptHeader(){
        return new Personv2(new Name("Humayun", "Ahmed"));
    }
}
