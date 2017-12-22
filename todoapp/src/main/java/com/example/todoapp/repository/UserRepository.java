package com.example.todoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.todoapp.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
