package com.springboot.first.app;

public class Student {
	
	//If you want to create a class as Java Bean class
	//then make sure to getter-setter methods for these instance variables
	
	private String firstName;
	private String lastName;
	
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
