package com.jsousek.security.demo.securitydemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "/index")
    public String homepage(){
        return "home";
    }
    @GetMapping(value = "/text")
    public String textPage(){
        return "text";
    }
}
