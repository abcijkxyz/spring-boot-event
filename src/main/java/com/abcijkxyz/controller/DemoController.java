package com.abcijkxyz.controller;

import com.abcijkxyz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private UserService userService;

// http://localhost:8080/demo/register?username=hello
	@GetMapping("/register")
	public String register(String username) {
		userService.register(username);
		return "success";
	}

}
