package com.microservice.AppMicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/somu")
public class SomuController {

	
	@GetMapping("/welcome")
	public String getMessage() {
		
		return "Welcome to MicroServices";
	}
}
