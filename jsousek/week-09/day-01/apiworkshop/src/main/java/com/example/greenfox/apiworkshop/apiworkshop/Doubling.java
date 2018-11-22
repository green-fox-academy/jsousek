package com.example.greenfox.apiworkshop.apiworkshop;

import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Component
public class Doubling {
    Integer received;
    //String returned;

    Integer result;

    public String getTwice (String input){
        int i = Integer.parseInt(input)*2;
        String s = String.valueOf(i);
        return  s;
    }

    public Integer doubleOfTwoInteger(Integer i){
        return i*2;

    }
}
