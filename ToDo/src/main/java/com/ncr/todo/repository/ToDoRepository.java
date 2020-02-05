package com.ncr.todo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ncr.todo.model.ToDoList;

import HQL.HibernateQuerries;

@Repository
public class ToDoRepository {
@Autowired
ToDoCrudRepository toDoCrudRepository;
HibernateQuerries hibernateQuerries;

@PersistenceContext
EntityManager em;
/*public Iterable<ToDoList> getData() {
	return toDoCrudRepository.findAll();
	}*/
public Iterable<ToDoList> getData() {
	HibernateQuerries hibernateQuerries=new HibernateQuerries(em);
	return hibernateQuerries.getData(2L);
	}

   public void setData( String task) 
   {
	  ToDoList obj=new ToDoList();
	  obj.setTask(task);
	  toDoCrudRepository.save(obj);
	
   }
   
   public void deleteData(long id) {
		 toDoCrudRepository.deleteById(id);
		
	}
   
   
   public void updateData(String task) {
		// TODO Auto-generated method stub
		ToDoList obj1=new ToDoList();
		obj1.setTask(task);
		toDoCrudRepository.save(obj1);
	}
   
   public void deleteAllData() {
		// TODO Auto-generated method stub
		toDoCrudRepository.deleteAll();
	}

/*









*/
}