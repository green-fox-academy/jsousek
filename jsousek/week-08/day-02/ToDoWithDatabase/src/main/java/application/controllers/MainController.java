package application.controllers;

import application.ToDo;
import application.ToDoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class MainController {

    ToDoInterface serviceClass;
    @Autowired
    public MainController (ToDoInterface serviceClass){
        this.serviceClass = serviceClass;
    }

    List<ToDo> todos = new ArrayList<>();

    @GetMapping("home")
    public String homepage(Model model){
        model.addAttribute("todos", serviceClass.findAll());
        return "home";
    }
}
