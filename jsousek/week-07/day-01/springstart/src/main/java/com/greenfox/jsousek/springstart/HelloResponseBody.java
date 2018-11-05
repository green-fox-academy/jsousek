package com.greenfox.jsousek.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloResponseBody {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "<h3> Hallo </h3>";
    }

}
