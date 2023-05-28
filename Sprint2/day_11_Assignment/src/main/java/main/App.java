package main;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Student;
import useCases.MyConfig;

public class App {
	 public static void main(String[] args) {
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

	        List<String> cities = context.getBean("cities", List.class);
	        System.out.println("Cities: " + cities);

	        List<Student> students = Arrays.asList(
	                context.getBean("student1", Student.class),
	                context.getBean("student2", Student.class),
	                context.getBean("student3", Student.class),
	                context.getBean("student4", Student.class),
	                context.getBean("student5", Student.class)
	        );
	        System.out.println("Students: " + students);

	        context.close();
	    }
}
