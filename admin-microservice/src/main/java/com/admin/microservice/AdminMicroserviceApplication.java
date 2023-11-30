package com.admin.microservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.microservice.intercom.UserInterface;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
@RequestMapping("/admin")
public class AdminMicroserviceApplication {
	
	@Autowired
	UserInterface userInterface;
	
	@GetMapping("/users")
	public List<String> getUsers(){
		return userInterface.getAllUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(AdminMicroserviceApplication.class, args);
	}

}
