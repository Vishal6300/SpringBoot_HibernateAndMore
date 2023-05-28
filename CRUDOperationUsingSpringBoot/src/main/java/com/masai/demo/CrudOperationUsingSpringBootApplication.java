package com.masai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.masai.demo.dao.UserRepository;
import com.masai.demo.model.User;

@SpringBootApplication
public class CrudOperationUsingSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(CrudOperationUsingSpringBootApplication.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class);
		
		User user1= new User();
		
		user1.setName("Vivek kumar");
		user1.setCity("Dehradun");
		user1.setStatus("Java Developer");
		
		User user= userRepository.save(user1);
		
	}

}
