package com.ncr.todo;
/*package com.ncr.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ncr.todo.model.User;
import com.ncr.todo.service.ToDoService;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private ToDoService toDoService;

	@Override
	public void run(String... args) {
		User harry = new User("Dharmendra", "Admin");
		toDoService.saveUser(harry);
		log.info("-------------------------------");
		log.info("Finding all users");
		log.info("-------------------------------");
		for (User user : toDoService.findAll()) {
			log.info(user.toString());
		}
	}

}*/