package com.example.authdefault.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private int counter = 0;

	@GetMapping("hello")
	public String helloUser() {
		return "Hello World! Counter: " + counter;
	}

	@PutMapping("counter/increase")
	public String changeCounter() {
		counter++;
		return "Increase counter: " + counter;
	}

}
