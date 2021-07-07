package com.saltech.testwebatrioapi.controllers;

import com.saltech.testwebatrioapi.models.Personne;
import com.saltech.testwebatrioapi.service.PersonneImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneController {

    @Autowired
    private PersonneImpl personneImpl;

    @PostMapping("/savePersonne")
    public Personne savePersonne(@RequestBody Personne personne) throws Exception {
        return personneImpl.savePersonne(personne);
    }

    @GetMapping("/personnes")
    public Iterable<Personne> getPersonnes(){
        return  personneImpl.getPersonnes();
    }
}
