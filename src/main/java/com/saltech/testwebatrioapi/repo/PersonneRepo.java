package com.saltech.testwebatrioapi.repo;

import com.saltech.testwebatrioapi.models.Personne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepo extends CrudRepository<Personne, Integer> {
}
