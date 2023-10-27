package com.HelloUser.hellouser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {
    
    public static HelloUserPage helloUserPage = new HelloUserPage("Användarsidan");
    
    static {
        helloUserPage.addUser("Sam", "Backlund", "sam.backlund@outlook.com", "admin");
        helloUserPage.addUser("Nils", "Backman", "Nils@outlook.com", "najs4400");
        helloUserPage.addUser("Samia", "Berg", "samia@outlook.com", "kulan2");

    }

    public static void main(String[] args) {
        SpringApplication.run(HelloUserApplication.class, args);
    }

}