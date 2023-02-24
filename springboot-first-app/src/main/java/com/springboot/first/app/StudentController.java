package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	// http://localhost:8080/student
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Shivam","Raj");
	}
	
	// http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Shivam","Raj"));
		students.add(new Student("Shivam2","Raj2"));
		students.add(new Student("Shivam3","Raj3"));
		students.add(new Student("Shivam4","Raj4"));
		students.add(new Student("Shivam5","Raj5"));
		return students;
	}
	
	// http://localhost:8080/student/shivam/raj    or http://localhost:8080/student/sita/geeta
	//@PathVariable annotation
	@GetMapping("student/{firstName}/{lastName}")			//URI Template Variable
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(firstName,lastName);
	}
	
	//build rest API to handle query parameters or at request parameters
	//http://localhost:8080/student/query?firstName=Shivam&lastName=Raj
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName,lastName);
	}
	

}
