package com.lx.eureka.client.user.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserService {

	@Override
	public String login(int i) {
		return "异常！！！";
	}

}
