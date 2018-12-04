package com.example.practicejson.models;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Component
public class ReturningObject {
    String result;
    int sum;
    int multiply;
    int[] doubling;
}
