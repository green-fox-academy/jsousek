package com.example.practicejson.controllers;

import com.example.practicejson.models.Array;
import com.example.practicejson.models.ArrayHandler;
import com.example.practicejson.models.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllers {

    ArrayHandler arrMethods;
    Repository repository;

    @Autowired
     public RestControllers (ArrayHandler arrMethods, Repository repository){
        this.arrMethods = arrMethods;
        this.repository = repository;
    }

    @PostMapping(value = "/api")
    public ResponseEntity modifier (@RequestBody Array input) {
        if (input.getWhat().equals("sum")) {
            int sum = arrMethods.getSum(input.getNumbers());
            int[]sumArr ={sum};
            Array toReturn = new Array();
            toReturn.setNumbers(sumArr);
            toReturn.setWhat(input.getWhat());

            return new ResponseEntity<Array>(toReturn, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.I_AM_A_TEAPOT);
    }
}
