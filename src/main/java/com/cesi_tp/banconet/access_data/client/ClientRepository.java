package com.cesi_tp.banconet.access_data.client;

import org.springframework.data.repository.CrudRepository;

import com.cesi_tp.banconet.access_data.client.Client;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface ClientRepository extends CrudRepository<Client, Integer> {

}
