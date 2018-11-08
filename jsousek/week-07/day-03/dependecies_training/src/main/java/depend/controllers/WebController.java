package depend.controllers;

import depend.EmailValidator;
import depend.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @Autowired
    UtilityService util;

    @Autowired
    EmailValidator validator;

    @GetMapping("/home")
    public String mainPage(Model model) {
        return "home";
    }

    @GetMapping("/home/color")
    public String colorPage(Model model) {
        model.addAttribute("color", util.randomColor());
        return "color";
    }

    @PostMapping("/home/email")
    public String email  (@RequestParam (value = "email")  String email, Model model) {
        model.addAttribute("email" ,validator.validate(email));
    return "email";
    }



}