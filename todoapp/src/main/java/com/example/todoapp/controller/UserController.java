package com.example.todoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapp.model.User;
import com.example.todoapp.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable("id") String id) {
		return userRepository.findOne(id);
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable("id") String id) {
		userRepository.delete(id);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable("id") String id, @RequestBody User user) {
		User userData = userRepository.findOne(id);
		if(userData != null) {
			userData.setName(user.getName());
			userData.setPassword(user.getPassword());
			userData.setEducation(user.getEducation());
			userData.setPrimarySkill(user.getPrimarySkill());
			userData.setSecondarySkill(user.getSecondarySkill());
			userData.setExperience(user.getExperience());
			userData.setLocation(user.getLocation());
		}
		User updatedUser = userRepository.save(userData);
		return updatedUser;
	}

}
