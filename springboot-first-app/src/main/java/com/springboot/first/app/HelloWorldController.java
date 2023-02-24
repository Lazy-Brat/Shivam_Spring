package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponsesBody
@RestController
public class HelloWorldController {
	
	//GET HTTP Method
	//http://localhost:8080/hello-world
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	//get
	//post
	//put
	//delete

}
