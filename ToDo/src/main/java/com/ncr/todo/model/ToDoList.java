package com.ncr.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="todolist",schema="todo")
public class ToDoList {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private long id;
	 
	 @Column(name="Priority")
	 private boolean priority=false;
	 
	 @Column(name="Task")
	 private String task;
	 
	 public ToDoList()
	 {
		 
	 }
	 
	 public ToDoList(long Id,boolean Priority,String Task) {
		    this.id = Id;
		    this.priority = Priority;
		    this.task=Task;
		  }
	 public long getId() {
		    return id;
		  }

	 public String getTask() {
		    return task;
		  }
	 public boolean getIsPriority() {
		    return priority;
		  }

	 public void setId(long Id) {
		        this.id = Id;
		    }
	 public void setTask(String Task) 
		   {
		        this.task = Task;
		   } 
	 public void setIsPriority(Boolean Priority) {
				this.priority = Priority;
			}
	 

}
