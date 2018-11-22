package com.example.practicejson.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Repository extends CrudRepository<Array, Long> {
    @Override
    List<Array> findAll();
}
