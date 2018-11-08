package mainfolder.controllers;

import mainfolder.Possum;
import mainfolder.PossumList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    PossumList plist;


    @GetMapping("")
    public String homePage(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String fromForm ( @RequestParam(value ="name") String name, String food, String drink){
        plist.addPossum(new Possum(name, food, drink));

        return  "redirect:/"+ "?name="+ name;
    }

}
