package com.saltech.testwebatrioapi.service;

import com.saltech.testwebatrioapi.models.Personne;
import com.saltech.testwebatrioapi.repo.PersonneRepo;
import com.saltech.testwebatrioapi.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

@Service
public class PersonneImpl {

    @Autowired
    private PersonneRepo personneRepo;

    public Iterable<Personne> getPersonnes(){
        Iterable<Personne> lisPersonnes = personneRepo.findAll();

        for (Personne personne: lisPersonnes) {

        }

        return lisPersonnes;
    }

    public Personne savePersonne(Personne personne) throws Exception{
        if (personne.calculateAge(LocalDate.now()) <150 ){
            return  personneRepo.save(personne);
        }else{
            throw new Exception("La personne à plus de 150 ans");
        }
    }
}
