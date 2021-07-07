package com.saltech.testwebatrioapi.service;

import com.saltech.testwebatrioapi.models.Personne;
import com.saltech.testwebatrioapi.repo.PersonneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneImpl {

    @Autowired
    private PersonneRepo personneRepo;

    public Iterable<Personne> getPersonnes(){
        return personneRepo.findAll();
    }

    public Personne savePersonne(Personne personne){
        //TODO age control here
        return  personneRepo.save(personne);
    }
}
