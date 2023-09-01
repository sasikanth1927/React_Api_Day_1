package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Colour {	
	private String colour="Green";
	@GetMapping("di")
	public String display()
	{
		return "My favourite color is "+colour;
	}
}
