package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
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
		return "欢迎进入docker"; 
	}

}
