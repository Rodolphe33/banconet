package com.cesi_tp.banconet.access_data.comptecourant;

import org.springframework.data.repository.CrudRepository;

import com.cesi_tp.banconet.access_data.comptecourant.CompteCourant;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CompteCourantRepository extends CrudRepository<CompteCourant, Integer> {

}