package com.jsousek.security.demo.securitydemo.Controllers;

import com.jsousek.security.demo.securitydemo.auth.UserModel;
import com.jsousek.security.demo.securitydemo.auth.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    UserRepository userRepo;

    @Autowired
    public MainController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }
    private String hashPassword(String plainTextPassword){
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt(11));
    }

    @GetMapping(value = "/index")
    public String homepage(){

        return "home";
    }
    @GetMapping(value = "/text")
    public String textPage(){

        return "text";
    }

    @GetMapping(value = "submit")
    public String addUser () {
        return "submit";
    }

    @PostMapping(value = "submit")
    public String saveUser(@RequestParam(value = "login") String login,
                           @RequestParam(value = "password") String password){
        UserModel toSave = new UserModel();
        toSave.setUsername(login);
        toSave.setPassword(hashPassword(password));
        userRepo.save(toSave);
        return "redirect:/home";
    }
}
