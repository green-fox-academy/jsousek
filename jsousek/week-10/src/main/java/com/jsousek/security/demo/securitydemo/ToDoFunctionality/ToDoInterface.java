package com.jsousek.security.demo.securitydemo.ToDoFunctionality;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ToDoInterface extends JpaRepository<ToDoModel, Long> {

    @Override
    List<ToDoModel> findAll();
}
