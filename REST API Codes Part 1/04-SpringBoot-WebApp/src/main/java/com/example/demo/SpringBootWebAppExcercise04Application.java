//package com.example.demo;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
//@RestController
//public class SpringBootWebAppExcercise04Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringBootWebAppExcercise04Application.class, args);
//	}
//
//	@GetMapping("/")
//	public String welcome() {
//		return "Welcome to Nilesh-IT....||";
//	}
//
//}


package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWebAppExcercise04Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebAppExcercise04Application.class, args);
    }

    @GetMapping("/")
    public String welcome() {
        return "<html><head><link rel='stylesheet' type='text/css' href='/css/Style.css'></head>" +
                "<body>" +
                "<h1>Welcome to NILESH-IT</h1>" +
                "<p>Your future is in great hands</p>" +
                "<p>Continue your hustle, you will definitely get success soon</p>" +
                "</body></html>";
    }



    }
