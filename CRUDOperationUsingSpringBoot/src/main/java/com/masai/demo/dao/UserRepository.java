package com.masai.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.masai.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
