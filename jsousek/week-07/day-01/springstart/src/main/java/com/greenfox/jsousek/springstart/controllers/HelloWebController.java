package com.greenfox.jsousek.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    private AtomicLong atl = new AtomicLong();

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag",
            "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló",
            "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public String getRandom (String[] s) {
        int rnd = new Random().nextInt(hellos.length);
        return s[rnd];
    }

    public Color getColor(){
       return new Color((int)(Math.random() * 0x1000000));
    }

    @RequestMapping("/web/greeting")
    public String greetings (Model model, @RequestParam(value = "name", defaultValue = "World") String name){
        model.addAttribute("name", name);
        model.addAttribute("counter", atl.incrementAndGet());
        model.addAttribute( "hello", getRandom(hellos));
        model.addAttribute("colour", getColor());
        return "greetings";
    }

}
