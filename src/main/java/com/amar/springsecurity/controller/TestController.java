package com.amar.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/auth")
	public String testAuth() {
		
		return "Called successfully";
	}
	
	@RequestMapping("/authenticate")
	public String authenticate() {
		
		return "Not authenticated";
	}
}
