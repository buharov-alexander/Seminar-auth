package com.example.csrf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private int counter = 0;

	@PostMapping("counter/increase")
	public String changeCounter() {
		counter++;
		return "Increase counter: " + counter;
	}

}
