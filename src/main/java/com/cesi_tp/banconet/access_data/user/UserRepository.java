package com.cesi_tp.banconet.access_data.user;

import org.springframework.data.repository.CrudRepository;

import com.cesi_tp.banconet.access_data.user.User;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}