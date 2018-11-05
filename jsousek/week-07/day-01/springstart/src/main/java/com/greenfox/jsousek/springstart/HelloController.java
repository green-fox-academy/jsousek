package com.greenfox.jsousek.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping ("/web/greeting")
    public String greetings (Model model){
        model.addAttribute("name", "World");
        return "greeting";
    }
}
