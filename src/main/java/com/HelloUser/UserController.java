package com.HelloUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    public static final List<User> userList = new ArrayList<>();
       
    // Start page
    @GetMapping("/")
    public String getStartPage() {
        return "start";
    }

    @GetMapping("/user")
    public String getUserList(Model model) {
        model.addAttribute("userList", userList);
        return "user";
    }

    @GetMapping("/newmember")
    String getNewMember(Model model) {
        model.addAttribute("userList", new User(null, null, null, 0));
        return "newmember";
    }

    // Save new user
    @PostMapping("/user")
    String newUser(@RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("email") String email) {
        System.out.println("Postmapping newmember " + fname + " " + lname + " " + email);
        userList.add(new User(fname, lname, email, userList.size() + 1));
        return "redirect:/newmember";
    }

    // Remove User
    @GetMapping("/remove-user/{userId}")
    String removeUser(@PathVariable int userId){
        System.out.println("remove item : " + userId);
        userList.removeIf(user -> user.getId() == userId);
        return "redirect:/user";
    }

}
