package BankAcc.Controllers;

import BankAcc.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
    BankAccount lion = new BankAccount("simba", 100, "lion");

    @RequestMapping("/show")
    public String display (Model model){
        model.addAttribute("name", lion.getName());
        model.addAttribute("balance", lion.getBalance());
        model.addAttribute("type", lion.getAnimalType());
        return "display";

    }

}
