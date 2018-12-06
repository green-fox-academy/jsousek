package com.jsousek.security.demo.securitydemo.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<UserModel, Long > {
    UserModel findByUsername(String username);

}
