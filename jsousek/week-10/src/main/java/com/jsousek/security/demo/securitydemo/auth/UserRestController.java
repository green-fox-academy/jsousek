package com.jsousek.security.demo.securitydemo.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    UserRepository userRepo;

    @Autowired
    public UserRestController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping(value= "getall")
    public List<UserModel> getAll(){
        List<UserModel>allUsers = userRepo.findAll();
        return allUsers;
    }

}
