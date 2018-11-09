package mainfolder.controllers;

import mainfolder.Possum;
import mainfolder.PossumList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    Possum defaultPossum;

    PossumList plist;

    @Autowired
    public MainController(PossumList serviceClass){
        this.plist = serviceClass;
        this.defaultPossum = Possum.builder().name("Ms O'Possum").drink("IPA").food("tartar steak").build();
        plist.addPossum(defaultPossum);
    }


    @GetMapping("")
    public String homePage( @RequestParam (value="name", required = false )String name, Model model){
        if(name != null){
            model.addAttribute("name",plist.getCertainPossum(name).getName());
        }
        else model.addAttribute("name", plist.getCertainPossum("Ms O'Possum").getName());
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String fromForm ( @RequestParam(value ="name") String name, String food, String drink){
        plist.addPossum(Possum.builder().name(name).food(food).drink(drink).build());
        return  "redirect:/"+ "?name="+ name;
    }

}
