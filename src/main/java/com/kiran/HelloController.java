package com.kiran;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/")
	public String greet() {
		
		System.out.println("greet");
		return "hello world";
	}

}
