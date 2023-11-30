package com.admin.microservice.intercom;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("USER-MICROSERVICE")
public interface UserInterface {
	@GetMapping("/user/getAll")
	public List<String> getAllUsers();
}
