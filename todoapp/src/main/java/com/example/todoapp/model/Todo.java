/*package com.example.todoapp.model;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection="todos")
@JsonIgnoreProperties(value= {"createdDt"}, allowGetters = true)
public class Todo {
	
	@Id
	private String id;
	
	@NotBlank
	@Size(max=100)
	@Indexed(unique=true)
	private String title;
	
	private boolean isCompleted = false;
	
	private Date createdDt = new Date();
	
	public Todo() {
		super();
	}
	
	public Todo(String title) {
		this.title = title;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean isCompleted() {
		return isCompleted;
	}
	
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	public Date getCreatedDt() {
		return createdDt;
	}
	
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", isCompleted=" + isCompleted + ", createdDt=" + createdDt
				+ "]";
	}

}
*/