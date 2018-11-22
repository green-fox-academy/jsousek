package com.example.practicejson.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
@Getter
@Setter

@Entity
public class Array {
    @Id @GeneratedValue
    long id;
    String what;
    int[] numbers;

}
