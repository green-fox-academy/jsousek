package com.example.practicejson.models;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class ArrayHandler {

    Array array = new Array();

    public List<Integer> toList (int[] arr){
        List<Integer>toReturn = new ArrayList<>();
        for (int i: arr){
            toReturn.add(i);
        }
        return toReturn;
    }

    public int getSum (int[] list){
        int sum = 0;
        for (int i : list){
            sum+=i;
        }
        return sum;
    }

}
