package com.example.greenfox.apiworkshop.apiworkshop;


import lombok.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Component
public class DoUntils {
    String doUntil;
    Integer number;

    public HashMap <String, Integer> inputJSON (Integer number){
        HashMap<String, Integer> toReturn = new HashMap<>();
        toReturn.put("until", number);
        return toReturn;
    }

    public HashMap<String, Integer> factorial(HashMap <String, Integer> map){
        HashMap<String, Integer> toReturn = new HashMap<>();
        Integer calculate = map.get("until");
        int x = 1;
        for (int i = 0; i <= calculate ; i++) {
            x *= i;

        }
        toReturn.put("result", x);
        return toReturn;

    }
    public HashMap<String, Integer> sum (HashMap <String, Integer> map){
        HashMap<String, Integer> toReturn = new HashMap<>();
        Integer calculate = map.get("until");
        int x = 0;
        for (int i = 0; i < calculate; i++) {
           x += i;
        }
        toReturn.put("result", x);
        return toReturn;

    }


}


