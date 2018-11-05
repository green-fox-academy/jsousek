package com.greenfox.jsousek.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private AtomicLong atl = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting hello() {
        Greeting g = new Greeting(1, "Hello");
        return g;
    }

    @RequestMapping(value = "/greet")
    public Greeting hello2(@RequestParam(value = "name", defaultValue = "World") String s) {
        Greeting g2 = new Greeting(atl.getAndIncrement(), "Hello " + s);
        return g2;
    }


}


