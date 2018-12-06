package com.jsousek.security.demo.securitydemo.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserRepository extends JpaRepository<UserModel, Long > {

    @Override
    List<UserModel> findAll();

    UserModel findByUsername(String username);

}
