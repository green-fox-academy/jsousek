package com.example.greenfox.apiworkshop.apiworkshop;

import lombok.*;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Component

public class AppendA {
    String appended;
    String appenda;

    public String appendFnc(String appenda){
        StringBuilder appendBuilder = new StringBuilder(appenda);
        appendBuilder.append("a");
        return appendBuilder.toString();
    }
}
