/*package com.example.todoapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapp.model.Todo;
import com.example.todoapp.repository.TodoRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TodoController {

	@Autowired
	TodoRepository todoRepository;
	
	@GetMapping("/list-all-todos")
	public Page<Todo> getAllTodosList(@RequestParam(defaultValue="0") int page) {
		return todoRepository.findAll(new PageRequest(page, 2));
	}
	
	@GetMapping("/todos")
	public List<Todo> getAllTodos() {
		Sort sortByCreatedDtDesc = new Sort(Sort.Direction.DESC, "createdDt");
		return todoRepository.findAll(sortByCreatedDtDesc);
	}
	
	@PostMapping("/todos")
	public Todo createTodo(@RequestBody Todo todo) {
		todo.setCompleted(false);
		return todoRepository.save(todo);
	}
	
	@GetMapping(value="/todos/{id}")
	public ResponseEntity<Todo> getTodoById(@PathVariable("id") String id) {
		Todo todo = todoRepository.findOne(id);
		
		if(todo == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(todo,HttpStatus.OK);
		}
	}
	
	@PutMapping(value="/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable("id") String id, @Valid @RequestBody Todo todo) {
		Todo todoData = todoRepository.findOne(id);
		
		if(todoData == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		todoData.setTitle(todo.getTitle());
		todoData.setCompleted(todo.isCompleted());
		Todo updatedTodo = todoRepository.save(todoData);
		return new ResponseEntity<>(updatedTodo,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/todos/{id}")
	public void deleteTodo(@PathVariable("id") String id) {
		todoRepository.delete(id);
	}
}
*/