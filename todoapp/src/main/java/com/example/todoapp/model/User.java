package com.example.todoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	private String name;
	
	private String password;
	
	private String education;
	
	private String primarySkill;
	
	private String secondarySkill;
	
	private String experience;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	private String location;
	
	public User() {
		
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", education=" + education
				+ ", primarySkill=" + primarySkill + ", secondarySkill=" + secondarySkill + ", experience=" + experience
				+ ", location=" + location + "]";
	}

	public User(String id, String name, String password, String education, String primarySkill, String secondarySkill,
			String experience, String location) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.education = education;
		this.primarySkill = primarySkill;
		this.secondarySkill = secondarySkill;
		this.experience = experience;
		this.location = location;
	}

}
