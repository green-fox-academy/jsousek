package com.example.todo.withsql.tododatabase;

import org.springframework.data.repository.CrudRepository;

public interface ToDoInterface extends CrudRepository<ToDo, Integer> {

}
