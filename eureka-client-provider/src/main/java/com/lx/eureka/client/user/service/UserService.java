package com.lx.eureka.client.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {

	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@RequestMapping("/login")
	public String login(@RequestParam("count") int count) {
		logger.info("provider " + count);
		return "登录成功！！！";
	}
}
