package com.lx.eureka.client.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lx.eureka.client.user.service.UserService;

@RestController
public class TestController {
	
	@Autowired
	private UserService	userService;

	@RequestMapping("/userLogin")
	public String login() {
		for(int i = 0; i < 10; i++) {
			userService.login(i);
		}
		return "系统提示：";
	}

}
