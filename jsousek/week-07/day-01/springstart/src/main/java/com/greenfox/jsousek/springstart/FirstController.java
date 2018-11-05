package com.greenfox.jsousek.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @RequestMapping("")
    @ResponseBody// without template
    public String index(){
        return "<h2>Hello user</h2>";
    }
}
