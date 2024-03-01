package com.bajaj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/get")
	public String getMsg()
	{
		return "Welcome to Akash Home";
	}

}
