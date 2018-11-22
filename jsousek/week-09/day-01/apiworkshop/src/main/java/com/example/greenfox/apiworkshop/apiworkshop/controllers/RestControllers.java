package com.example.greenfox.apiworkshop.apiworkshop.controllers;

import com.example.greenfox.apiworkshop.apiworkshop.AppendA;
import com.example.greenfox.apiworkshop.apiworkshop.DoUntils;
import com.example.greenfox.apiworkshop.apiworkshop.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class RestControllers {
    Doubling d;
    AppendA a;
    DoUntils dou;

    @Autowired
    public RestControllers(Doubling d, AppendA a, DoUntils dou){
        this.d = d;
        this.a = a;
        this.dou = dou;

    }



     /*@GetMapping( value = "/doubling")
    public Doubling doubleFnc(@RequestParam (value = "input") String input){
        return Doubling.builder().received(input).returned(d.getTwice(input)).build();
    } */

    @GetMapping( value = "/doubling")
    public Object doubleFnc(@RequestParam (value = "input", required = false) Integer input) {
        HashMap<String, String> errorMap = new HashMap<>();
        errorMap.put("error: ", "Please provide an input!");

        if (input == null)
            return errorMap;
        else return Doubling.builder().received(input).result(d.doubleOfTwoInteger(input)).build();
    }
       /* Integer result;
        result = 2*input;
        HashMap<String, Integer> hashMap1= new HashMap<>();

        hashMap1.put("received", input);
        hashMap1.put("result", result);

        return hashMap1;
    }*/
    @GetMapping (value ="/greeter")
    public Object greeter (@RequestParam (value ="name") String name,
                           @RequestParam (value = "title") String title){
        HashMap<String, String> emptyParamMap = new HashMap<>();
        emptyParamMap.put("","no parameters provided");
        HashMap<String,String> greetingMap = new HashMap<>();
        greetingMap.put("welcome_message: Oh, hi there", name);
        greetingMap.put("my dear", title + " !");
        if (name.equals(null) || title.equals(null)){
            return emptyParamMap;
        }
        else return greetingMap;
    }

    @GetMapping(value = "/appenda/{appendable}")
    public Object appendable (@PathVariable (value = "appendable") String toAppend){
        HashMap<String, String> toReturn = new HashMap<>();
        toReturn.put("appended", a.appendFnc(toAppend));
        return toReturn;
        }

    @GetMapping(value = "dountil/{action}/{number}")
    public Object dountil (@PathVariable(value = "action") String action,
                           @PathVariable(value = "number") Integer number){
        HashMap<String, String> emptyNumber = new HashMap<>();
        emptyNumber.put("error", "Please provide a number!");
        HashMap<String, String> emptyAction = new HashMap<>();
        emptyAction.put("error", "Please provide a action!");
        HashMap<String, Integer> inputMap = dou.inputJSON(number);
        HashMap<String, Integer> sumMap ;
        HashMap<String, Integer> factorialMap;
        if (action.equals("sum")){
            sumMap = dou.sum(inputMap);
            return sumMap;

        }
        else if (action.equals("factor")){
            factorialMap = dou.factorial(inputMap);
            return factorialMap;

        }
        else if(action == null) {
            return emptyAction;
        }
        else return emptyNumber;
    }


}
