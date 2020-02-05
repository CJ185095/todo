package com.ncr.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncr.todo.model.ToDoList;
import com.ncr.todo.service.TodoService;

import io.swagger.annotations.ApiOperation;

@RestController
@ControllerAdvice
public class ToDoController {

	@Autowired
	TodoService toDoService;
	
	@ApiOperation(value="",notes="")
	@GetMapping(value="/api/getData")
	public Iterable<ToDoList> getData() {
		return toDoService.getData();
	}
	
	@ApiOperation(value="To insert new task",notes="")
	@PostMapping(value="/api/todo")
	public Iterable<ToDoList> setData(String task)
	{
		toDoService.setData(task);
		return getData();
	}
	
	
	@ApiOperation(value="To delete  task",notes="")
	@DeleteMapping(value="/api/todo/{id}")
	public Iterable<ToDoList> deleteData(@PathVariable long id) {
		 toDoService.deleteData(id);
		 return getData();
	}
	
	@ApiOperation(value="To Update  task",notes="")
	@PutMapping(value="/api/todo/{task}")
	public Iterable<ToDoList> updateData(@PathVariable String task)
	{
		toDoService.setData(task);
		return getData();
	}
	
	
	@ApiOperation(value="To Delete All  task",notes="")
	@DeleteMapping(value="api/todo")
	public Iterable<ToDoList> deleteAllData() {
		 toDoService.deleteAllData();
		 return getData();
	}
	
	/*
	
	
	
	
	
	
	
	
	
	*/
	
}