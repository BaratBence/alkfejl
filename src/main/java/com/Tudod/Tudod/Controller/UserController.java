package com.Tudod.Tudod.Controller;

import com.Tudod.Tudod.DataModel.User;
import com.Tudod.Tudod.Repositories.UserRepository;
import com.Tudod.Tudod.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository ur;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/welcome";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user) {
        User tmp=ur.findByUsername(user.getUsername());
        if(tmp!=null) if(tmp.getPassword().equals(user.getPassword())) return "redirect:/welcome";
        return  "login";
    }

    @GetMapping({"/", "/welcome"})
    public User welcome(Model model) {

        return ur.findByUsername("a");

    }
}

