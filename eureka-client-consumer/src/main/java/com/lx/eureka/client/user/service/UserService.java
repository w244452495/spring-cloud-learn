package com.lx.eureka.client.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-client-provider", fallback = UserServiceFallback.class)
public interface UserService {

	@RequestMapping("/login")
	public String login(@RequestParam("count") int count);
}
