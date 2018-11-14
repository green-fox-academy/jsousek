package application.controllers;

import application.ActiveList;
import application.ToDo;
import application.ToDoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
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

    @Autowired
    ActiveList act;

    Query q = new Query();

    List<ToDo> todos = new ArrayList<>();

    @GetMapping("/home")
    public String homepage(Model model){
        model.addAttribute("todos", serviceClass.findAll());
        return "home";
    }

    @GetMapping("/active")
    public String notDone(Model model){
        model.addAttribute("todond",act.listActive());
        return "active";
    }

    @GetMapping("/add")
    public String addOne (){
        return "add";
    }
    @PostMapping("/home")
        public String homepageUpdated (@RequestParam(value ="todo") String todo){
        serviceClass.save(ToDo.builder().title(todo).urgent(false).done(false).build());
        return "redirect:/"+  "?name="+ todo;
    }

    @PostMapping("/delete{id}")
    public String deleteOne (@PathVariable long id){
        serviceClass.deleteById(id);
        return "home";
    }


}
