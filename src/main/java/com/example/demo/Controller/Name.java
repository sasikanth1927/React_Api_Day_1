package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {	
	private String name="Iamneo";
	@GetMapping("show")
	public String display()
	{
		return "Welcome "+name+"!";
	}
}