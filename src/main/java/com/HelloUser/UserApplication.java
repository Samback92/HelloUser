package com.HelloUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

// Main class
@SpringBootApplication
@Controller
public class UserApplication {

    // Run application
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
