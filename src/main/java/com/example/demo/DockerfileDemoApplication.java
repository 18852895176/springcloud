package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerfileDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerfileDemoApplication.class, args);
	}
	
	@RequestMapping("/docker") 	
	public String getDocker() {
<<<<<<< HEAD
		return "欢迎进入docker---3445346---"; 
=======
		return "欢迎进入docker---23534---"; 
>>>>>>> 644799f7f37608278fcc97d8a651fe5acf1846f4
	}

}
