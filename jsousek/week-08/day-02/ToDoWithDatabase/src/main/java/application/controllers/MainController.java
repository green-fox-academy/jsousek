package application.controllers;

import application.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class MainController {

    ToDoInterface toDoInterface;
    UserInterface userService;

    @Autowired
    public MainController (ToDoInterface serviceClass, UserInterface userService){
        this.toDoInterface = serviceClass;
        this.userService = userService;
    }

    @Autowired
    ActiveList act;

    //Query q = new Query();



    @GetMapping("/")
    public String homepage(Model model){
        model.addAttribute("todos", toDoInterface.findAll());
        return "home";
    }

    @GetMapping("/active")
    public String notDone(Model model){
        //model.addAttribute("todos",act.listActive());
        model.addAttribute("todos", toDoInterface.findByDoneIsFalse());
        return "home";
    }

    @GetMapping("/add")
    public String addOne (){
        return "add";
    }

    @PostMapping("/add")
        public String homepageUpdated(
                @RequestParam(value ="todo" , required = false) String todo,
                @RequestParam(value="username" ,required = false) String user,
                @RequestParam(value = "email" ,required = false) String userMail){
        toDoInterface.save(ToDo.builder()
                .title(todo).
                        user(User.builder()
                                .username(user)
                                .userEmail(userMail)
                                .build())
                .urgent(false)
                .done(false)
                .build());
        return "redirect:/todo/";
    }

    @PostMapping("/delete")
    public String deleteOne (@RequestParam(value ="id") long id){
       // long idNr = Long.parseLong(id);
        toDoInterface.deleteById(id);
        return "redirect:/todo/";
    }
    @PostMapping("/{id}/edit")
    public String editOne(@PathVariable (value="id") long id, Model model){
        model.addAttribute("todo", toDoInterface.findById(id).get());
        return "edit";
    }

    @PostMapping("/{id}/edit2")
    public String submitEdit(@PathVariable (value = "id")long id,
                             @RequestParam(value = "title") String title,
                             @RequestParam(value = "urgent", required = false, defaultValue = "false") boolean urgent,
                             @RequestParam(value = "done", required = false, defaultValue = "false") boolean isDone){
        ToDo toEdit = toDoInterface.findById(id).get();
        toEdit.setDone(isDone);
        toEdit.setUrgent(urgent);
        toEdit.setTitle(title);
        toDoInterface.save(toEdit);
        return"home";
    }

   @GetMapping("/author")
    public String selectAuthor(){
        return "author";
   }

   @PostMapping("/author")
    public String filterAfterSection(@RequestParam(value="author") String author, Model model){
        model.addAttribute("todos", toDoInterface.findByUserUsername(author));

        return "home";
   }

   @PostMapping("/search")
    public String searchToDo( @RequestParam (value="") String search, Model model){
        if (search.isEmpty()){
            return "redirect/";}
        else {
            model.addAttribute("todos", toDoInterface.findAllByTitleContains(search));
        }
        return "home";
   }


}
