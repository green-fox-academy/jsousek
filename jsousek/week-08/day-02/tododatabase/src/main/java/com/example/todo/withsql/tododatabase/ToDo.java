package com.example.todo.withsql.tododatabase;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder

@Entity
public class ToDo {
    @Id
    long id;
    String title;
    boolean urgent;
    boolean done;
}
