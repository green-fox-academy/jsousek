package com.example.greenfox.apiworkshop.apiworkshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllers {

    @GetMapping(value = "/index")
    public String returnIndex(){
        return "index";
    }


}
