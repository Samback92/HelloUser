package com.HelloUser.hellouser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
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

    @GetMapping ("/")
    public String startPage() {
        System.out.println("Mapping from Startpage!");
        return "start";
    }

    @GetMapping ("/login")
    public String loginPage() {
        System.out.println("Mapping from Loginpage!");
        return "login";
    }

}