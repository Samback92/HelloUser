package com.HelloUser.hellouser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloUserPageController {
    
    @GetMapping("/user")
    String getStart(Model model) {
        model.addAttribute("users", HelloUserApplication.helloUserPage.users);
        return "user";

    }

}
