package com.example.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);
	}

	// ✅ Controller inside the same class
	@RestController
	class InlineController {
		@GetMapping("/")
		public String home() {
			return "✅ Welcome to Spring Boot!";
		}

		@GetMapping("/hello")
		public String hello() {
			return "👋 Hello from Spring Boot!";
		}
	}
}

//package com.example.springbootapp;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringbootappApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringbootappApplication.class, args);
//	}
//
//}
