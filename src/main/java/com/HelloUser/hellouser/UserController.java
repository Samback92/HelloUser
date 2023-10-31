package com.HelloUser.hellouser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user/{userName}")
    String getUser(Model model) {
        model.addAttribute("users", HelloUserApplication.helloUserPage.users);
        System.out.println("userName: ");
        return "user";
    }

}
